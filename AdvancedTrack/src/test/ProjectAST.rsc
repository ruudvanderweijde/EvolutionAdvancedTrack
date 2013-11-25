module \test::ProjectAST

import IO;
import List;
import Set;

import vis::Figure;
import vis::Render;

import util::ValueUI;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;

data Change = transition(loc old, loc new) | addition(loc new) | deletion(loc old);
data VersionTransition = versionTransition(str oldVersion,
										   str newVersion,
										   list[Change] classChanges, 
										   list[Change] methodChanges, 
										   list[Change] fieldChanges);

public void run() {
	M3 m3Model1 = createM3FromEclipseProject(|project://GuavaRelease01|);
	M3 m3Model2 = createM3FromEclipseProject(|project://GuavaRelease02|);
	M3 m3Model3 = createM3FromEclipseProject(|project://GuavaRelease03|);
	list[VersionTransition] transitions = compareM3Models([m3Model1, m3Model2, m3Model3]);
	
	for (VersionTransition transition <- transitions) {
		println("-------[ <transition> ]-------");
		//for (y <- result[transition]) {
		//	iprintln("<y>: <size(result[x][y])>");
		//}
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
	list[Change] methodChanges = getMethodChanges(old, new);
	list[Change] fieldChanges = getFieldChanges(old, new);
	
	//TODO: derive changed classes
	//	set[loc] publicClasses1 = getPublicClassesForModel(old);
	//	set[loc] publicClasses2 = getPublicClassesForModel(new);
	list[Change] classChanges = [];
	
	//TODO: deduce version numbers
	str oldVersion = "mockup-old";
	str newVersion = "mockup-new";
	
	return versionTransition(oldVersion, newVersion, classChanges, methodChanges, fieldChanges);
}

private list[Change] getMethodChanges(M3 old, M3 new) {
	set[loc] publicMethods1 = getPublicMethodsForModel(old);
	set[loc] publicMethods2 = getPublicMethodsForModel(new);
	
	list[Change] methodTransitions = [];
	set[loc] changedMethods = {};
	for (loc method <- publicMethods1) {
		if (method in publicMethods2) {
			//Unchanged.
			methodTransitions += transition(method, method);
		} else if (false) {
			//TODO: implement changed signature
			//Multiple changes possible?
			//versionChanges += transition(method, newMethod);
			changedMethods += method;
		} else {
			//It was deleted.
			methodTransitions += deletion(method);
		}
	}
	
	set[loc] addedMethods = publicMethods2 - publicMethods1 - changedMethods;
	for (loc addedMethod <- addedMethods) {
		methodTransitions += addition(addedMethod);
	}
	
	return methodTransitions;
}

private list[Change] getFieldChanges(M3 old, M3 new) {
	//TODO: implement
	//set[loc] publicFields1 = getPublicFieldsForModel(old);
	//set[loc] publicFields2 = getPublicFieldsForModel(new);
	return [];
}

public set[loc] getPublicMethodsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isMethod(m.definition)};
}
public set[loc] getPublicClassesForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isClass(m.definition)};
}
public set[loc] getPublicFieldsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isField(m.definition)};
}