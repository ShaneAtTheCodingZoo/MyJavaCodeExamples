package com.thecodingzoo.lessons.advanced.streams.done;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** 
 * Example 5
 * 
 * @author mycrochasm
 *
 */
public class AllMatchExample {
	public static void main(String[] args) {
		List<Integer> myNumbers = Arrays.asList(4,5,6,7,8,9);
		
		boolean isAllEven = myNumbers.stream()
		.allMatch(number -> number % 2 == 0); //terminating
		
		System.out.println(isAllEven);
	}
}
