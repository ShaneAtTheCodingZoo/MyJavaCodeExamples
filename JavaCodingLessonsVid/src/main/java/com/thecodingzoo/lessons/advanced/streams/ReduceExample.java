package com.thecodingzoo.lessons.advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** Example 2
 * 
 * @author Anthony S Crouch
 *
 */
public class ReduceExample {
	public static void main(String[] args) {
		List<Integer> myNumbers = Arrays.asList(4,5,6,7,8);
//		Optional<Integer> result = myNumbers.stream()
//				.reduce((subtotal, number) -> subtotal + number );
//		System.out.println(result.get());

//		With initial value
//		Integer myResult = myNumbers.stream().reduce(5, (subtotal, number) -> {
//			System.out.println(subtotal);
//			return subtotal + number ;
//			} );
//
//		System.out.println(myResult);
		List<SchoolClass> schoolClasses = retrieveClasses();
		SchoolClass venablesClass = new SchoolClass("Mr. Venable");
		System.out.println("Venable Class Premerge: " + venablesClass.getStudents());
		System.out.println("Venable Class Size: " + venablesClass.getStudents().size());

		schoolClasses.stream().reduce(venablesClass, (compressedClass, schoolClass) -> {
			System.out.println("Closing " + schoolClass.getName());
			compressedClass.getStudents().addAll(schoolClass.getStudents());
			System.out.println("Venables class size increased to " +
					compressedClass.getStudents().size());
			return compressedClass;
		});

		System.out.println("Venables Class Post Merge " + venablesClass.getStudents());
		System.out.println("Venables class size: " + venablesClass.getStudents().size());
	}

	private static List<SchoolClass> retrieveClasses(){
		SchoolClass christinasClass = new SchoolClass("Mrs. Christina");
		christinasClass.addStudent(new Student("bob", 11, "212-221-2332"));
		christinasClass.addStudent(new Student("veronica", 10, "212-221-4212"));
		christinasClass.addStudent(new Student("amy", 11, "212-221-3212"));
		christinasClass.addStudent(new Student("shane", 10, "212-231-2212"));

		SchoolClass shanesClass = new SchoolClass("Mr. Shane");
		shanesClass.addStudent(new Student("gabrielle", 11, "212-221-4358"));
		shanesClass.addStudent(new Student("nick", 10, "212-221-4522"));
		shanesClass.addStudent(new Student("bella", 11, "212-221-8744"));
		shanesClass.addStudent(new Student("juan", 10, "212-231-2272"));

		SchoolClass nicksClass = new SchoolClass("Mr. Nick");
		nicksClass.addStudent(new Student("betty", 11, "212-221-4358"));
		nicksClass.addStudent(new Student("sally", 10, "212-221-4522"));
		nicksClass.addStudent(new Student("ting", 11, "212-221-8744"));
		nicksClass.addStudent(new Student("harry", 10, "212-231-2272"));


		return Arrays.asList(christinasClass,shanesClass,nicksClass);
	};
}
