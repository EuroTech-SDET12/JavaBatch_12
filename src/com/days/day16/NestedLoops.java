package com.days.day16;

public class NestedLoops {
    public static void main(String[] args) {

        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println("*");
        System.out.println("================");

        for (int i = 0; i < 4; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print("*");
        }


        System.out.println("\n================");

        for (int i = 0; i < 3; i++) {
            for (int n = 0; n < 4; n++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3 * 1 = 3
        // 3 * 2 = 6

        // 3 * 10 = 30

        // 1 * 1 = 1        2 * 1 = 2           3 * 1 = 2                 4                5
        // 1 * 2 = 2        2 * 2 = 4
//                          2 * 3 = 6
        // 1 * 10 = 10
//                            2 * 9 =18
//                            2 * 10 = 20

        for (int n = 1; n <= 10; n++) {
            System.out.println("Multiplication table for " + n);
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }
        }

        System.out.println("============");
        int number = 1;
        int counter = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
            if (i == 10) {
                counter++;
                number = counter;
                i = 0;
                if(counter==11){
                    break;
                }
                System.out.println("=============");
            }
        }


    }
}
