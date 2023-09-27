package com.days.day37;

public class Student {

    int id;
    String name;
    String sClass;
    double grade;
    String address;
    String parentName;
    String parentPhone;
    boolean isActiveStudent;

    public Student(int id, String name, String sClass, double grade, String address, String parentName, String parentPhone, boolean isActiveStudent) {
        this.id = id;
        this.name = name;
        this.sClass = sClass;
        this.grade = grade;
        this.address = address;
        this.parentName = parentName;
        this.parentPhone = parentPhone;
        this.isActiveStudent = isActiveStudent;
    }

    public Student(){

    }
}
