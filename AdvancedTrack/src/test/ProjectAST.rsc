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
	println("<tabs(8,0)>classes<tabs(2,7)>methods<tabs(2,7)>fields");
	println("from<tabs(4,4)>to<tabs(4,2)>+\t-\t+\t-\t+\t-\t");
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

@doc { used in print function to see how many tabs are needed }
private str tabs(int tabs, int size) {
	str string = "";
	int n = (8*tabs)-size;
	do { 
		string += "\t"; 
		n -= 8; 
	} while (n > 0);
	return string;
}
		
@doc { This function returns the differences between a list of M3 models }
public lrel[loc, loc, set[loc], set[loc], set[loc], set[loc], set[loc], set[loc]] compareM3Models(list[M3] models) {
	// precondition
	if (size(models) < 2) { throw "Precondition failed. Need more than 2 models to compare"; }
	
	return {	
		for (int index <- [0..size(models)-1]) {
		
			M3 model1 = models[index];
			M3 model2 = models[index+1];
			
			set[loc] publicMethods1 = getPublicMethodsForModel(model1);
			set[loc] publicMethods2 = getPublicMethodsForModel(model2);
			
			set[loc] publicClasses1 = getPublicClassesForModel(model1);
			set[loc] publicClasses2 = getPublicClassesForModel(model2);
			
			set[loc] publicFields1 = getPublicFieldsForModel(model1);
			set[loc] publicFields2 = getPublicFieldsForModel(model2);
		
			append(<model1.id,							// loc from
					model2.id,							// loc to
					publicClasses2 - publicClasses1,	// set[loc] ca - classes added
					publicClasses1 - publicClasses2,	// set[loc] cr - classes removed
					publicMethods2 - publicMethods1,	// set[loc] ma - methods added
					publicMethods1 - publicMethods2,	// set[loc] mr - methods removed
					publicFields2 - publicFields1,		// set[loc] fa - fields added
					publicFields1 - publicFields2>);	// set[loc] fr - fields removed
		}
	}
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