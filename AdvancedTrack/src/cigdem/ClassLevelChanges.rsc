module cigdem::ClassLevelChanges

import lang::java::m3::Core;
import lang::java::jdt::m3::Core;
import lang::java::jdt::m3::AST;
import IO;
import Map;
import List;
import Set;
import util::Math;
import \test::ProjectAST;


public map [loc, str] androidVersionToLevel= (
		|project://platform_development-android-1.6_r1|: "Level 4",
		|project://platform_development-android-1.6_r2|: "Level ?",
		|project://platform_development-android-2.0_r1|: "Level 5",
		|project://platform_development-android-2.1_r1|: "Level 7",
		|project://platform_development-android-2.2_r1|: "Level 8", 
		|project://platform_development-android-2.3_r1|: "Level 9"
		);


public list[loc] androidProjects = [
							//|project://platform_development-android-1.6_r1|
							 //,
							//|project://platform_development-android-1.6_r2|
							//,
							//|project://platform_development-android-2.0_r1|
							//,
							//|project://platform_development-android-2.1_r1|
							//,
							|project://platform_development-android-2.2_r1|
							,
							|project://platform_development-android-2.3_r1|
							];




//public list [loc] guava2Projects = [ |project://GuavaReleasproject://GuavaRelease01|
//									,
//									|project://GuavaReleasproject://GuavaRelease02|];
									
public list [loc] changedProjects = [|project://ChangedProject01|,
									|project://ChangedProject02|
									];									

public set[loc] getPublicClassesForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isClass(m.definition)};
}


public set[loc] getPublicFieldsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isField(m.definition)};
}


public set [loc] getAddedPublicFields(M3 oldModel, M3 newModel) {
	return (getPublicFieldsForModel(newModel) - getPublicFieldsForModel(oldModel));
}


public set [loc] getRemovedPublicFields(M3 oldModel, M3 newModel) {
	return (getPublicFieldsForModel(oldModel) - getPublicFieldsForModel(newModel));
}


public loc getClassOfAField(M3 model, loc field) {
	set [loc] classes =  {c | <c,field> <- model@containment };
	if (size(classes) != 1) {throw ("The field should have one parent class.");}
	else { return getOneFrom(classes); }
}


public set [Modifier] getModifiersOfField(M3 theModel, loc fieldName) {
	return {model.modifier | model <-theModel@modifiers, model.definition == fieldName};
}



public bool isFieldModifierChanged (M3 oldModel, M3 newModel, loc fieldName) {
	return (getModifiersOfField(oldModel, fieldName) != getModifiersOfField(newModel, fieldName)) ;
}



public bool isFieldTypeChanged (M3 oldModel, M3 newModel, loc fieldName) {
	return (getModifiersOfField(oldModel, fieldName) != getModifiersOfField(newModel, fieldName)) ;
}




public void findAllFieldChanges(list [loc] projectList) {
	list [M3] models = getM3Models(projectList);
	M3 oldModel = models[0];
	M3 newModel = models[1];
	set [loc] oldFields = fields(oldModel);
	set [loc] newFields = fields(newModel);
	set [loc] commonFields = oldFields & newFields;
	println("Number of common fields: <size(commonFields)>");
	for (loc oneField <- commonFields)  
		{ 
			if  (isFieldModifierChanged(oldModel, newModel, oneField)) {
				println ("The old modifiers for field: <oneField> are: <getModifiersOfField(oldModel, oneField)>"); 
		  		println ("The new modifiers for field: <oneField> are: <getModifiersOfField(newModel, oneField)>"); 
			}		
		}
}



public void findClassLevelChanges(list [loc] myTestProjects) {
	list [M3] models = getM3Models(myTestProjects);
	M3 oldModel = models[0];
	M3 newModel = models[1];
	set [loc] addedFields = getAddedPublicFields(oldModel, newModel);
	set [loc] removedFields = getRemovedPublicFields(oldModel, newModel);
	println("Changes between two projects: <myTestProjects[0]> and <myTestProjects[1]>");
	println("Number of added public fields: <size(addedFields)>");
	println("Number of removed public fields: <size(removedFields)>");	
	set [loc] changedNewClasses = {getClassOfAField(newModel, field) | field <- addedFields};
	set [loc] changedOldClasses = {getClassOfAField(oldModel, field) | field <- removedFields};
	println("The number of changed classes because of an added field: <size(changedNewClasses)>");
	println("The number of changed classes because of a removed field: <size(changedOldClasses)>");	
	set [loc] addedClasses = getPublicClassesForModel(newModel) - getPublicClassesForModel(oldModel);
	set [loc] removedClasses = getPublicClassesForModel(oldModel) - getPublicClassesForModel(newModel);
	println("The number of classes in the new model: <size(getPublicClassesForModel(newModel))>"); 
	//iprintln(sort(getPublicClassesForModel(newModel)));
	println("The number of added classes : <size(addedClasses)>"); 
	println("The number of removed classes : <size(removedClasses)>"); 	
}


public void testAndroid() {findClassLevelChanges(androidProjects);}

public void testChangedProject() {findClassLevelChanges(changedProjects);}

public void testGuava() {findClassLevelChanges(guavaProjects);}


public void testAllFields() {findAllFieldChanges(changedProjects);}

public void testAllFields2() {findAllFieldChanges(androidProjects);}
