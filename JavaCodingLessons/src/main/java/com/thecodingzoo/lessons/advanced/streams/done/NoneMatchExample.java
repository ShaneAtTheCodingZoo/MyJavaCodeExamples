package com.thecodingzoo.lessons.advanced.streams.done;

import java.util.Arrays;
import java.util.List;

/**
 * Example 7
 * @author mycrochasm
 *
 */
public class NoneMatchExample {
	//What is difference in none match vers any match
	
	public static void main(String[] args) {
		List<Integer> myNumbers = Arrays.asList(1,5,6,7,8,9);
		
		boolean isAllNotEven = myNumbers.stream()
		.noneMatch(number -> number % 2 == 0); //terminating
		
		System.out.println(isAllNotEven);
	}

}
