package com.thecodingzoo.lessons.advanced;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaSetVsList {

	public static void main(String[] args) {
		// A set and a list are both just interfaces but there is one thing that
		// a set implementation should guarantee that a list does not.

		// Use Keywords: java set vs list

		List<String> studentsEnrolledList = new ArrayList<>();
		Set<String> studentsEnrolledSet = new HashSet<>();

		studentsEnrolledList.add("Shane");
		studentsEnrolledList.add("Christina");

		studentsEnrolledSet.add("Shane");
		studentsEnrolledSet.add("Christina");

		System.out.println(studentsEnrolledList);
		System.out.println(studentsEnrolledSet);

		studentsEnrolledList.add("Shane");
		System.out.println(studentsEnrolledList);

		studentsEnrolledSet.add("Shane");
		System.out.println(studentsEnrolledSet);

		List<Student> studentObjectList = new ArrayList<>();
		Set<Student> studentObjectSet = new HashSet<>();

		studentObjectList.add(new Student("shane"));
		studentObjectList.add(new Student("shane"));
		System.out.println(studentObjectList);

		studentObjectSet.add(new Student("shane"));
		studentObjectSet.add(new Student("shane"));
		System.out.println(studentObjectSet);

	}

	private static class Student {
		@Override
		public String toString() {
			return "Student [name=" + name + "]";
		}

		private String name;

		public Student(String name) {
			this.name = name;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

	}

}
