package com.thecodingzoo.lessons.basic.done;

public class ComparisonsTwoString {
//#1
	public static void main(String[] args) {
		// == != > < >= <=

		compareTwoString();

	}

	private static void compareTwoString() {
		String firstString = "a";
		String secondString = "a";
		String thirdString = "A";
		System.out.println(firstString.equals(secondString));
		System.out.println(firstString.equals(thirdString));
		System.out.println(firstString.equalsIgnoreCase(thirdString));
		System.out.println(firstString == secondString);
	}

}
