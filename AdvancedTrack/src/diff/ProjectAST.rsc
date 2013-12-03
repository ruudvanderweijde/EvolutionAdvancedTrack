module diff::ProjectAST

import IO;
import List;
import Set;
import String;
import DateTime;
import Relation;

import ValueIO;

import vis::Figure;
import vis::Render;

import util::ValueUI;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;

import diff::MethodComparison;
import cigdem::ClassLevelChanges;

import analysis::m3::Core;

import Message;
import Set;
import IO;
import util::FileSystem;
import analysis::graphs::Graph;
extend analysis::m3::TypeSymbol;

public loc cacheDir = |project://AdvancedTrack/cache|;

data Change = transition(loc old, loc new) | addition(loc new) | deletion(loc old);

data VersionTransition = versionTransition(loc oldVersion,
										   loc newVersion,
										   set[Change] classChanges, 
										   set[MethodChange] methodChanges, 
										   set[FieldChange] fieldChanges);

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

public loc testMethod = |project://GuavaRelease14.0/src/com/google/common/util/concurrent/Futures.java|;
public loc testClass = |project://GuavaRelease14.0/src/com/google/common/util/concurrent/Futures.java|(59932,2119,<1525,4>,<1577,5>);

public void runTest() {
	list[M3] models = getM3Models(projects);
	M3 model = models[0];
}

public void run() {
	logMessage("Getting m3 models...", 1);
	list[M3] models = getM3Models(projects);
	logMessage("Comparing m3 models... ", 1);
	list[VersionTransition] transitions = compareM3Models(models);

	// write to cache 
	logMessage("Writing to cache", 1);
	writeTransitionsToCache(transitions);
	
	logMessage("Display results", 1);
	//for (VersionTransition transition <- transitions) {
	//	println("-------[ Transition from <transition.oldVersion> to <transition.newVersion> ]-------");
	//	printMethodChangeStatistics(transition.methodChanges);
	//}
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

public loc getContainment(M3 model, loc location) {
	// keep on doing...
}
public loc getClass(M3 model, loc location) {
	set [loc] classes =  {c | <c,class> <- model@containment };
	if (size(classes) != 1) {throw ("The field should have one parent class.");}
	else { return getOneFrom(classes); }
}

private void visualizeTransitions(list[VersionTransition] transitions) {
	list[Figure] versions = [];
	logMessage("visualization get dataset...", 2);
	for (transition <- transitions) {
		versions += versionFigure(transition);		
	}
	logMessage("rendering image...", 2);
	//iprintln(versions);
	render(
		hscreen(
			hcat(versions, top(), gap(10)), 
			id("versionLabel")
		)
	);
}

public Figure versionFigure(VersionTransition transition) {
	logMessage("versionFigure: <transition.oldVersion> - <transition.newVersion>", 2);
	list[Figure] version = [];
	//for (change <- transition.classChanges) {
	//	iprintln(change);
	//}
	rel[loc package, loc class, Figure method] pcm = {};  
	for (change <- transition.methodChanges) {
		visit(change) {
			//case change:\unchanged(location)	: pcm += <change@package, change@class, addMethod(location)>;
			case change:\signatureChanged(location, newLocation)	: pcm += <change@package, change@class, addMethod(location, "yellow")>;
			case change:\deprecated(location)	: pcm += <change@package, change@class, addMethod(location, "orange")>;
			case change:\added(location)		: pcm += <change@package, change@class, addMethod(location, "green")>;
			case change:\deleted(location)		: pcm += <change@package, change@class, addMethod(location, "red")>;
		}
	}

	list[Figure] packageFigures = [], classFigures = [], methodFigures = [];	
	logMessage("create map for version: <transition.oldVersion> - <transition.newVersion>", 2);
	set[loc] packages = pcm.package;
	rel[value package, loc class, Figure method] classesFilter = {};
	for (package <- packages) {
		classesFilter = domainR(pcm, {package});
		classFigures = [];
		for (class <- classesFilter.class) {
			methodFigures = [];
			for(method <- { m | <p,c,m> <- pcm, c == class, p == package } ) {
				methodFigures += method;
			}
			classFigures += addClass("<class>", methodFigures);
		}
		packageFigures += addPackage("<package>", classFigures);
	}
	
	str versionLabel = "";
	versionLabel += (/<x:[0-9\._]+>/ := transition.oldVersion.authority) ? (x) : transition.oldVersion.authority;
	versionLabel += " to ";
	versionLabel += (/<x:[0-9\._]+>/ := transition.newVersion.authority) ? (x) : transition.newVersion.authority;
	return addVersion(versionLabel, packageFigures);
}

public FProperty popup(str s) {
	return mouseOver(box(text(s), gap(1), fillColor("Yellow")));
}

public Figure b(str id, str label, str color="white") {
	return box(text(id), popup(label), fillColor(color));
}

public Figure package(str id, str label) {
	return box(text(id), popup(label));
}

public FProperty popup(str s) {
	return mouseOver(box(text(s), gap(1), fillColor("Yellow")));
}

public Figure b(str id, str label) {
	return box(popup(label));
}
//public Figure b(str id, str label) {
//	return box(text(id), popup(label));
//}

public Figure package(str id, str label) {
	return box(text(id), popup(label));
}

public Figure addVersion(str label, list[Figure] packages) {
	return vcat(packages, project(text(label), "versionLabel"));
}
//public Figure addVersion(str label, list[Figure] packages) {
//	return vcat(packages, project(text(label), "versionLabel"));
//}

public Figure addPackage(str label, list[Figure] classes) {
	return vcat([b("p",label), treemap(classes)]);
}

public Figure addClass(str label, list[Figure] methods) {
	return vcat([b("c", label),	treemap(methods)]);
}

public Figure addedMethod(str label) {
	return b("m", label);
}
public Figure deprecatedMethod(str label) {
	return b("m", label, color="red");
}
public Figure addMethod(loc location) {
	return box("m", "<location>");
	return b("m", "<location>");
}
public Figure addMethod(str label) {
	return b("m", label);
}
public Figure addMethod(loc location, str color) {
	str label = last(split("/", "<location>"));
	return b(label, color=color);
}

public void vizDynamic() {
	render(
		hscreen(
			hcat(
				[	
					addVersion("version",
						[
							addPackage("Package W",
							[
								addClass("Class W",
								[
									addMethod("Method W1")
								]
								)
							]),
							addPackage("Package X",
							[
								addClass("Class X",	
								[
									addMethod("Method X1"), 
									addMethod("Method X2"), 
									addMethod("Method X3"), 
									addMethod("Method X4"), 
									addMethod("Method X12"), 
									addMethod("Method Y")
								]
								),
								addClass("Class Y",
								[
									addMethod("Method Y1"), 
									addMethod("Method Y")
								]
								)			
							]						
						)
									
					]						
					),
					addVersion("version",
						[
							addPackage("Package W",
							[
								addClass("Class W",
								[
									addMethod("Method W1")
								]
								)
							]),
							addPackage("Package X",
							[
								addClass("Class X",
								[
									addMethod("Method X1"), 
									addMethod("Method X2"), 
									addMethod("Method X3"), 
									addMethod("Method X4"), 
									addMethod("Method X12"), 
									addMethod("Method Y")
								]
								),
								addClass("Class Y",
								[
									addMethod("Method Y1"), 
									addMethod("Method Y")
								]
								)	
												
											
							]						
						)
									
					]						
					)
				],
				top(),
				gap(10)
			), 
			id("versionLabel")
		)
	);
	return;
}

public void viz() {
	render(
		hscreen(
			hcat(
				[	
					hcat(
						[
							package("p","Package X"),
							vcat(
								[
									hcat(
										[
											b("c","Class X"),
											vcat(
												[
													b("m", "Method X"), 
													b("m", "Method Y")
												]
											)
										]
									)
									
								]
							)
						],
						project(text("1-2"), "versionLabel")
					),
					hcat(
						[
							b("p","Package X"),
							vcat(
								[
									hcat(
										[
											b("c","Class X"),
											vcat(
												[
													b("m", "Method X"), 
													b("m", "Method Y")
												]
											)
										]
									)
									
								]
							)
						],
						project(text("2-3"), "versionLabel")
					),
					hcat(
						[
							b("p","Package X"),
							vcat(
								[
									hcat(
										[
											b("c","Class X"),
											vcat(
												[
													b("m", "Method X"), 
													b("m", "Method Y")
												]
											)
										]
									)
									
								]
							)
						],
						project(text("3-4"), "versionLabel")
					),
					hcat(
						[
							b("p","Package X"),
							vcat(
								[
									hcat(
										[
											b("c","Class X"),
											vcat(
												[
													b("m", "Method X"), 
													b("m", "Method Y"),
													b("m", "Method Z")
												]
											)
										]
									)
									
								]
							)
						],
						project(text("4-5"), "versionLabel")
					)
				],
				top(),
				gap(10)
			), 
			id("versionLabel")
		)
	);
	return;
}

@doc { get a list of M3 models from file system }
@memo
public list[M3] getM3Models(list[loc] projects) {
	return {
		for (project <- projects) {
			append(readBinaryValueFile(|project://AdvancedTrack/m3/|+"<project.authority>.bin.m3"));
		}	
	}
}

@doc { Write transition model to filesystem }
public void writeTransitionsToCache(list[VersionTransition] transitions) {
	writeBinaryValueFile(cacheDir+"Transitions.bin.trans", transitions);
}

@doc { Read transition model from filesystem }
public list[VersionTransition] readTransitionsFromCache() {
	return readBinaryValueFile(#list[VersionTransition], cacheDir+"Transitions.bin.trans");
}

@doc { write m3 models to file system as binary files }
public void writeM3Models(list[loc] projects) {
	for (project <- projects) {
		writeBinaryValueFile(|project://AdvancedTrack/m3/|+"<project.authority>.bin.m3", createM3FromEclipseProject(project));
	}
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
	int unchangedMethods = 0, deprecatedMethods = 0, signatureChangedMethods = 0, addedMethods = 0, deletedMethods = 0;
	for (MethodChange methodChange <- methodChanges) {
		visit(methodChange) {
			case unchanged(_): unchangedMethods += 1;
			case deprecated(locator): {
				println("\tDEPRECATED: <locator>");
				deprecatedMethods += 1;
			}
			case signatureChanged(old,new): {
				println("\tSIGNATURE CHANGE: <old> IS NOW: <new>");
				signatureChangedMethods += 1;
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
	int changedMethods = deprecatedMethods + signatureChangedMethods;
	println("-------In total <unchangedMethods> methods are unchanged, <changedMethods> methods are changed, <addedMethods> methods have been added and <deletedMethods> methods have been deleted.-------");
	println("-------Of these method changes, <deprecatedMethods> consisted of newly deprecated methods and <signatureChangedMethods> methods had a signature change-------");
}

private set[Change] getFieldChanges(M3 old, M3 new) {
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