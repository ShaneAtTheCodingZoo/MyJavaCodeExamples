/**
 * 
 */
package com.thecodingzoo.lessons.advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class FindAny {

	public static void main(String[] args) {
		List<Integer> myNumbers = Arrays.asList(15,3,5,1,7,8,9,11,12,23, 24);
		Optional<Integer> foundNumber = myNumbers.parallelStream()
				.filter(number -> number % 2 == 0)
				.findAny();

		System.out.println(foundNumber);

	}

}
