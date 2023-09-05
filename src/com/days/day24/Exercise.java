package com.days.day24;

import java.util.Scanner;

public class Exercise {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //    calculateTemp(scanner);
        digitCalculator(scanner);

        scanner.close();
    }



    // EX1
    public static void calculateTemp(Scanner scanner) {


        System.out.print("Enter a degree in Celsius: ");
        double celsius = scanner.nextDouble();
        double fah = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " Celsius is " + fah + " Fahrenheit");

    }


    // EX2
    public static void digitCalculator(Scanner scanner){
        System.out.println("Enter number to calculate its digits:");
        int number = scanner.nextInt();
        int tempNumber = number;
        int sum=0;

        if(number <0){
        number*= -1;
        }
        // 1 5 6
        while (number>0) {
            int digit = number % 10;
            sum += digit;
            number /= 10; //number = number / 10;
        }

        System.out.println(tempNumber + " digits counts is " + sum);
    }


    //EX3




}
