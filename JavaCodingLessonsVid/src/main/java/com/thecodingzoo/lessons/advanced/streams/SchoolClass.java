package com.thecodingzoo.lessons.advanced.streams;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class SchoolClass {
    @Getter
    private String name;
    @Getter
    private List<Student> students = new ArrayList<>();

    public SchoolClass(String name){
        this.name = name;
    }
    public void addStudent(Student student){
        System.out.println("Adding Student to Class " + name);
        students.add(student);
    }

    public void merge(SchoolClass classToMerge) {
        this.students.addAll(classToMerge.getStudents());
    }
}
