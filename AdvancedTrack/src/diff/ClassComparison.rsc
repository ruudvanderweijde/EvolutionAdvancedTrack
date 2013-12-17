module diff::ClassComparison


import IO;
import ValueIO;
import Map;
import List;
import Set;
import util::Math;
import DateTime;
import Relation;

import lang::java::m3::Core;
import lang::java::jdt::m3::Core;


import diff::DataType;
import diff::Utils;

public set[ClassChange] getClassChanges(M3 oldModel, M3 newModel, set[FieldChange] fieldChanges, set[MethodChange] methodChanges) {
	logMessage("Started getClassChanges()",2);
	set [loc] oldFields = getPublicFieldsForModel(oldModel);
	set [loc] newFields = getPublicFieldsForModel(newModel);
	
	set [ClassChange] classChanges = {};
	set [ClassChange] tempClasses = getChangedAddedRemovedClasses(oldModel, newModel) 
									+ getClassesWithContentChanges(oldModel, newModel, fieldChanges, methodChanges);
	for (aClass <- sanitizeClassChanges(tempClasses) ) { classChanges += aClass; }
	return classChanges;
}

// Return the set of ClassChanges for added and removed classes, and also 
// for the classes for which modifiers have changed or are deprecated
private set [ClassChange] getChangedAddedRemovedClasses(M3 oldModel, M3 newModel) {
	logMessage("Started getChangedAddedRemovedClasses()",2);
	set [ClassChange] changedClassesSet = {};
	set [loc] oldClasses = getPublicClassesAndInterfaces(oldModel);
	set [loc] newClasses = getPublicClassesAndInterfaces(newModel);
	set [loc] addedClasses = newClasses - oldClasses;
	set [loc] removedClasses = oldClasses  - newClasses;
	set [loc] commonClasses = oldClasses & newClasses;
	
	set[loc] oldDeprecations = findDeprecations(oldModel);
	set[loc] newDeprecations = findDeprecations(newModel);

	map[loc definition, set[Modifier] modifier] oldModifiers = index(oldModel@modifiers);
	map[loc definition, set[Modifier] modifier] newModifiers = index(newModel@modifiers);
	
	for ( aClass <- addedClasses) { changedClassesSet += addedClass(aClass); }
	for ( rClass <- removedClasses) { changedClassesSet +=  deletedClass(rClass); }
	//logMessage("The number of added classes : <size(addedClasses)>", 2); 
	//logMessage("The number of removed classes : <size(removedClasses)>", 2); 	
	for (loc oneClass <- commonClasses) { 	
		set[Modifier] oldClassModifiers = oneClass in oldModifiers ? oldModifiers[oneClass] : {};
	    set[Modifier] newClassModifiers = oneClass in newModifiers ? newModifiers[oneClass] : {};
		
		if  (oldClassModifiers != newClassModifiers) { 
			changedClassesSet += classModifierChanged(oneClass, oldClassModifiers, newClassModifiers);
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
	logMessage("Started getClassesWithContentChanges()",2);
	map[loc classLoc, set[loc] contentLocs] changes = ();
	map[loc enclosed, loc enclosing] oldEnclosings = getEnclosings(oldModel@containment);
	map[loc enclosed, loc enclosing] newEnclosings = getEnclosings(newModel@containment);
	
	for (FieldChange fieldChange <- fieldChanges) {
		visit(fieldChange) {
			case fieldModifierChanged(locator, _, _) : {
				loc classLocator = oldEnclosings[locator];
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case fieldTypeChanged(locator, _, _) : {
				loc classLocator = oldEnclosings[locator];
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case fieldDeprecated(locator) : {
				loc classLocator = oldEnclosings[locator];
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case fieldUndeprecated(locator) : {
				loc classLocator = oldEnclosings[locator];
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case addedField(locator): {
				loc classLocator = newEnclosings[locator];
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case deletedField(locator): {
				loc classLocator = oldEnclosings[locator];
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
		}
	}
	
	for (MethodChange methodChange <- methodChanges) {
		visit(methodChange) {
			case deprecated(locator): {
				loc classLocator = oldEnclosings[locator];
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case undeprecated(locator): {
				loc classLocator = oldEnclosings[locator];
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case signatureChanged(old,_): {
				loc classLocator = oldEnclosings[old];
				changes = addContentChangeToMap(changes, classLocator, old);
			}
			case returnTypeChanged(locator, _, _): {
				loc classLocator = oldEnclosings[locator];
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case modifierChanged(locator, _, _): {
				loc classLocator = oldEnclosings[locator];
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case added(locator): {
				loc classLocator = newEnclosings[locator];
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
			case deleted(locator): {
				loc classLocator = oldEnclosings[locator];
				changes = addContentChangeToMap(changes, classLocator, locator);
			}
		}
	}
	return { classContentChanged(classLocator, changes[classLocator]) | loc classLocator <- changes };
}

private set [ClassChange] sanitizeClassChanges(set [ClassChange] inputSet) {
	logMessage("Started sanitizeClassChanges()",2);
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
			if (c notin addedClasses && c notin deletedClasses) { returnSet += cChanged;};			
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