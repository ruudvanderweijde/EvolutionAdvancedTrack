module diff::FieldComparison

import IO;
import List;
import Set;
import Type;
import String;
import Relation;

import diff::Utils;
import diff::DataType;

import util::ValueUI;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;
import lang::java::jdt::m3::AST;

public set[FieldChange] getFieldChanges(M3 oldModel, M3 newModel) {
	set [loc] oldFields = getPublicFieldsForModel(oldModel);
	set [loc] newFields = getPublicFieldsForModel(newModel);
	
	set [FieldChange] fieldChanges = {};
	set [FieldChange] tempFields = getAddedAndRemovedFields(oldModel, newModel, oldFields, newFields);
	
	for (aField <- tempFields) {fieldChanges += aField; }
	tempFields = getAllChangedFields(oldModel, newModel, oldFields, newFields);
	for (aField <- tempFields) {fieldChanges += aField; }
	
	return fieldChanges;
}

// This method returns the set of FieldChanges form added and removed fields only 
private set [FieldChange]  getAddedAndRemovedFields(M3 oldModel, M3 newModel, set [loc] oldPublicFields, 
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
private set [FieldChange]  getAllChangedFields(M3 oldModel, M3 newModel, set [loc] oldPublicFields, 
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

private bool isFieldModifierChanged (M3 oldModel, M3 newModel, loc fieldName) {
	return (getModifiersOfField(oldModel, fieldName) != getModifiersOfField(newModel, fieldName)) ;
}

private set [Modifier] getModifiersOfField(M3 theModel, loc fieldName) {
	return {model.modifier | model <-theModel@modifiers, model.definition == fieldName};
}

// <|java+field:///MyHelloWorld/zbb|,|java+primitiveType:///boolean|>
// rel[loc from,loc to]
private bool isFieldTypeChanged (M3 oldModel, M3 newModel, loc fieldName) {
	return (getTypeOfField(oldModel, fieldName) != getTypeOfField(newModel, fieldName)) ;
}

private loc getTypeOfField (M3 theModel, loc fieldName) {
	list [loc] typeList = [theType.to | theType <- theModel@typeDependency,  theType.from == fieldName];
	return typeList[0];
}

// This method takes set of fields as argument and returns a set of fields which are
// defined in public classes or interfaces only
private set [loc] takeFieldsInPublicClasses (M3 model, set[loc] fields) {
	set [loc] publicClasses = getPublicClassesAndInterfaces(model);
	set [loc] takenFields = {};
	for (aField <- fields ) {
		if (getClassOfAField(model, aField) in publicClasses) {
			takenFields += aField;
		}
	}
	return takenFields;
}