package com.days.day22;

import java.util.logging.Logger;

public class FactorialCalculation {

    public static void main(String[] args) {
        int testNumber= 5;
//        int fact = getFactorialValue(testNumber);
//        System.out.println("Factorial value for "+testNumber+ " is " + fact);
        printFactorialValue(testNumber);
    }
    public static int getFactorialValue(int number) {
        // number 4 :  4 x 3 x 2 x 1  = 24
        int fact = 1;
        for (int i = number; i > 1; i--) { //4 3 2
            fact *= i; // fact = fact * i;
        }
        return fact;
    }
    public static void printFactorialValue(int number) {
        // number 4 :  4 x 3 x 2 x 1  = 24
        int fact = 1;
        for (int i = number; i > 1; i--) { //4 3 2
            fact *= i; // fact = fact * i;
        }
        System.out.println("Factorial value for "+number+ " is " + fact);
    }

}
