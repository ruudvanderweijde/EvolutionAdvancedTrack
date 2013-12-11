module diff::DataType

import IO;
import List;
import Set;
import String;
import DateTime;
import Relation;

import ValueIO;
import Message;

import vis::Figure;
import vis::Render;

import util::ValueUI;

import diff::DataType;
import diff::Utils;
import diff::MethodComparison;
import cigdem::ClassLevelChanges;

import lang::java::m3::Core;
import lang::java::m3::AST;
import lang::java::jdt::m3::Core;
import analysis::m3::Core;
import util::FileSystem;
import analysis::graphs::Graph;
extend analysis::m3::TypeSymbol;

data Change = transition(loc old, loc new) | addition(loc new) | deletion(loc old);

data VersionTransition = versionTransition(loc oldVersion,
										   loc newVersion,
										   set[ClassChange] classChanges, 
										   set[MethodChange] methodChanges, 
										   set[FieldChange] fieldChanges);

// represents a method signature
data MethodSignature = nil() 
					   | methodSignature(str name, list[Modifier] modifiers, Type returnType, loc location, list[Declaration] params, list[Expression] exceptions)
					   | constructorSignature(str name, list[Modifier] modifiers, loc location, list[Declaration] params, list[Expression] exceptions);

// represents a parameter without considering its name
data NamelessParameter = vararg(Type \type) | namelessParameter(Type \type, int extraDimensions);

data MethodChange = 
				unchanged(loc locator) | 
				returnTypeChanged(loc method, TypeSymbol oldType, TypeSymbol newType) | 
				signatureChanged(loc old, loc new) | 
				deprecated(loc locator) | 
				undeprecated(loc locator) | 
				added(loc locator) | 
				deleted(loc locator);

data FieldChange = 	changedField(loc locator) 
					| addedField(loc locator) 	
					| deletedField(loc locator);

data ClassChange =  changedClass(loc locator) 
					| addedClass(loc locator) 	
					| deletedClass(loc locator);

anno loc MethodChange @ class;
anno loc MethodChange @ package;
