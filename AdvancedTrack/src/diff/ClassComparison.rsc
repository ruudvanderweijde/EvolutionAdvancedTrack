module diff::ClassComparison


import IO;
import ValueIO;
import Map;
import List;
import Set;
import util::Math;
import DateTime;

import lang::java::m3::Core;
import lang::java::jdt::m3::Core;
import lang::java::jdt::m3::AST;

import diff::DataType;
import diff::Utils;
import diff::ProjectAST;

public set[ClassChange] getClassChanges(M3 oldModel, M3 newModel, set[FieldChange] fieldChanges, set[MethodChange] methodChanges) {
	set [loc] oldFields = getPublicFieldsForModel(oldModel);
	set [loc] newFields = getPublicFieldsForModel(newModel);
	
	set [ClassChange] classChanges = {};
	set [ClassChange] tempClasses = getChangedAddedRemovedClasses(oldModel, newModel) 
									+ getClassesWithContentChanges(oldModel, newModel, fieldChanges, methodChanges);
	for (aClass <- sanitizeClassChanges(tempClasses) ) { classChanges += aClass; }
	return classChanges;
}

private set [Modifier] getModifiersOfClass(M3 theModel, loc className) {
	return {model.modifier | model <-theModel@modifiers, model.definition == className};
}

private bool isClassModifierChanged (M3 oldModel, M3 newModel, loc className) {
	return (getModifiersOfClass(oldModel, className) != getModifiersOfClass(newModel, className)) ;
}

// Return the set of ClassChanges for added and removed classes, and also 
// for the classes for which modifiers have changed or are deprecated
private set [ClassChange] getChangedAddedRemovedClasses(M3 oldModel, M3 newModel) {
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
		{ 	if  (	isClassModifierChanged(oldModel, newModel, oneClass) ) { 
				changedClassesSet += classModifierChanged(oneClass, getModifiersOfClass(oldModel, oneClass),
																	getModifiersOfClass(newModel, oneClass)
														 );
				} 
			else {
					if ( isDeprecated(oneClass, oldDeprecations, newDeprecations))  {
						changedClassesSet += classDeprecated(oneClass);
					}
					else 
						if ( isUndeprecated(oneClass, oldDeprecations, newDeprecations, newClasses)) {
						changedClassesSet += classUndeprecated(oneClass);					
					}
			}
		}
	return changedClassesSet;
}

// Get the classes which will be marked as changed because they contain
// a changed, deleted or removed field/method.
private set [ClassChange] getClassesWithContentChanges(M3 oldModel, M3 newModel,
													set[FieldChange] fieldChanges, 
													set[MethodChange] methodChanges) {
													
	map[loc classLoc, set[loc] contentLocs] changes = ();
	for (FieldChange fieldChange <- fieldChanges) {
		visit(fieldChange) {
			case fieldModifierChanged(locator, _, _) : {
				loc classLocator = getClassOfAField(newModel, locator);
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case fieldTypeChanged(locator, _, _) : {
				loc classLocator = getClassOfAField(newModel, locator);
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case fieldDeprecated(locator) : {
				loc classLocator = getClassOfAField(newModel, locator);
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case fieldUndeprecated(locator) : {
				loc classLocator = getClassOfAField(newModel, locator);
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case addedField(locator): {
				loc classLocator = getClassOfAField(newModel, locator);
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case deletedField(locator): {
				loc classLocator = getClassOfAField(oldModel, locator);
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
		}
	}
	
	for (MethodChange methodChange <- methodChanges) {
		visit(methodChange) {
			case deprecated(locator): {
				loc classLocator = getClassOfAMethod(newModel, locator);
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case undeprecated(locator): {
				loc classLocator = getClassOfAMethod(newModel, locator);
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case signatureChanged(old,_): {
				loc classLocator = getClassOfAMethod(newModel, old);
				changes = addContentChangeToMap(changes, classLocator, old);
			}
			case returnTypeChanged(locator, _, _): {
				loc classLocator = getClassOfAMethod(newModel, locator);
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case modifierChanged(locator, _, _): {
				loc classLocator = getClassOfAMethod(newModel, locator);
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case added(locator): {
				loc classLocator = getClassOfAMethod(newModel, locator);
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case deleted(locator): {
				loc classLocator = getClassOfAMethod(oldModel, locator);
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
		}
	}
	return { classContentChanged(classLocator, changes[classLocator]) | loc classLocator <- changes };
}

private map[loc classLoc, set[loc] contentLocs] addContentChangeToMap(map[loc classLoc, set[loc] contentLocs] oldMap, loc classLocator, loc contentChange) {
	if (classLocator in oldMap) {
		set[loc] contentChanges = oldMap[classLocator];
		contentChanges += contentChange;
		oldMap[classLocator] = contentChanges;
	} else {
		oldMap += (classLocator: {contentChange} );
	}
	return oldMap;
}


private bool isNotInAddedOrDeleted(loc c, set [loc] addedClasses, set [loc] deletedClasses) {
	return (c notin addedClasses) && (c notin deletedClasses) ;
}

private set [ClassChange] sanitizeClassChanges(set [ClassChange] inputSet) {
	set [loc] addedClasses = {};
	set [loc] deletedClasses = {};
	set [loc] changedClasses = {};
	set [ClassChange] returnSet = {};
	visit (inputSet) {
		case addedClass(c) : addedClasses += c;
		case deletedClass(c): deletedClasses += c;	    	 
		case classContentChanged (c, _) : changedClasses += c;
		case classModifierChanged (c, _, _) : changedClasses += c;
		case classDeprecated(c): changedClasses += c;
		case classUndeprecated(c): changedClasses += c;		
	}	
	visit (inputSet) {
		case cAdded:addedClass(_) : returnSet += cAdded;
		case cDeleted:deletedClass(_): returnSet += cDeleted;	    	 
		case cChanged:classContentChanged (c, _): { 
			if (isNotInAddedOrDeleted (c, addedClasses, deletedClasses) ) { returnSet += cChanged;};			
		}
		case cChanged:classModifierChanged (c, _, _) : {
			 returnSet += cChanged;
		}
		case cChanged:classDeprecated (c): { 
			 returnSet += cChanged;			
		}
		case cChanged:classUndeprecated (c): { 
			 returnSet += cChanged;			
		}
	}
	return returnSet;
}