package com.days.day14;

public class ForLoops_2 {
    public static void main(String[] args) {

        // 5 4 3 2 1 0
//        for (int i = 5; i > 0; i++) {
//            System.out.println(i);// 5 6 7 8 .......  111111111    infinite loop
//        }
        // 5 -1 = 4 -1 =3 -1 =2-1=1-1=   0
        for (int i = 5; i >= 0; i--) {
            System.out.println("i = " + i);
        }

        //  10 8 6 4 2 0
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println("i = " + i);
        }

        System.out.println("================");

        for (int i = 10; i >= 0; i--) {//8 6 4 2 0 -2
            i--;//9 7 5 3 1 -1
            System.out.println("i = " + i);//9 7 5 3 1 -1
        }

        // find the even numbers between 50-100 and print them use %

        for (int i = 50; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");// 50 is an even number
                // 51 is an odd number
            } else {
                System.out.println(i + " is an odd number.");
            }
        }


        // 012345678910

        System.out.print("Hello!!!!");
        System.out.println(" Veli!!");

        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
//out of for loop
//        System.out.println();
        System.out.println("\nout of for block");

        //3 * 1 = 3
        //3 * 2 = 6
        //3 * 3 = 9
        //3 * 4 = 12


        //3 * 10 = 30
        for (int i = 1; i <= 10; i++) {
            String str = 3 + " * " + i + " = " + 3 * i;
            System.out.println( str);
        }


    }
}
