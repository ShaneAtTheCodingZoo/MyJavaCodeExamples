package com.thecodingzoo.lessons.advanced.streams;

import java.util.Arrays;
import java.util.List;

public class StreamAllMatchExample {

	public static void main(String[] args) {
		List<Integer> myNumbers = Arrays.asList(4,6,8,10);
		
		boolean isAllEvenNumbers = myNumbers.stream().allMatch(number -> number % 2 == 0); //terminating
		System.out.println(isAllEvenNumbers);

	}

}
