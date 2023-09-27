package com.days.day37;
public class School {

    String schoolName;
    int schoolId;
    boolean isSchoolActive;
    int schoolGrade;  //ins var.

    public void updateSchoolGrade(int schoolGrade){ // local var.
        System.out.println("schoolGrade = " + schoolGrade);
        System.out.println("this.schoolGrade = " + this.schoolGrade);
        this.schoolGrade = schoolGrade;
        System.out.println("this.schoolGrade = " + this.schoolGrade);
    }

    public static void main(String[] args) {
        School s1 = new School();
        System.out.println("s1.schoolGrade = " + s1.schoolGrade);
        s1.updateSchoolGrade(100);
        System.out.println("s1.schoolGrade = " + s1.schoolGrade);
    }
}
