package com.thecodingzoo.lessons.basic;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		int number = 5; 
		boolean result = number < 6;
		System.out.println(result);
		System.out.println(number > 6);
		System.out.println(number >= 6);
		System.out.println(number <= 6);
		System.out.println(number != 6);
		System.out.println(number == 5);
		
		Integer firstNumber = Integer.valueOf(300);
		Integer secondNumber = Integer.valueOf(300);
		
		System.out.println(firstNumber == firstNumber);
		
		System.out.println(firstNumber.compareTo(secondNumber));
		
		System.out.println(firstNumber.equals(secondNumber));
		

	}

}
