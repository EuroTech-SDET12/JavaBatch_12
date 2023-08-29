package com.days.day17;

public class Do_WhileExamples {
    public static void main(String[] args) {
        // 1-5 for-while-do while
        int i = 1;
//        int i=1;Variable 'i' is already defined in the scope
        for (; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        i = 1;
        System.out.println("while loop!!!!!");
        while (i < 6) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.println("Do-While loop!!!!1");
        i = 1;
        do {
            i++;
            System.out.print(i + " ");//2 3 4 5 6
        } while (i <= 5);
        System.out.println();
        System.out.println("i = " + i);//6


        int sum = 0;
        i = 1;
        //10-20 do while

        do {
            sum = sum + i;
            i++;
        } while (i < 20);
        System.out.println("sum = " + sum);
        i = 1;
        sum = 0;

        while (i < 20) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum = " + sum);



    }
}
