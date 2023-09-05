package com.days.day24;

import java.util.Scanner;

public class HasNextPractice {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter id number:");

        //System.out.println("scanner.hasNextInt() = " + scanner.hasNextInt());

//        if (scanner.hasNextInt()){
//            int number = scanner.nextInt();
//            System.out.println("number = " + number);
//        } else {
//            System.out.println("INVALID VALUE!!!");
//        }

        while (!scanner.hasNextInt()) {
            System.out.println("INVALID INPUT, Please re enter value!!!");
            scanner.next();
        }

        int number = scanner.nextInt();
        System.out.println("number = " + number);


    }
}
