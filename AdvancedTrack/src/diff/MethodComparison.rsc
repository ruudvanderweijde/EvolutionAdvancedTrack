module diff::MethodComparison

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;

import IO;
import List;
import Set;
import Type;
import String;

import vis::Figure;
import vis::Render;

import util::ValueUI;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;   
import lang::java::jdt::m3::AST;

// represents a method signature
data MethodSignature = nil() 
					   | methodSignature(str name, list[Modifier] modifiers, Type returnType, loc location, list[Declaration] params, list[Expression] exceptions)
					   | constructorSignature(str name, list[Modifier] modifiers, loc location, list[Declaration] params, list[Expression] exceptions);

// represents a parameter without considering its name
data NamelessParameter = vararg(Type \type) | namelessParameter(Type \type, int extraDimensions);

data MethodChange = unchanged(loc locator) | signatureChanged(loc old, loc new) | deprecated(loc locator) | added(loc locator) | deleted(loc locator);

public MethodSignature convertDeclarationToSignature(Declaration decl) {
	MethodSignature signature = nil();
	visit(decl) {
		case \constructor(str name, list[Declaration] parameters, list[Expression] exceptions, _): signature = nil();
		case \method(Type \return, str name, list[Declaration] parameters, list[Expression] exceptions, _): signature = nil();
		case \method(Type \return, str name, list[Declaration] parameters, list[Expression] exceptions): signature = nil();
	}

	return signature;
}

private bool isNil(MethodSignature signature) {
	visit (signature) {
		case nil(): return true;
	};

	return false;
}

public bool checkSignatureChange(MethodSignature signatureA, MethodSignature signatureB, bool considerParameterNames) {
	if (isNil(signatureA) || isNil(signatureB)) return false;

	// this actually works as this is interpreted on runtime :)
    if (signatureA.location != signatureB.location) return true;
    
    if (signatureA.modifiers != signatureB.modifiers) return true;
    
    bool changedParameters = false;
    
    if (!considerParameterNames) equalParameters = (signatureA.params != signatureB.params);
    else {
        list[NamelessParameter] paramsA = extractParametersWithoutNames(signatureA);
        list[NamelessParameter] paramsB = extractParametersWithoutNames(signatureB);
        
        changedParameters = (paramsA != paramsB);
    }
    
    if (signatureA.returnType != SignatureB.returnType) return true;
    
    // results in no change if none of the fields have changed
    return (signatureA.exceptions != SignatureB.exceptions);
}

public list[NamelessParameter] extractParametersWithoutNames(MethodSignature signature) {
    list[NamelessParameter] paramsList = [];

    for (params <- signature.params) {
        visit(params) {
            case \parameter(Type \type, _, int extraDimensions): paramsList += namelessParameter(\type, extraDimensions);
            case \vararg(Type \type): paramsList += varargs(\type);
        };
    }
    
    return paramList;
}

public set[MethodChange] getMethodChanges(M3 old, M3 new) {
	map[loc, set[loc]] modelHierarchyOld = getModelHierarchy(old);
	map[loc, set[loc]] modelHierarchyNew = getModelHierarchy(new);
	
	set[loc] deprecatedMethodsOld = findDeprecatedMethods(old);
	set[loc] deprecatedMethodsNew = findDeprecatedMethods(new);
	
	set[MethodChange] methodTransitions = {};
	for (loc classOrInterface <- modelHierarchyOld) {
		
		set[loc] methodsInClassOrInterfaceOld = modelHierarchyOld[classOrInterface];
		if (classOrInterface notin modelHierarchyNew) {
			//TODO: find out if we need to count class change here.
			continue;
		}
		
		set[loc] changedMethods = {};
		
		set[loc] methodsInClassOrInterfaceNew = modelHierarchyNew[classOrInterface];
		for (loc method <- methodsInClassOrInterfaceOld) {
			if (method in methodsInClassOrInterfaceNew) {
				if (method notin deprecatedMethodsOld && method in deprecatedMethodsNew) {
					methodTransitions += deprecated(method);
					changedMethods += method;
				} else {
					methodTransitions += unchanged(method);
				}
			}
			else {
				tuple[set[loc] added, set[loc] deleted, set[tuple[loc old, loc new]] changed] sigs = findSignatureChange(method, methodsInClassOrInterfaceOld, methodsInClassOrInterfaceNew);
				for (change <- sigs.changed) {
					methodTransitions += signatureChanged(change.old, change.new);
					changedMethods += method;
				}
				
				for (delete <- sigs.deleted) {
					methodTransitions += deleted(delete);
				}
				
				for (add <- sigs.added) {
					methodTransitions += added(add);
				}
			}
		}
		
		set[loc] addedMethods = methodsInClassOrInterfaceNew - methodsInClassOrInterfaceOld - changedMethods;
		for (loc addedMethod <- addedMethods) {
			methodTransitions += added(addedMethod);
		}
	}
	
	return methodTransitions;
}

/*private loc findSignatureChange(loc method, set[loc] oldMethods, set[loc] newMethods) {
	tuple[str methodName, list[str] parameters] methodNameAndParametersOld = extractMethodNameAndParameters(method);
	for (loc newMethod <- newMethods) {
		tuple[str methodName, list[str] parameters] methodNameAndParametersPossibleNew = extractMethodNameAndParameters(newMethod);
		if (methodNameAndParametersPossibleNew.methodName == methodNameAndParametersOld.methodName && newMethod notin oldMethods) {
			return newMethod;
		}
	}
	return |file:///|; //Not found.
}*/

private tuple[set[loc], set[loc], set[tuple[loc old, loc new]]] findSignatureChange(loc method, set[loc] oldMethods, set[loc] newMethods) {
    tuple[str methodName, list[str] parameters] methodNameAndParametersOld = extractMethodNameAndParameters(method);
    
        // Get all old methods with the same name
        set[loc] methodsWithEqualNameOld = { m | m <- oldMethods, methodNameAndParametersOld.methodName == extractMethodNameAndParameters(m)[0] }; 
        set[loc] methodsWithEqualNameNew = { m | m <- newMethods, methodNameAndParametersOld.methodName == extractMethodNameAndParameters(m)[0] };
        bool equalSize = size(methodsWithEqualNameOld) == size(methodsWithEqualNameNew);
		set[loc] added = {}, deleted = {};
		set[tuple[loc old, loc new]] changed = {};        
        // No overloading in case equalSize == 1
        // TODO: no relation from old method to new method?
		bool change = false;  		
      	if (equalSize) {
      		if (size(methodsWithEqualNameOld) == 1) {       
            	changed += <getOneFrom(methodsWithEqualNameOld), getOneFrom(methodsWithEqualNameNew)>;
            	change = true;
            }
        }       
        
        if (!change) {
			deleted += methodsWithEqualNameOld - methodsWithEqualNameNew;
			added += methodsWithEqualNameNew - methodsWithEqualNameOld;
        }

    return <added, deleted, changed>;
}

private tuple[str, list[str]] extractMethodNameAndParameters(loc method) {
	str fullUri = method.uri;
	
	str methodSegment = last(split("/", fullUri));
	int openingBracket = findFirst(methodSegment, "("), closingBracket = findFirst(methodSegment, ")");
	str methodName = substring(methodSegment, 0, openingBracket);
	str parametersSegment = substring(methodSegment, openingBracket+1, closingBracket);
	
	list[str] parameters = split(",", parametersSegment);
	return <methodName, parameters>;
}

private set[loc] getParentHierarchy(loc classOrInterface, M3 model) {
	set[loc] totalParentsFound = {};
	bool done = false;
	while (!done) {
		set[loc] parentsFound = { x.to | x <- model@extends, x.from == classOrInterface };
		totalParentsFound += parentsFound; // parents, one max in java :), our set will be of size 1 max
		if (isEmpty(parentsFound)) {
			done = true;
			break;
		}
		assert(size(parentsFound) == 1);
		classOrInterface = getOneFrom(parentsFound);
	}
	
	return totalParentsFound;
}


private set[loc] getChildrenHierarchy(loc classOrInterface, M3 model) {
	set[loc] getChildrenOfChild(loc locator) { return getChildrenHierarchy(locator, model); }
	set[loc] childrenFound = { x.from | x <- model@extends, x.to == classOrInterface }; // children, can be more than one
	set[set[loc]] recursiveChildren = (mapper(childrenFound, getChildrenOfChild)); 	// Gather childrens children
	return childrenFound + ({} | it + e | set[loc] e <- recursiveChildren);
}

// java+method://package/path/Main/Main(args)
public tuple[bool, loc] findMethodInInheritanceHierarchy(loc method, M3 model, map[loc, set[loc]] modelHierarchy, loc encapsulatingClassOrInterface) {
	str methodToFind = method.file; // gets last segment 

	// TODO: might figure a great transitive closure out here :)
	parentClasses = getParentHierarchy(encapsulatingClassOrInterface, model);
	childClasses = getChildrenHierarchy(encapsulatingClassOrInterface, model);
	println("method to find in hierarchy <method> will search in <childClasses>");
	// TODO: tuple[bool found, loc newPath]
	return <false, method>;
}

// TODO: for public methods only
private set[loc] findDeprecatedMethods(M3 model) {
	rel[loc from, loc to] typeDependencies = model@typeDependency;
	return {typeDependency.from | typeDependency <- typeDependencies, typeDependency.to == |java+interface:///java/lang/Deprecated|};
}


private map[loc, set[loc]] getModelHierarchy(M3 model) {
    map[loc class, set[loc] methods] methodsPerClassInterface = ();
        /*
        TODO: find out if interface and class inner classes and methods are represented
        set[loc] projectInnerClasses = nestedClasses();
    */
    set[loc] projectClassesAndInterfaces = getPublicClassesAndInterfacesForModel(model);
    methodModifiersMap = toMap(model@modifiers);
    
    //TODO: great stuff!
    // iprintln(declaredMethods(model));
    // iprintln(methodModifiersMap);
    for (loc locator <- projectClassesAndInterfaces) {
        // Public methods represented in the class or interface
        set[loc] publicMethods = {m | m <- methods(model, locator), \public() in (methodModifiersMap[m]? ? methodModifiersMap[m] : {})};
        methodsPerClassInterface += (locator:publicMethods);
    }
    return methodsPerClassInterface;
}

private set[loc] getPublicClassesAndInterfacesForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isClass(m.definition) || isInterface(m.definition)};
}