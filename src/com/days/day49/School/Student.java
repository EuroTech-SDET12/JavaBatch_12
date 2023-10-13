package com.days.day49.School;

public class Student extends SchoolAdmin{

    int studentID;
    String className;


    public Student(String name, int dob_year, char gender, String staffType) {
        super(name, dob_year, gender, staffType);
        super.registrationFee = 210;
    }

    public void doHomework(){
        System.out.println("Homework !!!");
    }

    @Override
    public void registration() {
        System.out.println("Student registration selected!!");
        super.registration();
    }
}
