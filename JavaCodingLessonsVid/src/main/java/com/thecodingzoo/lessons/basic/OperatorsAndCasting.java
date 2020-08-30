package com.thecodingzoo.lessons.basic;

public class OperatorsAndCasting {

	public static void main(String[] args) {
		int multiplecationResult = 2 * 4;
		System.out.println(multiplecationResult);
		
		double doubleResult = multiplecationResult * 3.2;
		System.out.println(doubleResult);
		
		multiplecationResult = (int) (multiplecationResult * 3.2);
		System.out.println(multiplecationResult);
		
		double divisionResult = 13d / 2d;
		System.out.println(divisionResult);
		
		int additionResult = (int) divisionResult + (int) 2.5;
		System.out.println(additionResult);
		
		int subtractionResult = 4-1;
		System.out.println(subtractionResult);
		
		String firstName = "shane";
		String secondName = "crouch";
		String name = firstName + " "+ secondName;
		System.out.println(name);
		
		System.out.println(5 % 2);

	}

}
