package com.days.day13;

public class Ternary_2 {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        if (a > b)
            System.out.println(a + " is bigger then " + b);
        else
            System.out.println(b + " is bigger then " + a);
        b = 200;
//         (a > b) ? System.out.println(a) : System.out.println(a);
        int biggerNumber = a > b ? a : b;
        System.out.println("biggerNumber = " + biggerNumber);
        String result = a > b ? a + " is greater then " + b : b + " is greater then " + a;
        System.out.println("result = " + result);
        boolean result2 = a > b ? true : false;
        System.out.println("result2 = " + result2);


    }
}
