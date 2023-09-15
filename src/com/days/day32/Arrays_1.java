package com.days.day32;

import java.util.Arrays;

public class Arrays_1 {
    public static void main(String[] args) {
        int number = 10;
        number = 20;
        //store multiple values
        // "10" "20" "5" 50 80
        int[] numbers = {10, 20, 5, 50, 80};// elements
        //                0  1   2  3   4
        System.out.println("numbers.length = " + numbers.length);//5
        System.out.println("numbers[3] = " + numbers[3]);
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers = " + numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Arrays.binarySearch(numbers,20) = " + Arrays.binarySearch(numbers, 20));
        Arrays.sort(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Arrays.binarySearch(numbers,20) = " + Arrays.binarySearch(numbers, 20));
        int[] copied = Arrays.copyOf(numbers, 10);
        copied[7] = 100;
        System.out.println("Arrays.toString(copied) = " + Arrays.toString(copied));
        int[] copiedSame = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Arrays.toString(copiedSame) = " + Arrays.toString(copiedSame));

        //Toyota Honda BMW
        String[] cars = new String[5];
        cars[0] = "Honda";
        cars[1] = "Toyota";
        cars[2] = "BMW";
        System.out.println("Arrays.toString(cars) = " + Arrays.toString(cars));

    }
}
