package com.days.day20;

public class Method_3 {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 20;
        getSum(a, b);
        System.out.println(returnSum(50, 20));
        int result = returnSum(100, 60);
        System.out.println("result = " + result);
        //isNumberPositive(10)--->true
        //isNumberPositive(-10)--->false
        boolean positive = isNumberPositive(10);
        System.out.println(isNumberPositive(10));
        System.out.println("positive = " + positive);
        positive = isNumberPositive(-100);
        System.out.println("positive = " + positive);

        // greeting( name);--->hello + name
        System.out.println(greeting("Ronaldo"));
        String helloJJ = greeting("Jordan");
        System.out.println("helloJJ = " + helloJJ);

        // 2 integer return the larger one and print inside the main method
        System.out.println(findLargerNumber(10, 20));
        System.out.println(findLargerNumber(50, 30));


    }

    static int findLargerNumber(int number1, int number2) {
        int maxValue = number1 > number2 ? number1 : number2;
        return maxValue;
    }


    public static String greeting(String name) {
        String sayhello = "Hello " + name;
//        System.out.println("sayhello = " + sayhello);
        return sayhello;
    }

    public static boolean isNumberPositive(int number) {
        boolean result = false;
        if (number >= 0) {
            System.out.println(number + " is positive");
            result = true;
        } else {
            result = false;
            System.out.println(number + " is negative");
        }
        return result;
    }


    static int returnSum(int a, int b) {
        System.out.println("ReturnSum method!!!!");
        int sum = a + b;
        return sum;
    }

    static void getSum(int a, int b) {
        System.out.println("GetSum method!!");
        int sum = a + b;
        System.out.println(sum);

    }
}
