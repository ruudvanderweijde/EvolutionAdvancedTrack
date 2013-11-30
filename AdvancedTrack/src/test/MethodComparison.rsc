module \test::MethodComparison

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

data MethodChange = unchanged(loc locator) | pushup(loc previous, loc new) | pulldown(loc previous, loc new) | deprecated(loc locator) | added(loc locator) | deleted(loc locator);

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
	map[loc, set[loc]] modelHierarchy1 = getModelHierarchy(old);
	map[loc, set[loc]] modelHierarchy2 = getModelHierarchy(new);
	
	set[loc] deprecatedMethods = findDeprecatedMethods(new);
	
	set[MethodChange] methodTransitions = {};
	for (loc classOrInterface <- modelHierarchy1) {
		set[loc] methodsInClassOrInterface1 = modelHierarchy1[classOrInterface];
		if (classOrInterface notin modelHierarchy2) {
			//TODO: find out if we need to count class change here.
			continue;
		}
		set[loc] methodsInClassOrInterface2 = modelHierarchy2[classOrInterface];
	
		for (loc method <- methodsInClassOrInterface1) {
			println(method);
			if (method in methodsInClassOrInterface2) {
				
				if (method in deprecatedMethods) {
					methodTransitions += deprecated(method);
				} else {
					methodTransitions += unchanged(method);
				}
			
				//methodTransitions += (method in deprecatedMethods) ? deprecated(method) : unchanged(method);
			} else if (false) {
				//TODO: implement changed signature
				//Multiple changes possible?
				//versionChanges += transition(method, newMethod);
				changedMethods += methodNameGroup;
			} else {
				//It was deleted.
				//methodTransitions += deleted(methodNameGroup);
				int i = 0;
			}
		}
	}
	
	//set[MethodNameGroup] addedMethods = modelHierarchy2 - modelHierarchy1;
	//for (MethodNameGroup addedMethod <- addedMethods) {
	//	methodTransitions += addition(addedMethod);
	//}
	//
	return methodTransitions;
}

private set[loc] findDeprecatedMethods(M3 model) {
	rel[loc from, loc to] typeDependencies = model@typeDependency;
	return {typeDependency.from | typeDependency <- typeDependencies, typeDependency.to == |java+interface:///java/lang/Deprecated|};
}


private map[loc, set[loc]] getModelHierarchy(M3 model) {
    map[loc class, set[loc] methods] methodsPerClassInterface = ();
    
    set[loc] projectClasses = classes(model);
    set[loc] projectInterfaces = interfaces(model);
    /*
        TODO: find out if interface and class inner classes and methods are represented
        set[loc] projectInnerClasses = nestedClasses();
    */
    set[loc] projectClassesAndInterfaces = projectClasses + projectInterfaces;
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