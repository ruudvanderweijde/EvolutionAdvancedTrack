module \test::ProjectAST

import IO;
import List;
import Set;
import String;

import ValueIO;

import vis::Figure;
import vis::Render;

import util::ValueUI;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;

@doc {
}
public void run() {
	M3 model_1_0 = createM3FromEclipseProject(|project://GuavaRelease01|);
	M3 model_2_0 = createM3FromEclipseProject(|project://GuavaRelease02|);
	M3 model_3_0 = createM3FromEclipseProject(|project://GuavaRelease03|);
	
	M3 model_14_0 = createM3FromEclipseProject(|project://GuavaRelease14.0|);
	M3 model_14_0_1 = createM3FromEclipseProject(|project://GuavaRelease14.0.1|);
	M3 model_15_0 = createM3FromEclipseProject(|project://GuavaRelease15.0|);
	
//	result = compareM3Models([model_1_0, model_2_0, model_3_0]);
	result = compareM3Models([	model_1_0, 
								model_2_0,
								model_3_0,
								model_14_0, 
								model_14_0_1, 
								model_15_0]);
	
	//iprintln(result);
	readablePrint(result);
	//writeTextValueFile(|project://AdvancedTrack/data/test.txt|, io);
}

public void readablePrint(lrel[loc from, loc to, set[loc] ca, set[loc] cr, set[loc] ma, set[loc] mr, set[loc] fa, set[loc] fr] diff) {
	// print header
	println("\t\t\t\t\t\t\t\tclasses\t\tmethods\t\tfields");
	println("from\t\t\t\tto\t\t\t\t+\t-\t+\t-\t+\t-\t");
	str io = "";
	for (x <- diff) {
		io += "<x.from>"		+ tabs(4, size("<x.from>"));
		io += "<x.to>"			+ tabs(4, size("<x.to>"));
		io += "<size(x.ca)>" 	+ "\t";
		io += "<size(x.cr)>" 	+ "\t";
		io += "<size(x.ma)>" 	+ "\t";
		io += "<size(x.mr)>" 	+ "\t";
		io += "<size(x.fa)>" 	+ "\t";
		io += "<size(x.fr)>" 	+ "\t";
		io += "\n";
	}
	println(io);
}
public str tabs(int tabs, int size) {
	str string = "";
	int n = (8*tabs)-size;
	do { 
		string += "\t"; 
		n -= 8; 
	} while (n > 0);
	return string;
}
		
@doc { This function returns the differences between a list of M3 models }
@memo
public lrel[loc, loc, set[loc], set[loc], set[loc], set[loc], set[loc], set[loc]] compareM3Models(list[M3] models) {
	// precondition
	if (size(models) < 2) { throw "Precondition failed. Need more than 2 models to compare"; }
	
	lrel[loc from, loc to, set[loc] ca, set[loc] cr, set[loc] ma, set[loc] mr, set[loc] fa, set[loc] fr] diff = [];
	
	for (int index <- [0..size(models)-1]) {
	
		model1 = models[index];
		model2 = models[index+1];
		
		publicMethods1 = getPublicMethodsForModel(model1);
		publicMethods2 = getPublicMethodsForModel(model2);
		
		publicClasses1 = getPublicClassesForModel(model1);
		publicClasses2 = getPublicClassesForModel(model2);
		
		publicFields1 = getPublicFieldsForModel(model1);
		publicFields2 = getPublicFieldsForModel(model2);
	
		diff += (<model1.id,
				  model2.id,
				  publicFields2 - publicFields1,
				  publicFields1 - publicFields2,
				  publicClasses2 - publicClasses1,
				  publicClasses1 - publicClasses2,
				  publicMethods2 - publicMethods1,
				  publicMethods1 - publicMethods2>);
	}
	return diff;
}

public set[loc] getPublicMethodsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isMethod(m.definition)};
}
public set[loc] getPublicClassesForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isClass(m.definition)};
}
public set[loc] getPublicFieldsForModel(M3 model) {
	return {m.definition | m <- model@modifiers, m.modifier == \public(), isField(m.definition)};
}