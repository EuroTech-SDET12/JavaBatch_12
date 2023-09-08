package com.days.day27;


import java.util.*;

public class MathTest {
    public static void main(String[] args) {
        int result = Math.multiplyExact(10, 20);
        System.out.println("result = " + result);
        Math1 math1 = new Math1();
        System.out.println(math1.multiply(10, 20));
        System.out.println(Math1.add(10, 20));

        Random random = new Random();
//        int max = maxValue();
//        printFirstLastletter();
        //get a string from user and print all the letters one by one
//        printLetters();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Your name pls !!!!");
//        String name = scanner.next();
//        String surName = scanner.next();
//        System.out.println("name = " + name);
//        System.out.println("surName = " + surName);
//        System.out.println("and age pls!!!");
//        int age = scanner.nextInt();
//        System.out.println("age = " + age);
        Random random1 = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("random1.nextInt(10) = " + random1.nextInt(5, 15));
            System.out.println("Math.random() = " + Math.random());
        }



    }

    public static void printLetters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name pls!!!!!");
        String name = scanner.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.println("name.charAt(i) = " + name.charAt(i));
        }
    }

    public static void printFirstLastletter() {
        //get a string from user print first letter of the string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name pls!!!");
        String name = scanner.next();
        System.out.println("first letter of the name : " + name.charAt(0));
        System.out.println("name.length() = " + name.length());
        //Ali  length  3
        //012
        System.out.println("last letter of the name : " + name.charAt(name.length() - 1));
    }

    public static int maxValue() {
        // get 2 number from user find the max one use Math class to find max value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter another number");
        int secondNumber = scanner.nextInt();
        int max = Math.max(firstNumber, secondNumber);
        System.out.println("max = " + max);
        return max;
    }


}
