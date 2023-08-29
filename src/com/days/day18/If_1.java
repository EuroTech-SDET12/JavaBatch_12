package com.days.day18;

public class If_1 {
    public static void main(String[] args) {
        System.out.println("Main Method");
        int n = -20;
        if (n > 0) {
            System.out.println(n + " is a positive number.");
        }
        System.out.println("Still in the main method!!!!");
        n = 80;

        if (n > 70) {
            System.out.println("number  is greater then 70.");
        }
        if (n > 60) {
            System.out.println("number is greater then 60");
        }
        if (n > 50) {
            System.out.println("number is greater then 50");
        }

        System.out.println("=================");
        n = 90;
        if (n > 70) {
            System.out.println("number  is greater then 70.");
        } else if (n > 60) {
            System.out.println("number is greater then 60");
        } else if (n > 50) {
            System.out.println("number is greater then 50");
        }
        System.out.println("Out of the if statement!!!!!");


    }
}
