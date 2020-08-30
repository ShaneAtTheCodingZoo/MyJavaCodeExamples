package com.thecodingzoo.lessons.basic;

import java.util.Arrays;

public class MultidimensionalArrays {
	public static void main(String[] args) {
		String[][] homeRoom = new String[2][2];
		homeRoom[0][0] = "Shane";
		homeRoom[0][1] = "Nick";
		
		homeRoom[1][0] = "Faith";
		homeRoom[1][1] = "Ting";
		
		System.out.println(Arrays.deepToString(homeRoom));
		System.out.println(Arrays.toString(homeRoom[1]));
		System.out.println(Arrays.toString(homeRoom[0]));
		
	}

}
