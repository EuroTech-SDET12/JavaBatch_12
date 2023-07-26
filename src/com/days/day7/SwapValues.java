package com.days.day7;

public class SwapValues {
    public static void main(String[] args) {
        int a = 10, num;
        int b = 30;
        num = 50;
        System.out.println("num = " + num);//50
        num = a;
        System.out.println("num = " + num);//10
        a = 100;
        System.out.println("num = " + num);//10
        System.out.println("a = " + a);//100

        a = 7;
        b = 20;
        //  code
        int third = a;//7
        a = b;
        b = third;

        //create third variable

        System.out.println("a = " + a);
        //a--->20
        System.out.println("b = " + b);
        //b--->7

    }
}
