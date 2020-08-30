package com.thecodingzoo.lessons.basic.done;

public class ComparisonTwoNumber {
//#1
	public static void main(String[] args) {
		// == != > < >= <=

		compareTwoNumbers();

	}

	private static void compareTwoNumbers() {

		int number = 5;
		boolean result = number < 6;
		System.out.println(result);

		System.out.println(number > 6);
		System.out.println(number >= 6);
		System.out.println(number <= 6);
		System.out.println(number != 6);
		System.out.println(number == 5);

		// Compare wrapper objects
		Integer firstNumber = Integer.valueOf(300);
		Integer secondNumber = Integer.valueOf(300);

		System.out.println(firstNumber.compareTo(secondNumber));
		System.out.println(firstNumber.equals(secondNumber));
		System.out.println(firstNumber == secondNumber);

	}

}
