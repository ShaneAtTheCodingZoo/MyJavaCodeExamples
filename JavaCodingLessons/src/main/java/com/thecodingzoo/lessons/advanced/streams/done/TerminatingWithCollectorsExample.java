package com.thecodingzoo.lessons.advanced.streams.done;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Example 4
 * 
 * @author mycrochasm
 *
 */
public class TerminatingWithCollectorsExample {
	public static void main(String[] args) {
		List<Integer> myNumbers = Arrays.asList(4,5,6,7,8,9);
		
		myNumbers.stream()
		.filter(number -> number % 2 == 0) //not terminating
		.forEach(System.out::println); // terminating
		
		List<Integer> myResult = myNumbers.stream()
				.filter(number -> number % 2 == 0) //not terminating
				.collect(Collectors.toList()); //terminating
		
		System.out.println(myResult);
		
		
	}
}
