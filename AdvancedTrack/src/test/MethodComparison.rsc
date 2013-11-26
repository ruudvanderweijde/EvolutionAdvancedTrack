module \test::MethodComparison

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;

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
			methodTransitions += deletion(method);
		}
	}
	
	set[loc] addedMethods = publicMethods2 - publicMethods1 - changedMethods;
	for (loc addedMethod <- addedMethods) {
		methodTransitions += addition(addedMethod);
	}
	
	return methodTransitions;
}

private set[loc] getPublicMethodsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isMethod(m.definition)};
}