package com.days.day42;

import java.util.Arrays;

public class Person {

    int idNumber;
    String name;
    String[] activities;
    int age;

    static int personCount;
    static int personLimit = 2;

    public Person(int idNumber, String name, String[] activities, int age) {
        this.idNumber = idNumber;
        this.name = name;
        this.activities = activities;
        this.age = age;

        personCount++;

    }

    public void toDo() {
        System.out.println(this.name + " is doing " + Arrays.toString(activities));
    }

    public void eligibilityToVote() {
        if (this.age > 17) {
            System.out.println(this.name + " is Eligible for VOTE");
        } else {
            System.out.println(this.name + " is NOT eligible for VOTE");
        }
    }

    // Create a method to check if we have 3 Person created, print limit exceed message!!!

    public static void personLimitCheck() {
        if (personCount >personLimit) {
            System.out.println("Person limit IS exceed!!!!");
        } else {
            System.out.println("Person limit is NOT exceed!!!!");
        }
    }

//    public static void personLimitCheck(int limit) {
//        if (personCount >limit) {
//            System.out.println("Person limit IS exceed!!!!");
//        } else {
//            System.out.println("Person limit is NOT exceed!!!!");
//        }
//    }


}
