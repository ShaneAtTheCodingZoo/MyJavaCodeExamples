package com.thecodingzoo.lessons.basic;

public class PrimitiveVariables {
	
	public static void main(String[] args) {
		String firstName = "Shane";
		System.out.println(firstName);
		
		byte byteVariable = 127; // -128 to 127
		short shortVariable = -1; // -32768 to 32767
		int integerVariable = 1; // -2,147,483,648 to 2,147,483,647
		long longVariable = 1; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	
		float floatVariable = 1.23f; // 32 bits - single precision
		double doubleVariable = 1.23; // 64 bits - double precision

		
		char charVariable = 'n'; // Unicode character set that can represent all international characters.
		boolean booleanVariable = false;

		System.out.println(byteVariable);
		System.out.println(shortVariable);
		System.out.println(integerVariable);
		System.out.println(longVariable);
		System.out.println(floatVariable);
		System.out.println(doubleVariable);
		System.out.println(charVariable);
		System.out.println(booleanVariable);

	}
	
}
