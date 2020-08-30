package com.thecodingzoo.lessons.advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminatingWithCollectorsExample {

	public static void main(String[] args) {
		List<Integer> myNumbers = Arrays.asList(4,5,6,7,8,9);
		
		myNumbers.stream()
		.filter(number -> number % 2 == 0) //not terminating
		.forEach(System.out::println); // terminating
		
		List<Integer> myResult = myNumbers.stream()
				.filter(number -> number % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(myResult);
		System.out.println(myNumbers);
	}

}
