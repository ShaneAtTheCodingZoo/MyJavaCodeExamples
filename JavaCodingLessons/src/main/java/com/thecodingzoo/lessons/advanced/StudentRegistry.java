package com.thecodingzoo.lessons.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StudentRegistry {
	private List<String> students = new ArrayList<>();

	public void registerStudent(String name) {
		students.add(name);
	}

	public void printAll() {

//		//Basic Example
//		students.forEach((String name) -> {
//			System.out.println(name);
//		});
//		
//		//Basic Example - single param - single command shorthand
//		students.forEach(name -> System.out.println(name));
//		
//		// Basic Example Method Inference
//		students.forEach(System.out::println);

		// Not like javascript arrow function. Strongly typed.
//		var printThem = (String name) -> {
//		};
//	}

	}

	public void printAll(Consumer<String> printer) {
		// Example of passing a lambda
		students.forEach(printer);
	}

	public boolean isStudentRegistered(StudentSearch searcher, String name) {
		return searcher.search(students, name);
	}

}