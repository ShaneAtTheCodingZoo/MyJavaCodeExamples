package com.thecodingzoo.lessons.advanced.streams.done;

import com.thecodingzoo.lessons.advanced.streams.SchoolClass;
import com.thecodingzoo.lessons.advanced.streams.Student;

import java.util.Arrays;
import java.util.List;

public class CollectExample {
    public static void main(String[] args) {


        List<SchoolClass> schoolClasses = retrieveClasses();
//        SchoolClass venablesClass = new SchoolClass("Mr. Venable");
////        System.out.println("Venables Class premerge: " + venablesClass.getStudents());
//        System.out.println("Venables Class size: " + venablesClass.getStudents().size());

//        schoolClasses.stream().reduce(venablesClass, (compressedClass, closingClass) -> {
//            System.out.println("Closing " + closingClass.getName());
//            compressedClass.getStudents().addAll(closingClass.getStudents());
//            System.out.println("Venables Class size increased to: "
//                    + venablesClass.getStudents().size());
//            return compressedClass;
//        });

       SchoolClass venablesClass = schoolClasses.stream()
               .collect(() -> new SchoolClass(),
                       SchoolClass::merge,
                       SchoolClass::merge);

        System.out.println("Venables Class Post merge " + venablesClass.getStudents());
        System.out.println("Venables Class size: " + venablesClass.getStudents().size());

//
//		System.out.println(result);

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
