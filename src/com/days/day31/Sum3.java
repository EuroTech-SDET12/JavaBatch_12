package com.days.day31;

import java.util.Arrays;

public class Sum3 {

//    Given an array of ints length 3, return the sum of all the elements.
//

    //    sum3([1, 2, 3]) → 6
//    sum3([5, 11, 2]) → 18
//    sum3([7, 0, 0]) → 7
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        sum3(numbers);

    }

    public static int sum3(int[] nums) {
        System.out.println(nums[0] + nums[1] + nums[2]);
        int sum = Arrays.stream(nums).sum();

        System.out.println("sum = " + sum);
        return sum;
    }
}
