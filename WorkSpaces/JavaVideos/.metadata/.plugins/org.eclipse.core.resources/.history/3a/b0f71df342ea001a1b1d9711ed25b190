package com.thecodingzoo.lessons.patterns.creational.constructor;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import lombok.Getter;

@Getter
public class Person {
	private UUID id;
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Person(UUID id, String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id=id;
		validate();
	}
	
	public Person(UUID id, String firstName, String lastName, String middleName) {
		this(id, firstName, lastName);
		this.middleName = middleName;
	}
	
	public Person(String idFromRestService, String firstName, String lastName) {
		this(StringUtils.isEmpty(idFromRestService) ? null : UUID.fromString(idFromRestService),firstName, lastName);
	}

	private void validate() {
		if(StringUtils.isEmpty(firstName) || StringUtils.isEmpty(lastName) || id == null) {
			throw new IllegalArgumentException("Required Parameters missing. Person must have a first name, last name and an Id.");
		}
	}
}
