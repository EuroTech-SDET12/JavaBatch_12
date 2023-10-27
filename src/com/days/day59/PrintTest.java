package com.days.day59;

import java.util.ArrayList;

public class PrintTest {
    public static void main(String[] args) {
        Printer printer = new Printer("Ali");
        printer.print();
        Printer printer1 = new Printer(123456);
        printer1.print();

        ArrayList<Printer> numbers = new ArrayList<>();
        print(10);
        print(55.86);
        print("Arsenal");
        add(10, 20);
        add(10, 20, 30);
        add(10, 20, 30, 40);
        add(10, 20, 30, 40, 50);
        add(10, 20, 30, 40, 50,10,20,50,80,90);


    }

    public static void add(int... a) {
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);
    }

//    public static void add(int a, int b, int c, int d) {
//        System.out.println(a + b + c + d);
//    }
//
//    public static void add(int a, int b, int c) {
//        System.out.println(a + b + c);
//    }
//
//    public static void add(int a, int b) {
//        System.out.println(a + b);
//    }

    public static <T> void print(T n) {
        System.out.println("n = " + n);
    }
//    public static void print(double n) {
//        System.out.println("n = " + n);
//    }
//    public static void print(int n) {
//        System.out.println("n = " + n);
//    }
//    public static void print(String n) {
//        System.out.println("n = " + n);
//    }
}
