package com.days.day32;

import java.util.Arrays;

public class SwapEnds {

    //    Given an array of ints, swap the first and last elements in the array.
//    Return the modified array. The array length will be at least 1.
//
//    swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
//    swapEnds([1, 2, 3]) → [3, 2, 1]
//    swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        //            0  1  2  3
        int first = nums[0];
//        nums[0] = nums[3];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = first;
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        //find max value in an array!!!!

    }
}
