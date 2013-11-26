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
					   | methodSignature(str name, list[Modifier] modifiers, TypeSymbol returnType, loc location, list[Declaration] params, list[Expression] exceptions)
					   | constructorSignature(str name, list[Modifier] modifiers, loc location, list[Declaration] params, list[Expression] exceptions);

// represents a parameter without considering its name
data NamelessParameter = vararg(Type \type) | namelessParameter(Type \type, int extraDimensions);

public MethodSignature convertDeclarationToSignature(Declaration decl) {
	MethodSignature signature = nil();
	visit(decl) {
		case \constructor(str name, list[Declaration] parameters, list[Expression] exceptions, _): signature = nil();
		case \method(Type \return, str name, list[Declaration] parameters, list[Expression] exceptions, _): signature = nil();
		case \method(Type \return, str name, list[Declaration] parameters, list[Expression] exceptions): signature = nil();
	}

	return signature;
}

public bool isNil(MethodSignature signature) {
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

//TODO: change LOC to method signature
data MethodNameGroup = methodNameGroup(str name, list[loc] methods);
data MethodChange = transition(MethodNameGroup old, MethodNameGroup new) | addition(MethodNameGroup new) | deletion(MethodNameGroup old);

public set[MethodChange] getMethodChanges(M3 old, M3 new) {
	set[loc] publicMethods1 = getPublicMethodsForModel(old);
	set[loc] publicMethods2 = getPublicMethodsForModel(new);
	
	set[MethodChange] methodTransitions = {};
	set[loc] changedMethods = {};
	for (loc method <- publicMethods1) {
		if (method in publicMethods2) {
			//Unchanged.
			int i = 0;
			//methodTransitions += transition(method, method);
		} else if (false) {
			//TODO: implement changed signature
			//Multiple changes possible?
			//versionChanges += transition(method, newMethod);
			changedMethods += method;
		} else {
			//It was deleted.
			//methodTransitions += deletion(method);
			int i = 0;
		}
	}
	
	set[loc] addedMethods = publicMethods2 - publicMethods1 - changedMethods;
	for (loc addedMethod <- addedMethods) {
		//methodTransitions += addition(addedMethod);
		int i = 0;
	}
	
	return methodTransitions;
}

private set[loc] getPublicMethodsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isMethod(m.definition)};
}