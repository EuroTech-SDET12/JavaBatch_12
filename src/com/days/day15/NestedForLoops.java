package com.days.day15;

public class NestedForLoops {
    public static void main(String[] args) {
        //  **********   for loop
        //  **********   for loop
        //  **********   for loop
        //  **********   for loop
        //  **********   for loop

        for (int i = 0; i < 10; i++) {
            System.out.print("*");
            if (i == 9) {
                System.out.println();
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("=============");
        //outer loop
        for (int n = 0; n < 5; n++) {//outer loop specify row count
            for (int i = 0; i < 10; i++) {//inner loop  specify column count
                System.out.print("*");//**********
                System.out.println("n = " + n);
            }
            System.out.println();
        }

        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5


        outer:
        for (int i = 0; i < 3; i++) {
            inner:
            for (int n = 1; n <= 5; n++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
//0 0 0 0  first iteration of the outer loop print 0
//1 1 1 1  second iteration of the outer loop print 1
//2 2 2 2  third iteration of the outer loop print 2
//3 3 3 3  fourth iteration of the outer loop print 3
//4 4 4 4  fifth iteration of the outer loop print 4

        for (int i = 0; i < 5; i++) {
            System.out.print(0);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(1);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(2);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(3);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(4);
        }

        System.out.println("==========");
        System.out.println("NESTED FOR LOOPS!!!!");
        row:
        for (int i = 0; i < 5; i++) {
            column:
            for (int n = 0; n < 5; n++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }
}
