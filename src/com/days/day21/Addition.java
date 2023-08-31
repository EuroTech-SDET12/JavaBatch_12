package com.days.day21;

public class Addition {
    public static void main(String[] args) {
        add(10, 20);
        add(10.50, 20.80);
        add(10, 20, 30);
        add("Erkan", 50);
        System.out.println(Math.max(10, 20));
        System.out.println(Math.max(10.50, 10.80));
    }

    public static void add() {
        System.out.println(10);
    }

//    public static int add() { overloading is not possible by only changing retuirn type
//        System.out.println(10);
//        return 5;
//    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(String name, int age) {
        System.out.println(name + " = " + age);
    }

    public static void add(int age, String name) {
        System.out.println(name + " = " + age);
    }


}
