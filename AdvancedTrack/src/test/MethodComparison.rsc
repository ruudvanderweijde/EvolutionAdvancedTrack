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

data MethodNameGroup = nilGroup() | methodNameGroup(str name, set[MethodSignature] methods);

data MethodChange = transition(MethodNameGroup old, MethodNameGroup new) | addition(MethodNameGroup new) | deletion(MethodNameGroup old);

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

private bool isNil(MethodNameGroup methodNameGroup) {
	visit(methodNameGroup) {
		case nilGroup(): return true;
	}
	
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
	set[MethodNameGroup] publicMethods1 = getPublicMethodNameGroupsForModel(old);
	set[MethodNameGroup] publicMethods2 = getPublicMethodNameGroupsForModel(new);
	
	set[MethodChange] methodTransitions = {};
	set[MethodNameGroup] changedMethods = {};
	for (MethodNameGroup methodNameGroup <- publicMethods1) {
		if (methodNameGroup in publicMethods2) {
			//Unchanged.
			int i = 0;
			methodTransitions += transition(methodNameGroup, methodNameGroup);
		} else if (false) {
			//TODO: implement changed signature
			//Multiple changes possible?
			//versionChanges += transition(method, newMethod);
			changedMethods += methodNameGroup;
		} else {
			//It was deleted.
			methodTransitions += deletion(methodNameGroup);
			int i = 0;
		}
	}
	
	set[MethodNameGroup] addedMethods = publicMethods2 - publicMethods1 - changedMethods;
	for (MethodNameGroup addedMethod <- addedMethods) {
		methodTransitions += addition(addedMethod);
	}
	
	return methodTransitions;
}


private set[MethodNameGroup] getPublicMethodNameGroupsForModel(M3 model) {
    set[MethodNameGroup] methodNameGroups = {};
    
    // TODO: isnt m.modifer == \public() too specific? we would want public static (final) methods as well  
    // set[loc] methodLocators =  {m.definition | m <- model@modifiers, m.modifier == \public(), isMethod(m.definition)};
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
        //iprintln(locator);
        // if (1 == 1) return {};
        
        // Public methods represented in the class or interface
        set[loc] publicMethods = {m | m <- methods(model, locator), {\public()} <= (methodModifiersMap[m]? ? methodModifiersMap[m] : {})};
        
        // TODO why does this not work?
        // set[Declaration] methodASTS = {getMethodASTEclipse(m, model=model) | m <- publicMethods};
        //set[MethodNameGroup] groups = {getMethodNameGroup(n,
        //iprintln("class: <locator> contains: <publicMethods>");
        
        for (m <- publicMethods) {
            try {
                Declaration methodAST = getMethodASTEclipse(m, model = model);
            }
            catch: iprintln("Method <m> could not be found");       
        }
        //iprintln(methodASTS); 
    }
    
    
    
    /*
    for (loc methodLocator <- methodLocators) {
        try {
            // Note: Kinda weird that we cant get ASTs for methods that are already found
            Declaration methodDeclaration = getMethodASTEclipse(methodLocator, model = model);
            str methodName = methodDeclaration.name;
            // TODO: fill in correct modifiers per method 
            MethodSignature signature = methodSignature(methodName, [], methodDeclaration.\return, methodLocator, methodDeclaration.parameters, methodDeclaration.exceptions);
            MethodNameGroup group = getMethodNameGroup(methodName, methodNameGroups);
            methodNameGroups = methodNameGroups - {group};
            group.methods += {signature};
            methodNameGroups += group;
        }
        catch: println("Did not find a method declaration for method <methodLocator>");     
    }
    
    return methodNameGroups;
    */
    
    return {};
}