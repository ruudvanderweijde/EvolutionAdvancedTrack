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

import \test::MethodComparison;

data Change = transition(loc old, loc new) | addition(loc new) | deletion(loc old);
data VersionTransition = versionTransition(str oldVersion,
										   str newVersion,
										   set[Change] classChanges, 
										   set[MethodChange] methodChanges, 
										   set[Change] fieldChanges);

public void run() {
	M3 m3Model1 = createM3FromEclipseProject(|project://GuavaRelease01|);
	M3 m3Model2 = createM3FromEclipseProject(|project://GuavaRelease02|);
	M3 m3Model3 = createM3FromEclipseProject(|project://GuavaRelease03|);
	list[VersionTransition] transitions = compareM3Models([m3Model1, m3Model2, m3Model3]);
	
	for (VersionTransition transition <- transitions) {
		println("-------[ Transition from <transition.oldVersion> to <transition.newVersion> ]-------");
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
	set[MethodChange] methodChanges = getMethodChanges(old, new);
	set[Change] fieldChanges = getFieldChanges(old, new);
	
	//TODO: derive changed classes
	//	set[loc] publicClasses1 = getPublicClassesForModel(old);
	//	set[loc] publicClasses2 = getPublicClassesForModel(new);
	set[Change] classChanges = [];
	
	//TODO: deduce version numbers
	str oldVersion = "mockup-old";
	str newVersion = "mockup-new";
	
	return versionTransition(oldVersion, newVersion, classChanges, methodChanges, fieldChanges);
}

private set[Change] getFieldChanges(M3 old, M3 new) {
	//TODO: implement
	//set[loc] publicFields1 = getPublicFieldsForModel(old);
	//set[loc] publicFields2 = getPublicFieldsForModel(new);
	return [];
}

public set[loc] getPublicClassesForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isClass(m.definition)};
}
public set[loc] getPublicFieldsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isField(m.definition)};
}