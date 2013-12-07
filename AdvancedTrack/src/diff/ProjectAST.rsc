module diff::ProjectAST

import IO;
import List;
import Set;
import String;
import DateTime;
import Relation;

import ValueIO;
import Message;

import vis::Figure;
import vis::Render;

import util::ValueUI;

import diff::DataType;
import diff::Utils;
import diff::MethodComparison;
import cigdem::ClassLevelChanges;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;
import analysis::m3::Core;
import util::FileSystem;
import analysis::graphs::Graph;
extend analysis::m3::TypeSymbol;

public loc cacheDir = |project://AdvancedTrack/cache|;

public list[loc] projects = [
							//|project://GuavaRelease01|,
							//|project://GuavaRelease02|,
							//|project://GuavaRelease03|,
							//|project://GuavaRelease05|,
							//|project://GuavaRelease06|,
							//|project://GuavaRelease07|,
							//|project://GuavaRelease08|,
							//|project://GuavaRelease09|,
							//|project://GuavaRelease10.0|,
							//|project://GuavaRelease11.0|,
							//|project://GuavaRelease12.0|,
							//|project://GuavaRelease13.0|,
							|project://GuavaRelease14.0|,
							//|project://GuavaRelease14.0.1|,
							|project://GuavaRelease15.0|
							//|project://FerryAndroid3|,
							//|project://FerryAndroid4|
							];
public str subdirectory = "guava";
							
@logLevel {
	Log level 0 => no logging;
	Log level 1 => main logging;
	Log level 2 => debug logging;
}
private int logLevel = 2;

@doc { }
public void logMessage(str message, int level) {
	if (level <= logLevel) {
		str date = printDate(now(), "Y-MM-dd HH:mm:ss");
		println("<date> :: <message>");
	}
}

public void run() {
	logMessage("Getting m3 models...", 1);
	list[M3] models = getM3Models(projects, subdirectory);
	logMessage("Comparing m3 models... ", 1);
	list[VersionTransition] transitions = compareM3Models(models);

	// write to cache 
	logMessage("Writing to cache", 1);
	writeTransitionsToCache(transitions);
	
	logMessage("Display results", 1);
	for (VersionTransition transition <- transitions) {
		println("-------[ Transition from <transition.oldVersion> to <transition.newVersion> ]-------");
		printMethodChangeStatistics(transition.methodChanges);
	}
}

public void runCached() {
	// read from cache
	list[VersionTransition] transitions = readTransitionsFromCache();
	visualizeTransitions(transitions);
}

public loc getPackage(M3 model, loc location) {
	//|java+class:///com/google/common/collect/FilteredKeyMultimap/AddRejectingList|
	loc package = location;
	iprintln(package);
	while (!isPackage(location)) {
		package = getContainment(model, location);	
	}
	iprintln(package);
	set [loc] classes =  {c | <c,l> <- model@containment, location == l, isPackage(c) };
	iprintln(classes);
	if (size(classes) != 1) {throw ("The field should have one parent class.");}
	else { return getOneFrom(classes); }
}

public loc getClass(M3 model, loc location) {
	set [loc] classes =  {c | <c,class> <- model@containment };
	if (size(classes) != 1) {throw ("The field should have one parent class.");}
	else { return getOneFrom(classes); }
}



@doc { This function returns the differences between a list of M3 models }
public list[VersionTransition] compareM3Models(list[M3] models) {
	// precondition
	if (size(models) < 2) { throw "Precondition failed. Need more than 2 models to compare"; }
	
	list[VersionTransition] changes = [];
	
	for (int index <- [0..size(models)-1]) {
		M3 model1 = models[index];
		M3 model2 = models[index+1];
		changes += getVersionTransition(model1, model2);
	}
	return changes;
}

private VersionTransition getVersionTransition(M3 old, M3 new) {
	//Changed classes can be derived from changed methods and fields.
	set[MethodChange] methodChanges = getMethodChanges(old, new);	
	set[FieldChange] fieldChanges = getFieldChanges(old, new);
	
	//TODO: derive changed classes
	//	set[loc] publicClasses1 = getPublicClassesForModel(old);
	//	set[loc] publicClasses2 = getPublicClassesForModel(new);
	set[Change] classChanges = {};
	
	//TODO: deduce version numbers
	loc oldVersion = old.id;
	loc newVersion = new.id;
	
	return versionTransition(oldVersion, newVersion, classChanges, methodChanges, fieldChanges);
}

private void printMethodChangeStatistics(set[MethodChange] methodChanges) {
	int unchangedMethods = 0, deprecatedMethods = 0, signatureChangedMethods = 0, returnTypeChangedMethods = 0, addedMethods = 0, deletedMethods = 0;
	set[loc] changedMethods = {};
	for (MethodChange methodChange <- methodChanges) {
		visit(methodChange) {
			case unchanged(_): unchangedMethods += 1;
			
			case deprecated(locator): {
				println("\tDEPRECATED: <locator>");
				changedMethods += locator;
				deprecatedMethods += 1;
			}
			
			case signatureChanged(old,new): {
				println("\tSIGNATURE CHANGE: <old> IS NOW: <new>");
				changedMethods += locator;
				signatureChangedMethods += 1;
			}
			
			case returnTypeChanged(locator, oldType, newType): {
				println("\tRETURN TYPE CHANGE OF <locator>: <oldType> is now <newType>");
				changedMethods += locator;
				returnTypeChangedMethods += 1;
			}
			
			case added(locator): {
				println("\tADDED: <locator>");
				addedMethods += 1;
			}
			
			case deleted(locator): {
				println("\tDELETED: <locator>");
				deletedMethods += 1;
			}
		}
	}
	println("-------In total <unchangedMethods> methods are unchanged, <size(changedMethods)> methods have changed somehow, <addedMethods> methods have been added and <deletedMethods> methods have been deleted.-------");
	println("-------Regarding changes in methods: <deprecatedMethods> methods are newly deprecated, <signatureChangedMethods> methods had a signature change and <returnTypeChangedMethods> methods had a return type change.-------");
}

private set[FieldChange] getFieldChanges(M3 old, M3 new) {
	//TODO: implement
	//set[loc] publicFields1 = getPublicFieldsForModel(old);
	//set[loc] publicFields2 = getPublicFieldsForModel(new);
	return {};
}

public set[loc] getPublicClassesForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isClass(m.definition)};
}
public set[loc] getPublicFieldsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isField(m.definition)};
}