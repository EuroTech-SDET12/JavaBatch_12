package com.days.day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxEndList {
    //    Given an arraylist of ints length 3, figure out which is larger,
//    , and set all the other elements to be that value.
//    Return the changed array.

    public static void main(String[] args) {
        //10 20 5---> 20 20 20
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(5);
        numbers.add(10);
        System.out.println("numbers = " + numbers);
        int max = 0;
        if (numbers.get(0) > numbers.get(1) & numbers.get(0) > numbers.get(2)) {
            max = numbers.get(0);
        } else if (numbers.get(1) > numbers.get(2)) {
            max = numbers.get(1);
        } else {
            max = numbers.get(2);
        }
        System.out.println("max = " + max);
        int max1 = Collections.max(numbers);
        System.out.println("max1 = " + max1);
        numbers.set(0, max1);
        numbers.set(1, max1);
        numbers.set(2, max1);
        System.out.println("numbers = " + numbers);

        maxList(numbers);
        ArrayList<Integer> numbers5 = new ArrayList<>(Arrays.asList(10, 20, 30));
        maxList(numbers5);
        ArrayList<Integer> number10 = new ArrayList<>(Arrays.asList(50, 100, 30));
        maxList(number10);
        ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(10, 20, 30, 50, 60, 70, 80, 90, 100));
        makeMax(digits);
    }

    public static ArrayList<Integer> maxList(ArrayList<Integer> numbers) {
        int max = Collections.max(numbers);
        numbers.set(0, max);
        numbers.set(1, max);
        numbers.set(2, max);
        System.out.println("numbers = " + numbers);
        return numbers;
    }

    public static void makeMax(ArrayList<Integer> numbers) {
        int max = Collections.max(numbers);
        int size = numbers.size();
        numbers.clear();
        for (int i = 0; i < size; i++) {
            numbers.add(max);
        }
        System.out.println("numbers = " + numbers);
    }
}
