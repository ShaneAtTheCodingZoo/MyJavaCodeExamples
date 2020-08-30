package com.thecodingzoo.lessons.patterns.creational;

import com.thecodingzoo.lessons.patterns.creational.builder.Person;

import java.util.UUID;

public class BuilderExample {
	public static void main(String[] args) {

		/* build enforces my null checks and validation. It does not have to enforce not null but it could
		   just enforce that String can be parsed to UUID. Having a PersonBuilder constructor is not required
		   but very nice in the sense of telling people up front what is a must. Optional Properties can be
		   added like middleName etc. Build() would not enforce that middle name was set, while it would
		   enforce that the others were set. Using Lombok and avoiding the PersonBuilder constructor is not as
		   clean as it is not self documenting.
		 */
		Person shane = new Person
				.PersonBuilder(UUID.randomUUID(), "Anthony", "Crouch")
				.middleName("Shane")
				.build();
		System.out.println(shane);

		/* I can support two different types of build with ID , uuid or string.
		*  In an applicaton where both are used a lot to represent a UUID ID, it does not
		*  hurt to support both in the building process and putting in in the builder
		*  or contructor is the correct encapsulation and cohesion.
		*/
		String idFromRestService = "b5af00f0-71ec-44cf-b360-1a82a394c9ab";
		shane = new Person
				.PersonBuilder("Anthony", "Crouch") //ID removed from constructor
				.middleName("Shane")
				.id(idFromRestService) // ID as String
				.build();
		System.out.println(shane);

		shane = new Person
				.PersonBuilder("Anthony", "Crouch")
				.middleName("Shane")
				.id(UUID.randomUUID()) // ID as UUID, same builder.
				.build();
		System.out.println(shane);

	}
	
	
}
