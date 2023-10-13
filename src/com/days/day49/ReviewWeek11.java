package com.days.day49;

import com.days.day49.School.Student;
import com.days.day49.School.Teacher;

public class ReviewWeek11 {
    // SchoolAdmin!!
    // 1- Create a classes for each School person: Student, Staff, Teacher
    // 2- They have some common field like name, dob, gender, staffType
    // 3- I don't want to initialize this data fields in child class
    // do it in parent class.. const!!!
    // 4- be careful about child classes characteristic fields!!
    // 5- and create test objects for all subclasses
    // 6- There is a method registration, each subclass needs
    // to specify it according to itself


    public static void main(String[] args) {

        Student s1 = new Student("Richard", 1988,'M',"Student");

        Teacher t1 = new Teacher("Asya", 1980,'F',"Teacher");



    }


}
