/**
 * 
 */
package com.thecodingzoo.lessons.advanced.streams.done;

import java.util.Arrays;
import java.util.List;

/**
 * Example 6
 * @author mycrochasm
 *
 */
public class AnyMatchExample {

	public static void main(String[] args) {
		List<Integer> myNumbers = Arrays.asList(4,5,6,7,8,9);
		
		boolean isAnyEven = myNumbers.stream()
		.anyMatch(number -> number % 2 == 0); //terminating
		
		System.out.println(isAnyEven);
	}

}
