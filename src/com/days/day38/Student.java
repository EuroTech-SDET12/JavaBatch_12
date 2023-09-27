package com.days.day38;

public class Student {

    String name;
    int age;
    long studentId;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(long studentId) {
        this.studentId = studentId;
    }


    public Student(String name, long studentId) {
        this.name = name;
        this.studentId = studentId;
    }
}
