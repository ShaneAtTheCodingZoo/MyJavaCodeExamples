package com.thecodingzoo.lessons.advanced;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaInterfaces {
	// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

	public static void main(String[] args) {
		StudentRegistry studentRegistry = new StudentRegistry();
		studentRegistry.registerStudent("Shane");
		studentRegistry.registerStudent("Christina");
		studentRegistry.registerStudent("Nick");
		studentRegistry.registerStudent("Chiayi");

		Consumer<String> consolePrinter = (name) -> {
			System.out.println(name);
		};
		studentRegistry.printAll(consolePrinter);

		studentRegistry.registerStudent("Bella");

		StudentSearch myStudentSearch = (List<String> students,
				String name) -> {

			Predicate<String> mysearchCriteria = student -> student
					.equalsIgnoreCase(name);
			return students.stream().anyMatch(mysearchCriteria);

		};

		boolean isStudentRegistered = studentRegistry
				.isStudentRegistered(myStudentSearch, "Bella");
		System.out.println(isStudentRegistered);


	}

}
