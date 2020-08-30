package com.thecodingzoo.lessons.advanced;

import java.util.function.Consumer;


public class Lambdas {
	//Java Lambdas are first step into functional programming
	//
	public static void main(String[] args) {
		StudentRegistry studentRegistry = new StudentRegistry();
		studentRegistry.registerStudent("Shane");
		studentRegistry.registerStudent("Christina");
		studentRegistry.registerStudent("Nick");
		studentRegistry.registerStudent("Chiayi");
    	//studentRegistry.printAll();
		
		Consumer<String> consolePrinter = System.out::println; 
	
		studentRegistry.printAll(consolePrinter);
	}

	
}
