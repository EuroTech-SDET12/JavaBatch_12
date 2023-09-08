package com.days.day27;

public class Quiz_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        boolean b1 = a > b ? true : false;
        System.out.println("b1 = " + b1);
        System.out.println("======================");
        int k = 0;
        int m = 0;
        for (int i = 0; i <= 3; i++) {//  1 2 5
            k++;//1 2 3
            if (i == 2) {
                i = 4;
            }
            m++;//1 2 3
        }
        System.out.println("k = " + k);
        System.out.println("m = " + m);
        System.out.println("===================");
        int number = 100;
        switch (number) {
            default:
                System.out.println("not matched");
                break;
            case 5:
                System.out.println("five");
            case 10:
                System.out.println("ten");
        }
//        long l = 12345678;
//        switch (l){ Incompatible types. Found: 'long', required: 'char, byte, short, int,
//
//        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {// 0 1 2 3
            if (i % 3 == 0) {// 3 6 9
                sum = sum + i;// = 0 + 3   sum=3+6  sum=9 sum= 9 + 9 sum=18
            }
        }
        System.out.println("sum = " + sum);

    }
}
