package com.days.day16;

public class DoWhile {
    public static void main(String[] args) {
        // variable , condition , increment/decrement , block
        //   +            +             +                  +
        int n = 0;

        do {
            System.out.println("n = " + n);
            n++;
        } while (n < 3);

        System.out.println("==================");
        n = 0;
        do {
            System.out.println("Helloooo!!!");
        } while (n > 0);
        System.out.println("After do-while loop!!!");

        System.out.println("================");
        int number = 0;
//        do {
//            System.out.println(number);
//        } while (number < 5);    after all iteration value of the number is 0 and less then 5
        number = 0;
//        do {
//            System.out.println(number);
//            number++;
//        } while (number > 0);  infinite loop after all iteration value of the number is greater then 0
        number = 0;
        do {
            System.out.println(number);
            number++;
        } while (number < 3);// 3 times
        System.out.println("======================");
        //  10 9 8 7 6 5 4 3 2 1
        number = 10;
        do {
            System.out.println(number);
            number--;
        } while (number > 0);

        System.out.println("====================");
        // 5  10 15 20 25 .........40 45 50
        number = 5;
        do {
            number += 5;//  at first will be increased value then will be printed      number = number + 5;
            System.out.println(number);

        } while (number <= 50);
        System.out.println("=====================");
        // even and odd numbers between 10 and 30
        number = 10;
// and how many odd number and how many even number
        int oddNumbersCount = 0;
        int evenNumbersCount = 0;
        do {
            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
                evenNumbersCount++;
            } else {
                System.out.println(number + " is an odd number.");
                ++oddNumbersCount;
            }
            number++;
        } while (number <= 30);
        System.out.println("oddNumbersCount = " + oddNumbersCount);
        System.out.println("evenNumbersCount = " + evenNumbersCount);


    }
}
