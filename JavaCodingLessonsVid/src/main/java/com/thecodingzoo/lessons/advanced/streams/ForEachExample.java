package com.thecodingzoo.lessons.advanced.streams;

//import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachExample {

	public static void main(String[] args) {
		String[] letters = {"B","D","C","A"};
		Stream<String> myLettersStream = Stream.of(letters);
		
//		Consumer<String> myPrint = letter -> {
//			System.out.print(letter);
//		};
//		
		//myLettersStream.forEach(myPrint);
		
		myLettersStream.sorted().forEach(letter->System.out.println(letter));

	}

}
