package com.days.day49.School;

public class Teacher extends SchoolAdmin {

    int teacherId;
    String lecture;


    public Teacher(String name, int dob_year, char gender, String staffType) {
        super(name, dob_year, gender, staffType);
        super.registrationFee = 110;
    }

    public void makeExam(){
        System.out.println("Exam in progress!!");
    }

    @Override
    public void registration() {
        System.out.println("Teacher registration selected!!");
        super.registration();
    }
}
