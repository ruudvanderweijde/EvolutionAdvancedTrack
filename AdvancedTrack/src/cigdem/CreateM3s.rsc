module cigdem::CreateM3s

import lang::java::m3::Core;
import lang::java::jdt::m3::Core;
import lang::java::jdt::m3::AST;
import IO;
import Map;
import List;
import Set;
import util::Math;
import \test::ProjectAST;

public list[loc] myTestProjects = [	|project://ChangedProject01|,
							 		|project://ChangedProject02|,
							 		|project://ChangedProject03|,
							 		|project://ChangedProject04|,
							 		|project://ChangedProject05|,
							 		|project://ChangedProject06|,
							 		|project://ChangedProject07|
							 		]; 
							 		
							 		
public void prepareM3s() {
		writeM3Models(myTestProjects);
}

