package com.days.day24;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // sample input: Talha Ozleblebici
        // sample input: e2eedas£$"£$"£FSADASDerewqed  sczx ds w

        System.out.println(" Enter your number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        // after nextInt you cannot use directly nextLine!!
        System.out.println("Please enter your full name:" );
        String fullName = scanner.nextLine();
        System.out.println(" Enter your Address: ");
        String address=   scanner.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("address = " + address);
        System.out.println("number = " + number);
//
//        System.out.println("TEST");
//        String test = scanner.nextLine();
//        System.out.println("test" + test);

    }
}
