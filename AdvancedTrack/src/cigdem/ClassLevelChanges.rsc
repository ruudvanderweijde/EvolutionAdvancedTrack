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

public void listAllFieldsOfAClass(M3 newModel, loc c) {
	// get only the fields which are public
	set [loc] allPublicFields = fields(newModel, c) & getPublicFieldsForModel(newModel) ;
	println(allPublicFields);
} 



public void findClassLevelChanges(loc oldProject, loc newProject) {
	oldModel = createM3FromEclipseProject(oldProject);
	newModel = createM3FromEclipseProject(newProject);
	set [loc] allClassesForOldProject = classes(oldModel);
	set [loc] allClassesForNewProject = classes(newModel);
	set [loc] allCommonClasses = allClassesForNewProject & allClassesForNewProject;
	set [loc] addedClasses = allClassesForNewProject - allClassesForOldProject;
	if (isEmpty(addedClasses)) {
		println("No new classes are added."); 
	}
	else { 
		println("Added classes: <addedClasses>"); 
		for (loc c <- addedClasses) {
			listAllFieldsOfAClass(newModel, c); 
	};
		
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

public void test3(){
	M3 myModel = createM3FromEclipseProject(|project://CodeAnalysisExamplesNew|);
	loc myClass = |java+class:///MyHelloWorld|;
	listAllFieldsOfAClass(myModel, myClass);
}

public void test4() {
	M3 oldModel = createM3FromEclipseProject(|project://Guava/versions/01|);
	M3 newModel = createM3FromEclipseProject(|project://Guava/versions/02|);
	set [loc] oldPublicFields = getPublicFieldsForModel(oldModel);
	set [loc] newPublicFields = getPublicFieldsForModel(newModel);
	set [loc] addedFields = newPublicFields - oldPublicFields;
	set [loc] removedFields = oldPublicFields - newPublicFields;
	if ( isEmpty(addedFields) ) { println ("No new fields are added."); }
	else {println ("Added fields: <addedFields>");}
	if ( isEmpty(removedFields) ) { println ("No fields are removed."); }
	else {println ("Removed fields: <removedFields>");}	
}



