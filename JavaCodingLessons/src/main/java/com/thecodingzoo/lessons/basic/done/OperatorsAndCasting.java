package com.thecodingzoo.lessons.basic.done;

public class OperatorsAndCasting {

	public static void main(String[] args) {
		// Operators and casting
		int multiplecationResult = 2 * 4;
		System.out.println(multiplecationResult);

		double doubleResult = multiplecationResult * 2.4;
		System.out.println(doubleResult);

		multiplecationResult = (int) (multiplecationResult * 2.4);
		System.out.println(multiplecationResult);

		double divisionResult = 13 / 2;
		System.out.println(divisionResult);

		int addingResult = (int) (divisionResult + 4);
		System.out.println(addingResult);

		int subtractionResult = 4 - 1;
		System.out.println(subtractionResult);

		int count = 1;
		System.out.println(count);
		System.out.println(count++);
		System.out.println(++count);
		System.out.println(count);

		System.out.println(count--);
		System.out.println(--count);
		System.out.println(count);

		System.out.println(count += 5);
		System.out.println(count *= 2);
		System.out.println(count /= 2);
		System.out.println(count %= 3);
		System.out.println(5 % 2);
	}
}
