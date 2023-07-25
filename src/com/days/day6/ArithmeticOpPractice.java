package com.days.day6;

public class ArithmeticOpPractice {


    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        int c = a + b; // Addition
        System.out.println("c = " + c);

        c = a - b; // Subtraction
        //c.soutv
        System.out.println("c = " + c);

        c = a / b; // Division
        System.out.println("c = " + c);

        c = a % b; // Module
        System.out.println("c = " + c);


        a= 3;
        b= 2;
        c = a / b;
        System.out.println("c = " + c);  // 3/2 -> 1.5 is double but our operand are int
        // so that result must be int!!! // 1

        c = 10/3;
        System.out.println("10/3 = " + c ); // 3.33333  -> 3

        double d = 3, e = 2;
        double f = d/e; // result should be double !!
        System.out.println("f = " + f); // 1.5

        f= 10/5;  // f = 2;
        System.out.println("f = " + f); // 2.0 because f is double!!!

    }
}
