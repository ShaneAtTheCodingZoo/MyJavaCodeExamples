package com.thecodingzoo.lessons.advanced.streams.done;

import com.thecodingzoo.lessons.advanced.streams.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapStudentsCollectExample {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Shane", 25, "111-222-3232"));
		students.add(new Student("Ting", 25, "111-222-3232"));
		students.add(new Student("Chiayi", 5, "111-222-3232"));
		
		Set<String> names = students.stream().map(Student::getName)
			.collect(Collectors.toSet()); //Method reference
		
		names.stream().forEach(System.out::println);
	}

}
