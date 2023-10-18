package com.days.day52;

import com.days.day38.School;

import java.util.Scanner;

public class ErrorSample {


    public static void main(String[] args) {
        System.out.println("Welcome to my CALCULATOR");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number for division");
        int dbInput = scanner.nextInt();
        System.out.println("Please enter again a number for division");
        int uiInput = scanner.nextInt();

//        System.out.println("Math.sqrt(-9) = " + Math.sqrt(-9));

        try { //observer!!! and inform the catch if any exception occurs
            System.out.println("IN THE TRY BLOCK!! ");
            System.out.println("(dbInput / uiInput) = " + (dbInput / uiInput));
            System.out.println("END OF TRY BLOCK1");
            System.out.println("END OF TRY BLOCK2");
            System.out.println("END OF TRY BLOCK3");
        } catch (ArithmeticException e) { // Catcher!!
            System.out.println("!! WE ARE IN CATCH BLOCK!!!");
         //   e.printStackTrace(); // to print the caught exception end of the run!!
            System.out.println("what was the exception message= " + (e.getMessage()));
        }
        System.out.println("END OF MAIN METHOD");
    }


}

