package com.thecodingzoo.lessons.advanced.streams;

import java.util.Arrays;
import java.util.List;

public class NoneMatchExample {
	//What is difference in none match versus any match
	
	public static void main(String[] args) {
		List<Integer> myNumbers = Arrays.asList(1,5,7,9);
		boolean isAllNotEven = myNumbers.stream()
				.noneMatch(number-> {
					System.out.println(number);
					return number % 2 == 0;
				});
		System.out.println(isAllNotEven);
	}

}
