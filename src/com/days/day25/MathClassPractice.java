package com.days.day25;

public class MathClassPractice {

    public static void main(String[] args) {


        int number = -124;

        System.out.println("number = " + number);
        System.out.println("Math.abs(number) = " + Math.abs(number));

        System.out.println("number = " + number);

        System.out.println("//////////////////////////////////");

        System.out.println("Math.PI = " + Math.PI);

        System.out.println("//////////////////////////////////");

        // round to nearest integer number
        System.out.println("Math.round(14.5) = " + Math.round(14.5)); //15
        System.out.println("Math.round(14.1) = " + Math.round(14.4)); //14

        // round to upward as double!!
        System.out.println("Math.ceil(14.001) = " + Math.ceil(14.001)); // 15.0
        System.out.println("Math.ceil(14.999) = " + Math.ceil(14.999)); // 15.0

        // round to downward as double!!
        System.out.println("Math.floor(14.999) = " + Math.floor(14.999)); //14.0
        System.out.println("Math.floor(14.999) = " + Math.floor(14.001)); //14.0


        System.out.println("//////////////////////////////////");

        System.out.println("Math.max(10,-11) = " + Math.max(10, -11));
    }
}
