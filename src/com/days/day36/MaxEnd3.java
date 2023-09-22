package com.days.day36;

import java.util.Arrays;

public class MaxEnd3 {

    //    Given an array of ints length 3, figure out which is larger,
//    , and set all the other elements to be that value.
//    Return the changed array.
//
//    maxEnd3([1, 2, 3]) → [3, 3, 3]
//    maxEnd3([11, 5, 9]) → [11, 11, 11]
//    maxEnd3([2, 11, 3]) → [3, 3, 3]
    public static void main(String[] args) {
        int[] nums = {11, 5, 9};// [11,11,11]
        //               0   1  2
        int max = 0;
        if (nums[0] > nums[1] && nums[0] > nums[2]) {
            max = nums[0];
        } else if (nums[1] > nums[2]) {
            max = nums[1];
        } else {
            max = nums[2];
        }
        System.out.println("max = " + max);
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(nums));
        maxEnd3(nums);
        int[] numbers = {10, 60, 80};
        int[] numbers1 = {100, 40, 180};
        int[] numbers2 = {20, 70, 50};
        maxEnd3(numbers);
        maxEnd3(numbers1);
        maxEnd3(numbers2);
    }

    public static void maxEnd3(int[] nums) {
        int max = 0;
        if (nums[0] > nums[1] && nums[0] > nums[2]) {
            max = nums[0];
        } else if (nums[1] > nums[2]) {
            max = nums[1];
        } else {
            max = nums[2];
        }
        System.out.println("max = " + max);
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(nums));
    }
}
