package com.thecodingzoo.lessons.patterns.creational.builder;

import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

@Getter
@ToString
public class Person {
	private UUID id;
	private String firstName;
	private String middleName;
	private String lastName;

	Person(UUID id, String firstName, String middleName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public static class PersonBuilder {
		private UUID id;
		private String firstName;
		private String middleName;
		private String lastName;

		public PersonBuilder(UUID id, String firstName, String lastName) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public PersonBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public PersonBuilder id(String id) {
			this.id = StringUtils.isEmpty(id) ? null : UUID.fromString(id);
			return this;
		}

		public PersonBuilder id(UUID id) {
			this.id = id;
			return this;
		}

		public PersonBuilder middleName(String middleName) {
			this.middleName = middleName;
			return this;
		}

		public Person build() {
			validate();
			return new Person(id, firstName, middleName, lastName);
		}
		private void validate() {
			if(StringUtils.isEmpty(firstName) || StringUtils.isEmpty(lastName) || id == null) {
				throw new IllegalArgumentException("Required Parameters missing. Person must have a first name, last name and an Id.");
			}
		}
	}
}
