package com.days.day41;

import java.time.LocalDate;

public class Student {

    private String name;
    //while creating a student obj we want assign value to name field
    private int age;
    // create a field make it private
    // setter method
    private String city;
    LocalDate date = LocalDate.now();

    double mathGrade;
    double scienceGrade;
    double literatureGrade;

    double average;

    //calculate average of the grades
    //create a method return and print average of the grades
    public double averageGrades() {
        average = (mathGrade + scienceGrade + literatureGrade) / 3;
        System.out.println(name + "'s  grades average is = " + average);
        return average;
    }

    public void setCity(String city) {
        if (city.length() < 3) {
            city = "London";
        } else {
            this.city = city;
        }
    }

    Student(String name, int birthYear) {
        this.name = name;
//        age = 2023 - birthYear;
        age = date.getYear() - birthYear;
    }

    public int getAge() {
        return age;
    }

    public void studentInfo() {
        // David is 18 years old
        System.out.println(name + " is " + age + " years old and living in " + city);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
