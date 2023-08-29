package com.days.day18;

public class Ternary {
    public static void main(String[] args) {
        int num = 12;
        if (num >= 0) {
            System.out.println("Number is positive!");
        } else {
            System.out.println("number is negative!");
        }
        num = -10;
//         condition ?    true             : false
        String result = (num >= 0) ? "Number is positive!" : "number is negative!";
        System.out.println("result = " + result);

        boolean isNumberPositive = num > 0 ? true : false;
        System.out.println("isNumberPositive = " + isNumberPositive);

        char isPositive = num > 0 ? '+' : '-';
        System.out.println("isPositive = " + isPositive);

    }
}
