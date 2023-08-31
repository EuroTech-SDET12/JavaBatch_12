package com.days.day21;

public class LocalVariable {
    public static void main(String[] args) {
        int var = 10;
        {
            int number = 20;
            System.out.println("var = " + var);
        }
//        System.out.println(n);
//        System.out.println(number); out of the block
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        //  System.out.println(i);
        int n = 20;
//        int n = 20;Variable 'n' is already defined in the scope

    }

    public static void print() {
        int n = 10;
    }

    public static void calculate() {
        int n = 5;
    }
}
