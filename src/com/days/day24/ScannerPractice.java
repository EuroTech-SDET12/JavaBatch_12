package com.days.day24;
import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("ENTER AN INTEGER NUMBER: ");
//        //System.out.println(scanner.nextInt());
//        int number = scanner.nextInt();
//        System.out.println("My input value is " + number);
//
//        System.out.println("////////////////////////////////\n");
//
//        System.out.println("ENTER YOUR EXPECTED SALARY:");
//        double salary = scanner.nextDouble();
//        System.out.println("salary = " + salary);
//
//
//        System.out.println("////////////////////////////////\n");
//
//        System.out.println("ENTER YOUR TAX RATE:" );
//        //do not enter f keyword, just type floating number,
//        //it will automatically save as float
//        float taxRate = scanner.nextFloat();
//        System.out.println("taxRate = " + taxRate);



        System.out.println("////////////////////////////////\n");
        System.out.println("ENTER YOUR CREDIT CARD NUMBER");
       long cardNumber= scanner.nextLong();
        //do not enter L keyword, just type your number
        System.out.println("cardNumber = " + cardNumber);



        System.out.println("////////////////////////////////\n");
        // for scanner.nextByte() scanner.nextShort()

    }
}
