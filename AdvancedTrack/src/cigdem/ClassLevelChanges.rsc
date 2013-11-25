module cigdem::ClassLevelChanges

import lang::java::m3::Core;
import lang::java::jdt::m3::Core;
import lang::java::jdt::m3::AST;
import IO;
import Map;
import List;
import Set;
import util::Math;


public set [Modifier] getSetOfModifiersPerClass(M3 theModel, loc className) {
	// theModel@modifiers returns a set of relations : rel [loc definition, Modifier modifier]
	// example: {<|java+class:///MyHelloWorld|, public()>}
	// map [loc, Modifier] 
	set [Modifier] modifiers = {m.modifier | m <-theModel@modifiers, m.definition == className};
 	println("All modifiers for class <className>: <modifiers>");
 	return modifiers;
}

public set[loc] getPublicFieldsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isField(m.definition)};
}

public void findChangedModifiers(M3 oldModel, M3 newModel, loc className) {
	set [Modifier] oldModifiers = getSetOfModifiersPerClass(oldModel, className) ;
	set [Modifier] newModifiers = getSetOfModifiersPerClass(newModel, className) ;
	set [Modifier] addedModifiers = newModifiers - oldModifiers;
	set [Modifier] removedModifiers = oldModifiers - newModifiers;		
	if (! isEmpty(addedModifiers)) { println("Added modifiers for class <className>: <addedModifiers>"); };
	if (! isEmpty(removedModifiers)) { println("Removed modifiers for class <className>: <removedModifiers>"); 	};
}


public void findClassLevelChanges(loc oldProject, loc newProject) {
	oldModel = createM3FromEclipseProject(oldProject);
	newModel = createM3FromEclipseProject(newProject);
	loc exampleClass = |java+class:///MyHelloWorld|;
	set [loc] allClassesForOldProject = classes(oldModel);
	set [loc] allClassesForNewProject = classes(newModel);
	set [loc] allCommonClasses = allClassesForNewProject & allClassesForNewProject;
	if (isEmpty(allClassesForNewProject - allClassesForOldProject)) {
		println("No new classes are added."); 
	}
	else { 
		println("Added classes: <allClassesForNewProject - allClassesForOldProject>"); 
	}; 
	if (isEmpty(allClassesForOldProject - allClassesForNewProject)) {	
		println("No classes are removed.");
	}
	else {
		println("Removed classes: <allClassesForOldProject - allClassesForNewProject>");	
	}
	println("--------------------------------------");
	for (loc l <- allCommonClasses) {
		findChangedModifiers(oldModel, newModel, l);
	};
}


public void test1(){
	findClassLevelChanges(|project://CodeAnalysisExamples|, |project://CodeAnalysisExamplesNew|);
}

public void test2(){
	findClassLevelChanges(|project://Guava/versions/01|, |project://Guava/versions/02|);
}


