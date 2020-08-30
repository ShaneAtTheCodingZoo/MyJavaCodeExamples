package com.thecodingzoo.lessons.basic.done;

public class CompoundOperators {

	public static void main(String[] args) {

		int count = 1;
		System.out.println(count);
		
		count++;
		System.out.println(count);
		
		System.out.println(count++);
		System.out.println(count);
		
		System.out.println(++count);
		System.out.println(count);

		System.out.println(count--);
		System.out.println(count);
		
		System.out.println(--count);
		System.out.println(count);

	
		System.out.println(count += 5);
		System.out.println(count *= 2);
		System.out.println(count /= 2);
		System.out.println(count %= 3);
		int moreCount = 7;
		System.out.println(count += moreCount);
	}

}
