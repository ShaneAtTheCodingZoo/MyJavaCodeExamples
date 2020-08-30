package com.thecodingzoo.lessons.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class StudentRegistry {
	private List<String> students = new ArrayList<>();

	void registerStudent(String name) {
		students.add(name);
	}

	void printAll() {
//		Printer printer = new Printer() {
//			@Override
//			public void print(String name) {
//				System.out.println(name);	
//			}
//			
//		};
		
//		for(String student: students) {
//			printer.print(student);
//		}
		
//		//Basic Example
//		students.forEach((String name) -> {
//			System.out.println(name);
//		});
//		
//		//Basic Example - single param - single command shorthand
//		students.forEach(name -> System.out.println(name));
//		
//		// Basic Example Method Inference
		students.forEach(System.out::println);

		// Not like javascript arrow function. Strongly typed.
//		var printThem = (String name) -> {
//		};
//	}

	}

	void printAll(Consumer<String> printer) {
		// Example of passing a lambda
		students.forEach(printer);
	}

//	private interface Printer {
//		void print(String name);
//	}
	
//	boolean isStudentRegistered(StudentSearch searcher, String name) {
//		return searcher.search(students, name);
//	}

}