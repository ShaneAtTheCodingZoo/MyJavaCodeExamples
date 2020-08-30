package com.thecodingzoo.lessons.advanced.streams;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
	public static void main(String[] args) {
		List<Integer> myNumbers = Arrays.asList(3,5,1,7,9);
		boolean isAnyEven = myNumbers.stream().anyMatch(number-> {
			System.out.println(number);
			return number % 2 == 0;
		});
		System.out.println(isAnyEven);
	}
}
