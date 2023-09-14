package com.days.day31;

import java.util.Arrays;

public class Arrays_3 {
    public static void main(String[] args) {
//        int numbers[] = {7, 10, 12, 18, 16, 21, 29, 15, 50, 39, 35};
//create a method and return even numbers in an array
        System.out.println(Arrays.toString(fiveNumber()));
        int[] tenNumber = tenNumber();
        System.out.println("Arrays.toString(tenNumber) = " + Arrays.toString(tenNumber));


    }

    public static int[] tenNumber() {
        int[] numbers = {10, 20, 30, 40, 50, 15, 25, 35, 45, 65};

        return numbers;
    }

    public static int[] fiveNumber() {
        int[] numbers = {10, 20, 30, 40, 50};

        return numbers;
    }
}
