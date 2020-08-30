package com.thecodingzoo.lessons.advanced.done;

import com.thecodingzoo.lessons.advanced.StudentRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {
	//Java Lambdas are first step into functional programming
	//
	public static void main(String[] args) {
		StudentRegistry studentRegistry = new StudentRegistry();
		studentRegistry.registerStudent("Shane");
		studentRegistry.registerStudent("Christina");
		studentRegistry.registerStudent("Nick");
		studentRegistry.registerStudent("Chiayi");
//		studentRegistry.printAll();
		
//		Consumer<String> consolePrinter = (name) -> { 
//			System.out.println(name); 
//		};
//		studentRegistry.printAll(consolePrinter);
	}

	
}
