package com.days.day4;

public class FloatingDataTypes {

    public static void main(String[] args) {

        double taxRate = 20.5;
        System.out.println("taxRate = " + taxRate);

        // float interestRate = 1.3; // 1.3 is double as default. and double size bigger than float,
        // can not directly assign double(64bit) to float(32 bit) !!

        float interestRate = 1.3F;
//        int value = 1.4;  // you can not assign double to int!!!

        double number = 1; // 1 as a default is int , int size less than double,
        // so you can assign int to double directly
        System.out.println(number); // 1.0
    }
}
