package com.days.day23;

public class Test_Student {


    public static void main(String[] args) {

        //CREATE OBJECT:
        Student Mike = new Student();
       // Student.count++;
        Mike.count++;
        Mike.studentNumber = 1001;
        System.out.println("Mike.studentNumber = " + Mike.studentNumber);
        Mike.studentName = "Emre S.";
        System.out.println("Mike.studentName = " + Mike.studentName);
        Mike.isFullTimeStudent = true;

        Mike.takeQuiz();
        Mike.study("OOP");

        System.out.println("||||=================================||||");

        Student Rose = new Student();
        //Student.count++;
        Rose.count++;
        Rose.studentNumber = 1002;
        System.out.println("Rose.studentNumber = " + Rose.studentNumber);
        Rose.studentName = "Rose";
        System.out.println("Rose.studentName = " + Rose.studentName);
        Rose.isFullTimeStudent = true;
        Rose.takeQuiz();
        Rose.study("OCA");

        // TASK!! create your own object with your values !!!
        System.out.println("||||=================================||||");
        System.out.println("Mike.count = " + Mike.count);
        System.out.println("Rose.count = " + Rose.count);
        System.out.println("Student.count = " + Student.count);


    }

}
