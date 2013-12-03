@doc { Generate the diff between M3 models from different sources }
module diff::DifferentSources

import IO;

import diff::DataType;
import diff::Utils;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;
import analysis::m3::Core;

// what do we need?
// - missing annotations
// - diff in annotations

public void run() {
	M3 model1 = getM3ModelByName("FerryAndroid4");
	M3 model2 = getM3ModelByName("platform_development-android-1.6_r1");
	CompareM3(model1, model2);
}

public void CompareM3(M3 model1, M3 model2) {
	// checki missing annotations
	// annotations of m3 model

	CompareDeclarations(model1, model2);		
 // m@declarations 
 // m@uses 
 // m@containment 
 // m@documentation 
 // m@modifiers 
 // m@messages 
 // m@names 
 // m@types 
//
 // m@extends 
 // m@implements 
 // m@methodInvocation 
 // m@fieldAccess 
 // m@typeDependency 
 // m@methodOverrides 
	
}


public str CompareDeclarations(M3 model1, M3 model2) {

}



