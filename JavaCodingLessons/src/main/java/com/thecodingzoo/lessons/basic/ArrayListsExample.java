package com.thecodingzoo.lessons.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListsExample {
	
	public static void main(String[] args) {
		List<String> students = new ArrayList<>(2);
		students.add("shane");
		students.add("Nick");
		System.out.println(students);
		
		students.set(0, "Shane");
		System.out.println(students);
		System.out.println(students.size());
		System.out.println(students.get(1));
		
		students.set(2, "Faith"); // no  Error like Arrays
		System.out.println(students.size());
		System.out.println(students);
		
		students = Arrays.asList("Shane","Ting", "Nick", "Faith");
		for(int index = 0; index < students.size(); index++) {
			int studentCount = index + 1;
			System.out.println("Processing Student "  + " #" + studentCount + " " + students.get(index));
		}
		
		
		
		// O(1) means constant time - no matter how large, same cost each time 
		// O(n) means linear time, for every n entry , n amount of time it takes
		
		// Arrays are O(1) for inserting if you know the next free index - Constant Time
		// Arrays are O(1) for get if you know the index
		// Arrays are O(n) for insert if you do not know the next empty slot
		// Arrays are O(n) for get if you do not know the index of what you want to get
		// Arrays are O(n) for delete
		
	
	}

	

}
