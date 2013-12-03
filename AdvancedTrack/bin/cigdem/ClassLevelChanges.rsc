module cigdem::ClassLevelChanges

import lang::java::m3::Core;
import lang::java::jdt::m3::Core;
import lang::java::jdt::m3::AST;
import IO;
import Map;
import List;
import Set;
import util::Math;
import diff::ProjectAST;

data FieldChange = 	unchanged(loc locator)	| changed(loc locator) 
					| added(loc locator) 	| deleted(loc locator);

set [FieldChange] fieldChanges = {};

data ClassChange = unchanged(loc locator)	| changed(loc locator) 
					| added(loc locator) 	| deleted(loc locator);

set [ClassChange] classChanges = {};

public map [loc, str] androidVersionToLevel= (
		|project://platform_development-android-1.6_r1|: "Level 4",
		|project://platform_development-android-1.6_r2|: "Level ?",
		|project://platform_development-android-2.0_r1|: "Level 5",
		|project://platform_development-android-2.1_r1|: "Level 7",
		|project://platform_development-android-2.2_r1|: "Level 8", 
		|project://platform_development-android-2.3_r1|: "Level 9"
		);


public list[loc] androidProjects = [
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

public set[loc] getPublicClassesAndInterfaces(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), (isClass(m.definition) || isInterface(m.definition) ) };
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



public set [Modifier] getModifiersOfClass(M3 theModel, loc className) {
	return {model.modifier | model <-theModel@modifiers, model.definition == className};
}



public bool isFieldModifierChanged (M3 oldModel, M3 newModel, loc fieldName) {
	return (getModifiersOfField(oldModel, fieldName) != getModifiersOfField(newModel, fieldName)) ;
}


public bool isClassModifierChanged (M3 oldModel, M3 newModel, loc className) {
	return (getModifiersOfClass(oldModel, className) != getModifiersOfClass(newModel, className)) ;
}



public loc getTypeOfField (M3 theModel, loc fieldName) {
	list [loc] typeList = [theType.to | theType <- theModel@typeDependency,  theType.from == fieldName];
	return typeList[0];
}


// <|java+field:///MyHelloWorld/zbb|,|java+primitiveType:///boolean|>
// rel[loc from,loc to]

public bool isFieldTypeChanged (M3 oldModel, M3 newModel, loc fieldName) {
	return (getTypeOfField(oldModel, fieldName) != getTypeOfField(newModel, fieldName)) ;
}


set [loc] getDeprecatedSetForLocation(rel [loc from, loc to] dependencies, loc locName) {
	return {dependency.from | dependency <- dependencies, 
 					dependency.to == |java+interface:///java/lang/Deprecated|,
 					dependency.from == locName};
}



set [loc] getDeprecatedSetForField(rel [loc from, loc to] dependencies, loc fieldName) {
	return getDeprecatedSetForLocation(dependencies, fieldName);
}


set [loc] getDeprecatedSetForClass(rel [loc from, loc to] dependencies, loc className) {
	return getDeprecatedSetForLocation(dependencies, className);
}


public bool isClassDeprecated(M3 oldModel, M3 newModel, loc className) {
 rel[loc from, loc to] newDependencies = newModel@typeDependency;
 rel[loc from, loc to] oldDependencies = oldModel@typeDependency;
 return (! isEmpty( getDeprecatedSetForClass(newDependencies, className)) &&
 		isEmpty( getDeprecatedSetForClass(oldDependencies, className)) 
 		) ;
}



public bool isFieldDeprecated(M3 oldModel, M3 newModel, loc fieldName) {
 rel[loc from, loc to] newDependencies = newModel@typeDependency;
 rel[loc from, loc to] oldDependencies = oldModel@typeDependency;
 return (! isEmpty( getDeprecatedSetForField(newDependencies, fieldName)) &&
 		isEmpty( getDeprecatedSetForField(oldDependencies, fieldName)) 
 		) ;
}


// This method returns the set of FieldChanges form added and removed fields only 
public set [FieldChange]  getAddedAndRemovedFields(set [loc] oldPublicFields, 
													set [loc] newPublicFields) {
	set [FieldChange] addRemFieldsSet = {};
	set [loc] addedFields = newPublicFields- oldPublicFields;
	set [loc] removedFields = oldPublicFields - newPublicFields;
	for ( addedField <- addedFields) { 	addRemFieldsSet = addRemFieldsSet + added(addedField); }
	for ( removedField <- removedFields) { 	addRemFieldsSet = addRemFieldsSet + deleted(removedField); }	
	return addRemFieldsSet;
}




// This method returns the set of FieldChanges for fields which are changed 
// (modifier, type or deprecated)
public set [FieldChange]  getAllChangedFields(set [loc] oldPublicFields, 
													set [loc] newPublicFields) {
	set [FieldChange] changedFieldsSet = {};
	set [loc] commonFields = oldPublicFields & newPublicFields;
	logMessage("Number of common fields: <size(commonFields)>", 2);
	for (loc oneField <- commonFields)  
		{ 	if  (	isFieldModifierChanged(oldModel, newModel, oneField) ||
					isFieldTypeChanged(oldModel, newModel, oneField) 	 ||
					isFieldDeprecated(oldModel, newModel, oneField) ) {
				changedFieldsSet = changedFieldsSet + changed(oneField);	
			}		
		}
	return changedFieldsSet ;
}




// Return the set of ClassChanges for added and removed classes, and also 
// for the classes for which modifiers have changed or are deprecated
public set [ClassChange] getChangedAddedRemovedClasses(M3 oldModel, M3 newModel) {
	set [loc] changedClassesSet = {};
	set [loc] oldClasses = getPublicClassesAndInterfaces(oldModel);
	set [loc] newClasses = getPublicClassesAndInterfaces(newModel);
	set [loc] addedClasses = newClasses - oldClasses;
	set [loc] removedClasses = oldClasses  - newClasses;
	set [loc] commonClasses = oldClasses & newClasses;
	for ( addedClass <- addedClasses) { classChanges = classChanges + added(addedClass); }
	for ( removedClass <- removedClasses) { classChanges = classChanges + deleted(removedClass); }
	logMessage("The number of added classes : <size(addedClasses)>", 2); 
	logMessage("The number of removed classes : <size(removedClasses)>", 2); 	
	for (loc oneClass <- commonClasses)  
		{ 	if  (	isClassModifierChanged(oldModel, newModel, oneClass) ||
					isClassDeprecated(oldModel, newModel, oneClass) ) {
				changedClassesSet = changedClassesSet + changed(oneClass);	
			}		
		}
	return changedClassesSet;
}

// Get the classes which will be marked as changed because they contain
// a changed, deleted or removed field.
public set [ClassChange] getClassesWithFieldChanges(M3 oldModel, M3 newModel,
													set [loc] oldPublicFields, 
													set [loc] newPublicFields) {
	set [loc] changedClassesSet = {};
	set [loc] addedFields = newPublicFields - oldPublicFields;
	set [loc] removedFields = oldPublicFields - newPublicFields;
	set [loc] changedNewClasses = {getClassOfAField(newModel, field) | field <- addedFields};
	set [loc] changedOldClasses = {getClassOfAField(oldModel, field) | field <- removedFields};
	logMessage("The number of changed classes because of an added field: <size(changedNewClasses)>", 2);
	logMessage("The number of changed classes because of a removed field: <size(changedOldClasses)>", 2);	
	for (loc oneClass <- changedNewClasses)  { 	changedClassesSet = changedClassesSet + changed(oneClass); }		
	for (loc oneClass <- changedOldClasses)  { 	changedClassesSet = changedClassesSet + changed(oneClass); }			
	return changedClassesSet;
}


public void findAllFieldAndClassChanges(list [M3] projectList) {
	list [M3] models = getM3Models(projectList);
	M3 oldModel = models[0];
	M3 newModel = models[1];
	findClassChanges(oldModel, newModel);
	set [loc] oldFields = getPublicFieldsForModel(oldModel);
	set [loc] newFields = getPublicFieldsForModel(newModel);	
	// Call the other functions !!!!!!!!!!!!!!!!!!!!!!!!!!
}


public void testAndroid() {findClassLevelChanges(androidProjects);}

public void testChangedProject() {findClassLevelChanges(changedProjects);}

public void testGuava() {findClassLevelChanges(guavaProjects);}


public void testAllFields() {findAllFieldChanges(changedProjects);}

public void testAllFields2() {findAllFieldChanges(androidProjects);}
