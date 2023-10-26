package com.days.day56.country;

public class Student {

    String name;
    int age;
    Country country;

    //    Student(String name, int age, String country) {
    Student(String name, int age, Country country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }


    public void studentInfo() {
        System.out.println(name + " is from " + country);
    }
}
