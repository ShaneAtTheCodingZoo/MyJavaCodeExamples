package com.thecodingzoo.lessons.advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<SchoolClass> schoolClasses = createSchoolClasses();

        List<List<String>> entireSchoolStudentsList = schoolClasses.stream()
                .map(schoolClass -> {
                    return schoolClass.getStudents().stream()
                            .map(Student::getName).collect(Collectors.toList());
                }).collect(Collectors.toList());
        System.out.println(entireSchoolStudentsList);

        List<String> studentNames = schoolClasses.stream()
                .flatMap(schoolClass -> {
                  return schoolClass.getStudents()
                          .stream()
                          .map(Student::getName);
                }).collect(Collectors.toList());
        System.out.println(studentNames);
    }

    private static List<SchoolClass> createSchoolClasses(){
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
        return Arrays.asList(christinasClass,shanesClass);
    };
}
