package com.thecodingzoo.lessons.basic.done;

public class LogicalOperators {
//#2
	public static void main(String[] args) {
		// && || or !(x = 5),
		int number = 5;
		String name = "Shane";
		System.out.println(number == 5);
		System.out.println(name.equals("shane"));
		System.out.println(name.equals("shane") && number == 5);
		System.out.println(name.equals("shane") && number == 6);
		System.out.println(name.equals("shane") || number == 6);
		System.out.println(!name.equals("nick"));
	}

}
