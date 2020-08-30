package com.thecodingzoo.lessons.basic;

public class CompoundAssignmentOperators {

	public static void main(String[] args) {

//		int count = 0;
//		System.out.println(count);
//
//					
//		count++; // count = count + 1 
//		System.out.println(count);
//	
//		count = 0; 
//		System.out.println(count++);
//		System.out.println(count);
		int count = 0;
//		System.out.println(++count);
//		System.out.println(count);
//
//		System.out.println(--count);// count = count - 1; 
//		System.out.println(count);
//		
// Compound Assignment Operators 
//	
		int secondCount = count += 5;
		System.out.println(count); //count = count + 5
		System.out.println(secondCount);
		System.out.println(count *= 2);
		System.out.println(count /= 2);
		System.out.println(count -= 2);
		System.out.println(count %= 2); // count = count % 3;
		System.out.println(count);
//		int moreCount = 7;
//		System.out.println(count += moreCount);

	}

}
