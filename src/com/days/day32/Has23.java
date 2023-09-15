package com.days.day32;

import java.util.Arrays;

public class Has23 {

    //    Given an int array length 2, print true if it contains a 2 or a 3.

    //    has23([2, 5]) → true
//    has23([4, 3]) → true
//    has23([4, 5]) → false
    public static void main(String[] args) {
        int[] nums = {4, 5};
        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        int[] numbers = { 5, 10, 35, 20, 80, 60};
        boolean result = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3 || numbers[i] == 2) {
//                System.out.println(true);
                result = true;
            }
        }
        System.out.println("result = " + result);
    }
}
