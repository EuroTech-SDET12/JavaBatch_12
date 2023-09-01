package com.days.day11;

public class GradeTask {

    public static void main(String[] args) {

        int mark = 101;
        String grade = "EMPTY";
        if(mark>100 || mark<0){
            grade= "INVALID MARK!";
        }
        else if (mark > 89) {
            grade = "A";
        } else if (mark > 80) {
            grade = "B";
        } else if (mark > 68) {
            grade = "C";
        } else if (mark > 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade for " + mark + " mark is " + grade);


        ////////////

        int number = 37;
        boolean even =  number % 2 == 0 ;


        System.out.println((0.2 + 1.2 + 2.2 + 3.2) );
    }
}
