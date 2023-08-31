package com.days.day21;

public class LargerNumber {
//    Write a method that accepts 3 numbers and displays the greatest number
//    maxValueOf3()

    public static void main(String[] args) {
        int max1 = maxValueOf3(10, 20, 15);
        int max2 = maxValueOf3(10, 20, 30);
        int max = maxValueOf3(100, 20, 30);
        System.out.println("max = " + max);

    }

    public static int maxValueOf3(int a, int b, int c) {
        int maxValue = 0;
        if (a > b && a > c) {
            maxValue = a;
        } else if (b > c) {
            maxValue = b;
        } else {
            maxValue = c;
        }
        System.out.println("maxValue = " + maxValue);
        return maxValue;
    }
}
