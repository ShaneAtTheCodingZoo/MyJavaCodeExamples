package com.thecodingzoo.lessons.advanced.streams;

import java.util.Arrays;
import java.util.List;


public class FilterExample {

	public static void main(String[] args) {
		List<Integer> myNumbers = Arrays.asList(4,5,6,7,8,9);
		myNumbers.stream().filter(number -> number % 2 == 0) //intermediate operation
		.forEach(System.out::println); //terminating operation
	}

}
