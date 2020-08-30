package com.thecodingzoo.lessons.basic;

import java.util.Arrays;

public class ArraysExample {
	public static void main(String[] args) {
		String[] students = {"shane", "Nick"};
		System.out.println(Arrays.toString(students));
		
		students[0] = "Shane";
		System.out.println(Arrays.toString(students));
		
		//students[2] = "Faith";
		//System.out.println(Arrays.toString(students));
		
		students = new String[3];
		students[0] = "Shane";
		students[1] = "Nick";
		students[2] = "Faith";
		System.out.println(Arrays.toString(students));
		
		for(int index = 0; index < students.length; index++) {
			int studentCount = index + 1;
			System.out.println("Processing student #" + studentCount + " " + students[index] );
		}
	}
	
}
