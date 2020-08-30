package com.thecodingzoo.lessons.basic.done;

public class IfConditions {
//#3 add && || example
	public static void main(String[] args) {
		// if else elseif - shorthand = condition ? 1 : 2 Ternary
		// Operator
		int myNumber = 3, mySecondNumber = 2;
		if ((myNumber - mySecondNumber) == 1) {
			System.out.println(
					"Running this line because condition 1 met");
		}

		if (myNumber < 2) {
			System.out.println(
					"Running this line because condition 1 met");
		} else {
			System.out.println("Running this line if no condition met");
		}

		if (myNumber < 2) {
			System.out.println(
					"Running this line because condition 1 met");
		} else if (myNumber == 3) {
			System.out
					.println("Running this line if 2nd condition met");
		} else {
			System.out.println("Running this line if no condition met");
		}

		System.out.println(mySecondNumber == 2 ? "yes" : "no");

		String myNumberIsThree = mySecondNumber == 3 ? "yes" : "no";
	}

}
