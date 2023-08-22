package com.days.day15;

public class Patterns {
    public static void main(String[] args) {
        // * * * *
        // * * * *
        // * * * *
        // * * * *
        // * * * *
        out:
        for (int i = 0; i < 5; i++) {
            in:
            for (int n = 0; n < 4; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("================");
        System.out.println("TRIANGLE!!!!");
        // *
        // **
        // ***
        // ****
        // *****

        out:
        for (int i = 0; i < 5; i++) {// i++=>1  i=>2
            inner:
            for (int n = 0; n <= i; n++) {//
                //          0<=0
                //          0<=1 1<=1
                //          0<=2 1<=2 2<=2
                System.out.print("*");
            }
            System.out.println();
        }


        out:
        for (int i = 1; i <= 5; i++) {// i++=>1  i=>2
            inner:
//1 2 3 4 5
            for (int n = 0; n < i; n++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("=======================");
        //*****
        //****
        //***
        //**
        //*
        out:
        for (int i = 0; i < 5; i++) {
            inner:
            for (int n = i; n < 5; n++) {
                System.out.print("*");
                // *****
                // ****
            }
            System.out.println();

        }

        out:
        for (int i = 0; i < 5; i++) {// 0 1 2
            inner:
            for (int n = i; n < 5; n++) {
                System.out.print(i);
                // 00000
                // 1111
                // 222
                // 33
                // 4
            }
            System.out.println();

        }

        for (int i = 0; i < 5; i++) {// 0 1 2
            inner:
            for (int n = i; n < 5; n++) {
                System.out.print(n);
                // 01234
                // 1234
                // 234
                // 34
                // 4
            }
            System.out.println();
        }
        //         *
        //        ***
        //       *****
        //      *******
        System.out.println("===================");
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello");
        }

        //         *
        //        ***
        //       *****
        //      *******
        //       *****
        //        ***
        //         *

    }
}
