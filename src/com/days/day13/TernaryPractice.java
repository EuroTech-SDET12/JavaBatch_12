package com.days.day13;

public class TernaryPractice {

    public static void main(String[] args) {

       //  write a code to print given number is multiply of 7 or not!

        int number = 117;

        // USE IF CONDITIONS!!
        String result;


        if (number % 7 == 0){
            result = "The number " + number+ " is multiply of 7";
        } else {
            result = "The number " + number+ " is NOT multiply of 7";
        }

        System.out.println("result = " + result);

        // USE Ternary OPT

        // (condition) ? exp1  : exp2

    }

}
