module cigdem::CreateM3s

import lang::java::m3::Core;
import lang::java::jdt::m3::Core;
import lang::java::jdt::m3::AST;
import ValueIO;
import IO;
import Map;
import List;
import Set;
import util::Math;
import diff::DataType;
import diff::Utils;
import diff::ProjectAST;

public lrel [loc readP, loc writeP] myChangedProjects = 
					[<|project://ChangedProject01|,	|project://tmp//ChangedProject01|>,
					 <|project://ChangedProject02|,	|project://tmp//ChangedProject02|>,
					 <|project://ChangedProject03|,	|project://tmp//ChangedProject03|>,
					 <|project://ChangedProject04|,	|project://tmp//ChangedProject04|>,
					 <|project://ChangedProject05|,	|project://tmp//ChangedProject05|>,
					 <|project://ChangedProject06|,	|project://tmp//ChangedProject06|>,
					 <|project://ChangedProject07|,	|project://tmp//ChangedProject07|>
					]; 
							 		
public list[loc] androidProjects = [|project://AndroidSDK14Sources|];
							 		
public void cigdemsWriteM3Models(lrel [loc readP, loc writeP] projects) {
	for (project <- projects) {
		loc rProject = project.readP; loc wProject = project.writeP;
		writeBinaryValueFile(|project://AdvancedTrack/m3/|+"<wProject.authority><wProject.path>.bin.m3", 
								createM3FromEclipseProject(rProject));
	}
}


public void prepareM3sChangedProjects() {
		cigdemsWriteM3Models(myChangedProjects);
}


