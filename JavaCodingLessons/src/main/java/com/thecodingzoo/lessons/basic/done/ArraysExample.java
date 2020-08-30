package com.thecodingzoo.lessons.basic.done;

import java.util.Arrays;

public class ArraysExample {
    //Title: multidimensional arrays and [arrays in java for beginners
    public static void main(String[] args) {
        String[] students = {"shane", "Nick"};
        System.out.println(Arrays.toString(students));

        students[0] = "Shane";
        System.out.println(Arrays.toString(students));

        //students[2] = "Faith"; // Error
        System.out.println(students.length);

        students = new String[3];
        System.out.println(Arrays.toString(students));
        System.out.println(students.length);
        //students[3] = "Faith"; //Error
        students[2] = "Faith";
        students[0] = "Shane";
        students[1] = "Nick";

        System.out.println(Arrays.toString(students));

        for(int index = 0; index < students.length; index++) {
            int studentCount = index + 1;
            System.out.println("Processing Student "  + " #" + studentCount + " " + students[index]);
        }

        String[][] homeRoom = new String[2][2];
        homeRoom[0][0] = "Shane";
        homeRoom[0][1] = "Nick";
        homeRoom[1][0] = "Faith";
        homeRoom[1][1] = "Ting";
        System.out.println(Arrays.deepToString(homeRoom));
        System.out.println(Arrays.deepToString(homeRoom[0]));
        System.out.println(Arrays.deepToString(homeRoom[1]));


        // O(1) means constant time - no matter how large, same cost each time
        // O(n) means linear time, for every n entry , n amount of time it takes

        // Arrays are O(1) for inserting if you know the next free index - Constant Time
        // Arrays are O(1) for get if you know the index
        // Arrays are O(n) for insert if you do not know the next empty slot
        // Arrays are O(n) for get if you do not know the index of what you want to get
        // Arrays are O(n) for delete


    }

}
