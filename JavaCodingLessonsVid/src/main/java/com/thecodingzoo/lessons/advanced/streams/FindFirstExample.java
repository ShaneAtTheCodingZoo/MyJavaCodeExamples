/**
 * 
 */
package com.thecodingzoo.lessons.advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class FindFirstExample {

	public static void main(String[] args) {
		List<Integer> myNumbers = Arrays.asList(3,5,1,7,8,9);
		Optional<Integer> foundNumber = myNumbers.stream()
				.filter(number -> number % 2 == 0)
				.findFirst();

		System.out.println(foundNumber);

	}

}
