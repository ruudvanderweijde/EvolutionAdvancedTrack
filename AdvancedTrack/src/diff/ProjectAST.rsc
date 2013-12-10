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
import diff::FieldComparison;
import cigdem::ClassLevelChanges;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;
import analysis::m3::Core;
import util::FileSystem;
import analysis::graphs::Graph;
extend analysis::m3::TypeSymbol;

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

public void runJAR(int maxApiLevel) {
	set[int] versions = toSet([2..(maxApiLevel+1)]);
	logMessage("Getting m3 models...", 1);
	lrel[int APILevel, loc LocationM3] modelLocations = getM3LocationsJAR(versions);
	list[M3] models = [ getM3ModelByLocation(l) | <_,l> <- modelLocations ];

	bool printInfo = false;
	if (printInfo) {
		printModelInfo(models);
	} else {
		//check models
		logMessage("Comparing m3 models... ", 1);
		list[VersionTransition] transitions = compareM3Models(models);
		logMessage("Print compare results... ", 1);
		printTransitions(transitions);
	}
}

public void printModelInfo(list[M3] models) {
	for (model <- models) {
		str message = "<model.id>:\t#annotations\t"; 
		message += "<size([m|<m,_> <- model@annotations, isClass(m)])> class\t\t";
		message += "<size([m|<m,_> <- model@annotations, isInterface(m)])> interfaces\t\t";
		message += "<size([m|<m,_> <- model@annotations, isMethod(m)])> methods\t";
		message += "<size([m|<m,_> <- model@annotations, isField(m)])> fields";
		println(message);
	}	
}

public void run() {
	run(subdirectory);
}

public void run(str dir) {
	logMessage("Getting m3 models...", 1);
	list[M3] models = getM3Models(projects, dir);
	logMessage("Comparing m3 models... ", 1);
	list[VersionTransition] transitions = compareM3Models(models);
	printTransitions(transitions);
}

public void printTransitions(list[VersionTransition] transitions) {
	// write to cache 
	logMessage("Writing to cache", 1);
	writeTransitionsToCache(transitions);
	
	logMessage("Display results", 1);
	for (VersionTransition transition <- transitions) {
		println("-------[ Transition from <transition.oldVersion> to <transition.newVersion> ]-------");
		println("---[FIELDS]---");
		printFieldChangeStatistics(transition.fieldChanges);
		println("\n---[METHODS]---");
		printMethodChangeStatistics(transition.methodChanges);
		println("\n---[CLASSES]---");
		printClassChangeStatistics(transition.classChanges);
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
	//iprintln(package);
	while (!isPackage(location)) {
		package = getContainment(model, location);	
	}
	//iprintln(package);
	set [loc] classes =  {c | <c,l> <- model@containment, location == l, isPackage(c) };
	//iprintln(classes);
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
	//TODO: take methods into account in class changes
	set[ClassChange] classChanges = getClassChanges(old, new);
	
	//TODO: deduce version numbers
	loc oldVersion = old.id;
	loc newVersion = new.id;
	
	return versionTransition(oldVersion, newVersion, classChanges, methodChanges, fieldChanges);
}

private void printFieldChangeStatistics(set[FieldChange] fieldChanges) {
	int changedFields = 0, addedFields = 0, deletedFields = 0;
	for (FieldChange fieldChange <- fieldChanges) {
		visit (fieldChange) {
			case changedField(locator): {
				println("\tCHANGED: <locator>");
				changedFields += 1;
			}
			case addedField(locator): {
				println("\tCHANGED: <locator>");
				addedFields += 1;
			}
			case deletedField(locator): {
				println("\tCHANGED: <locator>");
				deletedFields += 1;
			}
		}
	}
	println("-------In total <changedFields> fields have changed somehow, <addedFields> fields have been added and <deletedFields> fields have been deleted.-------");
}

private void printMethodChangeStatistics(set[MethodChange] methodChanges) {
	int unchangedMethods = 0, deprecatedMethods = 0, undeprecatedMethods = 0, signatureChangedMethods = 0, returnTypeChangedMethods = 0, addedMethods = 0, deletedMethods = 0;
	set[loc] changedMethods = {};
	for (MethodChange methodChange <- methodChanges) {
		visit(methodChange) {
			case unchanged(_): unchangedMethods += 1;
			case deprecated(locator): {
				println("\tDEPRECATED: <locator>");
				changedMethods += locator;
				deprecatedMethods += 1;
			}
			case undeprecated(locator): {
				println("\tUNDEPRECATED: <locator>");
				changedMethods += locator;
				undeprecatedMethods += 1;
			}
			case signatureChanged(old,new): {
				println("\tSIGNATURE CHANGE: <old> IS NOW: <new>");
				changedMethods += old;
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
	println("-------Changes in methods: <deprecatedMethods> deprecated, <undeprecatedMethods> undeprecated, <signatureChangedMethods> signature change and <returnTypeChangedMethods> return type change.-------");
}

private void printClassChangeStatistics(set[ClassChange] classChanges) {
	int changedClasses = 0, addedClasses = 0, deletedClasses = 0;
	for (ClassChange classChange <- classChanges) {
		visit (classChange) {
			case changedClass(locator): {
				println("\tCHANGED: <locator>");
				changedClasses += 1;
			}
			case addedClass(locator): {
				println("\tCHANGED: <locator>");
				addedClasses += 1;
			}
			case deletedClass(locator): {
				println("\tCHANGED: <locator>");
				deletedClasses += 1;
			}
		}
	}
	println("-------In total <changedClasses> classes have changed somehow, <addedClasses> classes have been added and <deletedClasses> classes have been deleted.-------");
}
