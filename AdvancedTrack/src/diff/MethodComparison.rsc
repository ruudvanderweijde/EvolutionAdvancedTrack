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

public set[MethodChange] getMethodChanges(M3 old, M3 new) {
	map[loc, set[loc]] modelHierarchyOld = getModelHierarchy(old);
	map[loc, set[loc]] modelHierarchyNew = getModelHierarchy(new);
	
	set[loc] deprecatedMethodsOld = findDeprecations(old);
	set[loc] deprecatedMethodsNew = findDeprecations(new);
	
	rel[loc name, TypeSymbol typ] oldTypes = old@types;
	rel[loc name, TypeSymbol typ] newTypes = new@types;
	
	loc class = |file:///|;
	loc package = |file:///|;
	
	set[MethodChange] methodTransitions = {};
	for (loc classOrInterface <- modelHierarchyOld) {
		class = classOrInterface;
		assert isClass(class) || isInterface(class);
		package = getClassPackage(old, class);
		//assert isPackage(package);
		
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
	            
				//Newly deprecated methods
				if (isDeprecated(method, deprecatedMethodsOld, deprecatedMethodsNew)) {
					MethodChange undeprecated = undeprecated(method);
					//deprecated@class = class;
					//deprecated@package = package;
					methodTransitions += undeprecated;
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
			//added@class = class;
			//added@package = package;
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
		//println("Trouble analysing return types for method <method>.");
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

private map[loc, set[loc]] getModelHierarchy(M3 model) {
    map[loc class, set[loc] methods] methodsPerClassInterface = ();
        /*
        TODO: find out if interface and class inner classes and methods are represented
        set[loc] projectInnerClasses = nestedClasses();
    */
    set[loc] projectClassesAndInterfaces = getPublicClassesAndInterfaces(model);
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

@memo private map[loc,set[loc]] parents(M3 m) = toMap(invert(m@containment));

@doc { Return the package URI for a given class URI. }
private loc getClassPackage(M3 m, loc c) {
	return |file:///|;
	set[loc] parents = parents(m)[c]?{};
	if (isEmpty(parents)) {
		return |file:///|;
	}
	loc parent = getUniqueElement(parents);
	return isPackage(parent) ? parent : getClassPackage(m, parent);
}

private &T getUniqueElement(set[&T] s) {
	//assert size(s) == 1;
	return getOneFrom(s);
}