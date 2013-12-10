module cigdem::ClassLevelChanges

import diff::Utils;
import lang::java::m3::Core;
import lang::java::jdt::m3::Core;
import lang::java::jdt::m3::AST;
import IO;
import ValueIO;
import Map;
import List;
import Set;
import util::Math;
import diff::DataType;
import diff::ProjectAST;
import DateTime;

data FieldChange = 	  changedField(loc locator) 
					| addedField(loc locator) 	| deletedField(loc locator);

set [FieldChange] fieldChanges = {};

data ClassChange =    changedClass(loc locator) 
					| addedClass(loc locator) 	| deletedClass(loc locator);

set [ClassChange] classChanges = {};		

// This method takes set of fields as argument and returns a set of fields which are
// defined in public classes or interfaces only
public set [loc] takeFieldsInPublicClasses (M3 model, set[loc] fields) {
	set [loc] publicClasses = getPublicClassesAndInterfaces(model);
	set [loc] takenFields = {};
	for (aField <- fields ) {
		if (getClassOfAField(model, aField) in publicClasses) {
			takenFields += aField;
		}
	}
	return takenFields;
}

// Don't forget, the Enums should be added. They ar ein M3 in M3@extends annotation
// | enum name - java.lang.Enum"
public set[loc] getPublicClassesAndInterfaces(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), (isClass(m.definition) || isInterface(m.definition) ) };
}

public set[loc] getPublicFieldsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isField(m.definition)};
}

public loc getClassOfAField(M3 model, loc field) {
	set [loc] classes = {r.from | tuple [loc from, loc to] r <- model@containment, isField(r.to) && r.to == field };
	if (size(classes) != 1) {
		println("Error in getClassOfAfield()! ");
		throw ("The field should have one parent class.");
	}
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

// This method returns the set of FieldChanges form added and removed fields only 
public set [FieldChange]  getAddedAndRemovedFields(M3 oldModel, M3 newModel, set [loc] oldPublicFields, 
													set [loc] newPublicFields) {
	set [FieldChange] addRemFieldsSet = {};
	set [loc] addedFields = takeFieldsInPublicClasses (newModel, (newPublicFields- oldPublicFields));
	set [loc] removedFields = takeFieldsInPublicClasses (oldModel, (oldPublicFields - newPublicFields));
	for ( aField <- addedFields) { 	addRemFieldsSet = addRemFieldsSet + addedField(aField); }
	for ( rField <- removedFields) { 	addRemFieldsSet = addRemFieldsSet + deletedField(rField); }	
	return addRemFieldsSet;
}

// This method returns the set of FieldChanges for fields which are changed 
// (modifier, type or deprecated)
public set [FieldChange]  getAllChangedFields(M3 oldModel, M3 newModel, set [loc] oldPublicFields, 
													set [loc] newPublicFields) {
	set [loc] changedFields = {};
	set [FieldChange] returnSet = {};
	set [loc] commonFields = oldPublicFields & newPublicFields;
	
	set[loc] oldDeprecations = findDeprecations(oldModel);
	set[loc] newDeprecations = findDeprecations(newModel);
	
	logMessage("Number of common fields: <size(commonFields)>", 2);
	for (loc oneField <- commonFields)  
		{ 	if  (	isFieldModifierChanged(oldModel, newModel, oneField) ||
					isFieldTypeChanged(oldModel, newModel, oneField) 	 ||
					isDeprecated(oneField, oldDeprecations, newDeprecations) ) {
				changedFields += (oneField);	
			}		
		}
	set [loc] fieldsInPublicClasses = takeFieldsInPublicClasses(oldModel, changedFields);
	for ( cField <- fieldsInPublicClasses) { returnSet += changedField(cField); }	
	return returnSet ;
}

// Return the set of ClassChanges for added and removed classes, and also 
// for the classes for which modifiers have changed or are deprecated
public set [ClassChange] getChangedAddedRemovedClasses(M3 oldModel, M3 newModel) {
	set [ClassChange] changedClassesSet = {};
	set [loc] oldClasses = getPublicClassesAndInterfaces(oldModel);
	set [loc] newClasses = getPublicClassesAndInterfaces(newModel);
	set [loc] addedClasses = newClasses - oldClasses;
	set [loc] removedClasses = oldClasses  - newClasses;
	set [loc] commonClasses = oldClasses & newClasses;
	
	set[loc] oldDeprecations = findDeprecations(oldModel);
	set[loc] newDeprecations = findDeprecations(newModel);
	
	for ( aClass <- addedClasses) { changedClassesSet += addedClass(aClass); }
	for ( rClass <- removedClasses) { changedClassesSet +=  deletedClass(rClass); }
	//logMessage("The number of added classes : <size(addedClasses)>", 2); 
	//logMessage("The number of removed classes : <size(removedClasses)>", 2); 	
	for (loc oneClass <- commonClasses)  
		{ 	if  (	isClassModifierChanged(oldModel, newModel, oneClass) ||
					isDeprecated(oneClass, oldDeprecations, newDeprecations) ) {
				changedClassesSet = changedClassesSet + changedClass(oneClass);	
			}		
		}
	return changedClassesSet;
}

// Get the classes which will be marked as changed because they contain
// a changed, deleted or removed field.
public set [ClassChange] getClassesWithFieldChanges(M3 oldModel, M3 newModel,
													set [loc] oldPublicFields, 
													set [loc] newPublicFields) {
	set [ClassChange] changedClassesSet = {};
	set [loc] addedFields = newPublicFields - oldPublicFields;
	set [loc] removedFields = oldPublicFields - newPublicFields;
	set [loc] changedNewClasses = {getClassOfAField(newModel, field) | field <- addedFields};
	set [loc] changedOldClasses = {getClassOfAField(oldModel, field) | field <- removedFields};
	//logMessage("The number of changed classes because of an added field: <size(changedNewClasses)>", 2);
	//logMessage("The number of changed classes because of a removed field: <size(changedOldClasses)>", 2);	
	for (loc oneClass <- changedNewClasses)  { 	changedClassesSet = changedClassesSet + changedClass(oneClass); }		
	for (loc oneClass <- changedOldClasses)  { 	changedClassesSet = changedClassesSet + changedClass(oneClass); }			
	return changedClassesSet;
}

public set [ClassChange] sanitizeClassChanges(set [ClassChange] inputSet) {
	set [loc] addedClasses = {};
	set [loc] deletedClasses = {};
	set [loc] changedClasses = {};
	set [ClassChange] returnSet = {};
	visit (inputSet) {
		case addedClass(c) : addedClasses += c;
		case deletedClass(c): deletedClasses += c;	    	 
		case changedClass (c): changedClasses += c;
	}	
	visit (inputSet) {
		case cAdded:addedClass(_) : returnSet += cAdded;
		case cDeleted:deletedClass(_): returnSet += cDeleted;	    	 
		case cChanged:changedClass (c): {
			if ((c notin addedClasses) && (c notin deletedClasses) ) { returnSet += cChanged;};	
		}
	}
	return returnSet;
}

public void findAllFieldAndClassChanges(M3 oldModel, M3 newModel) {
	set [loc] oldFields = getPublicFieldsForModel(oldModel);
	set [loc] newFields = getPublicFieldsForModel(newModel);
	
	set [ClassChange] tempClasses = getChangedAddedRemovedClasses(oldModel, newModel) 
									+ getClassesWithFieldChanges(oldModel, newModel, oldFields, newFields);
	for (aClass <- sanitizeClassChanges(tempClasses) ) { classChanges += aClass; }
	
	set [FieldChange] tempFields = getAddedAndRemovedFields(oldModel, newModel, oldFields, newFields);
	for (aField <- tempFields) {fieldChanges += aField; }
	tempFields = getAllChangedFields(oldModel, newModel, oldFields, newFields);
	for (aField <- tempFields) {fieldChanges += aField; }
}

public void printAllResults() {
	int numOfAddedClasses = 0; int numOfChangedClasses = 0; int numOfDeletedClasses = 0;
	visit (classChanges) {
		case addedClass(_) : numOfAddedClasses += 1;
		case deletedClass(_): numOfDeletedClasses += 1;	    	 
		case changedClass (_): numOfChangedClasses += 1;
	}
	println("Number of added classes <numOfAddedClasses>");
	println("Number of deleted classes <numOfDeletedClasses>");
	println("Number of changed classes <numOfChangedClasses>");
	int numOfAddedFields = 0; int numOfChangedFields = 0; int numOfDeletedFields = 0;	
	visit (fieldChanges) {
		case addedField(_) : numOfAddedFields += 1;
		case deletedField(_): numOfDeletedFields += 1;	    	 
		case changedField (_): numOfChangedFields += 1;
	}
	println("Number of added fields <numOfAddedFields>");
	println("Number of deleted fields <numOfDeletedFields>");
	println("Number of changed fields <numOfChangedFields>");	 
}