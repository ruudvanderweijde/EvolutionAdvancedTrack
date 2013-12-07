module diff::MethodComparison

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

// represents a method signature
data MethodSignature = nil() 
					   | methodSignature(str name, list[Modifier] modifiers, Type returnType, loc location, list[Declaration] params, list[Expression] exceptions)
					   | constructorSignature(str name, list[Modifier] modifiers, loc location, list[Declaration] params, list[Expression] exceptions);

// represents a parameter without considering its name
data NamelessParameter = vararg(Type \type) | namelessParameter(Type \type, int extraDimensions);

data MethodChange = unchanged(loc locator) | returnTypeChanged(loc method, TypeSymbol oldType, TypeSymbol newType) | signatureChanged(loc old, loc new) | deprecated(loc locator) | added(loc locator) | deleted(loc locator);

anno loc MethodChange @ class;
anno loc MethodChange @ package;

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
	
	rel[loc name, TypeSymbol typ] oldTypes = old@types;
	rel[loc name, TypeSymbol typ] newTypes = new@types;
	
	loc class = |file:///|;
	loc package = |file:///|;
	
	set[MethodChange] methodTransitions = {};
	for (loc classOrInterface <- modelHierarchyOld) {
		class = classOrInterface;
		assert isClass(class) || isInterface(class);
		package = getClassPackage(old, class);
		assert isPackage(package);
		
		set[loc] methodsInClassOrInterfaceOld = modelHierarchyOld[classOrInterface];
		if (classOrInterface notin modelHierarchyNew) {
			//TODO: find out if we need to count class change here.
			continue;
		}
		
		set[loc] changedMethods = {};
		
		set[loc] methodsInClassOrInterfaceNew = modelHierarchyNew[classOrInterface];
		for (loc method <- methodsInClassOrInterfaceOld) {
				
				//Signature changes
				loc newMethod = findSignatureChange(method, methodsInClassOrInterfaceOld, methodsInClassOrInterfaceNew);
				if (newMethod != |file:///|) {
					println("change <method> to <newMethod>");
					MethodChange signatureChanged = signatureChanged(method, newMethod);
					//signatureChanged@class = class;
					//signatureChanged@package = package; 
					methodTransitions += signatureChanged;
					changedMethods += method;
				}
				
				//Newly deprecated methods
				if (method notin deprecatedMethodsOld && method in deprecatedMethodsNew) {
					MethodChange deprecated = deprecated(method);
					//deprecated@class = class;
					//deprecated@package = package;
					methodTransitions += deprecated;
                    changedMethods += method;
	            }
	            
	            //Return type changed
	            tuple[bool changed, TypeSymbol oldType, TypeSymbol newType] returnTypeComparison = findMethodReturnTypeChange(method, oldTypes, newTypes);
	            if (returnTypeComparison.changed) {
	            	MethodChange returnTypeChanged = returnTypeChanged(method, returnTypeComparison.oldType, returnTypeComparison.newType);
	            	methodTransitions += returnTypeChanged;
	            	changedMethods += method;
	            }
	            
	            //Unchanged method
				if(method notin changedMethods) {
					MethodChange unchanged = unchanged(method);
					//unchanged@class = class;
					//unchanged@package = package;
					methodTransitions += unchanged;
				}
		}
		
		set[loc] addedMethods = methodsInClassOrInterfaceNew - methodsInClassOrInterfaceOld - changedMethods;
		for (loc addedMethod <- addedMethods) {
			MethodChange added = added(addedMethod);
			added@class = class;
			added@package = package;
			methodTransitions += added;;
		}

		set[loc] deletedMethods = methodsInClassOrInterfaceOld - methodsInClassOrInterfaceNew - changedMethods;
		for (loc deletedMethod <- deletedMethods) {
			methodTransitions += deleted(deletedMethod);
		}
	}
	
	return methodTransitions;
}

private loc findSignatureChange(loc method, set[loc] oldMethods, set[loc] newMethods) {
    tuple[str methodName, list[str] parameters] methodNameAndParametersOld = extractMethodNameAndParameters(method);
  
        // Get all old methods with the same name
        set[loc] methodsWithEqualNameOld = { m | m <- oldMethods, methodNameAndParametersOld.methodName == extractMethodNameAndParameters(m)[0] }; 
        set[loc] methodsWithEqualNameNew = { m | m <- newMethods, methodNameAndParametersOld.methodName == extractMethodNameAndParameters(m)[0] };
        bool equalSize = size(methodsWithEqualNameOld) == size(methodsWithEqualNameNew);
        // No overloading in case equalSize == 1
        // TODO: no relation from old method to new method?
      	if (equalSize) {
      		loc oldMethod = getOneFrom(methodsWithEqualNameOld);
      		loc newMethod = getOneFrom(methodsWithEqualNameNew);
      		
      		list[str] oldParams = extractMethodNameAndParameters(oldMethod)[1];
      		list[str] newParams = extractMethodNameAndParameters(newMethod)[1];
      	
			// check if the size is one (no overloading) and the parameters differ
			// TODO: take into account different parameter sizes
      		if (size(methodsWithEqualNameOld) == 1 && oldParams != newParams) {
      			println("sig change!!!!!");       
            	return newMethod;
            } 
        }       

    return |file:///|;
}

private tuple[bool changed, TypeSymbol old, TypeSymbol new] findMethodReturnTypeChange(loc method, rel[loc, TypeSymbol] oldTypes, rel[loc, TypeSymbol] newTypes) {
	try {
		set[TypeSymbol] oldMethodTypes = oldTypes[method];
		set[TypeSymbol] newMethodTypes = newTypes[method];
		TypeSymbol oldReturn = getOneFrom(oldMethodTypes).returnType;
		TypeSymbol newReturn = getOneFrom(newMethodTypes).returnType;
		return <oldReturn != newReturn, oldReturn, newReturn>;
	}
	catch x: {
		println("Trouble analysing return types for method <method>.");
		return <false, \void(), \void()>;
	}
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
	rel[loc declaration, loc annotation] annotationRel = model@annotations;
	return {annotationTuple.declaration | annotationTuple <- annotationRel, annotationTuple.annotation == |java+interface:///java/lang/Deprecated|};
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

/*
public M3 createAndroidM3() {
	loc androidFolder = |file:///Users/abort/Documents/UvA/Software_Evolution/advanced-track-repository/android/|;
	set[str] androidVersionFolders = { "android-1.6_r1.1", "android-2.0_r1" };
	set[str] sources = { "framework-apache-http/src", "framework-base/awt" };
	
	set[loc] directories = {}
	for (v <- androidVersionFolders) {
		loc androidVersionFullPath = androidFolder + v;
		for (s <- sources) {
			directories += (androidFullPath + s);
		}
	}

	return createM3FromDirectory(androidFolder, directories);  
}
*/

public M3 createM3FromDirectory(loc project, set[loc] sources, str javaVersion = "1.7") {
    if (!(isDirectory(project))) throw "<project> is not a valid directory";
    set[loc] classPaths = {};
    set[loc] sourcePaths = {};
    for (s <- sources) {
	    classPaths += getPaths(s, "class") + find(s, "jar");
    	sourcePaths += getPaths(s, "java");
	}

    //setEnvironmentOptions(project);
    setEnvironmentOptions(classPaths, sourcePaths);
    M3 result = m3(project);
    for (sp <- sourcePaths) {
      result = composeJavaM3(project, { createM3FromFile(f, javaVersion = javaVersion) | loc f <- find(sp, "java") });
    }
    registerProject(project, result);
    return result;
}

@memo public map[loc,set[loc]] parents(M3 m) = toMap(invert(m@containment));

@doc { Return the package URI for a given class URI. }
public loc getClassPackage(M3 m, loc c) {
	set[loc] parents = parents(m)[c]?{};
	if (isEmpty(parents)) {
		return unknownPackage(c);
	}
	loc parent = getUniqueElement(parents);
	return isPackage(parent) ? parent : getClassPackage(m, parent);
}

private &T getUniqueElement(set[&T] s) {
	assert size(s) == 1;
	return getOneFrom(s);
}