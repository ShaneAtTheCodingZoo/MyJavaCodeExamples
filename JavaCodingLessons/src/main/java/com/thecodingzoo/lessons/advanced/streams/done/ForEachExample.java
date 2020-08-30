package com.thecodingzoo.lessons.advanced.streams.done;

import java.util.function.Consumer;
import java.util.stream.Stream;

/** Example 1 
 * 
 * @author Anthony S Crouch
 *
 */
public class ForEachExample {
	
	public static void main(String... args) {
		String[] letters = {"B","D", "C", "A"};
		Stream<String> myLettersStream = Stream.of(letters);		
			
		/* Lambda expression using the functional interface Consumer */
		Consumer<String> myPrint = letter -> {
			System.out.print(letter);
		};
			
		/* Using a Terminating Operation */
		myLettersStream.forEach(myPrint);	
		
		
		/* Using a intermediate operation before a terminating one */
		//myLettersStream.sorted().forEach(myPrint);	
	}
}
