package com.days.day23;

import java.util.Stack;

public class Student {

    // Instant FIELDS!!!
    // belongs to the objects
    int studentNumber;
    String studentName;
    boolean isFullTimeStudent;

    // Class variable Fields!!
    // static field will belong to CLASS, not objects!!!
    static int count=0;

    // METHODS :

    public void study(String lesson){
        System.out.println("Student is study : " + lesson);
    }

    public void takeQuiz(){
        System.out.println("TAKE A QUIZ!!");
    }


}
