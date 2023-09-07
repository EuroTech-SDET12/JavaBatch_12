package com.days.day26;

public class Recursions {
    public static void main(String[] args) {
//        print(5);
        print5(5);
        System.out.println(getSum(5));//5 4 3 2 1
        System.out.println(getSum(10));//10 9 8 7 6 5 ...
    }

    public static void print(int number) {
        if (number > 1) {
            print(number - 1);
        }
        System.out.println("number = " + number);
    }

    public static void print5(int number) {
        print4(number - 1);
        System.out.println(number);
    }

    public static void print4(int number) {
        print3(number - 1);
        System.out.println(number);
    }

    public static void print3(int number) {
        print2(number - 1);
        System.out.println(number);
    }

    public static void print2(int number) {
        print1(number - 1);
        System.out.println(number);
    }

    public static void print1(int number) {

        System.out.println(number);
    }

    public static int getSum(int number) {//5
        if (number == 0) {
            return 0;
        }
        return number + getSum(number - 1);
    }


}
