package com.days.day33;

import java.util.Arrays;

public class Front11 {

    //    Given 2 int arrays, a and b, of any length, return
//    a new array with the first element of each array.
//
//
//            front11([1, 2, 3], [7, 9, 8]) → [1, 7]
//    front11([1], [2]) → [1, 2]
//    front11([1, 7], [8]) → [1,8]
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int[] numbers2 = {7, 9, 8};
        //we need to create a new array
        int[] front11 = new int[2];
        front11[0] = numbers[0];
        front11[1] = numbers2[0];
        System.out.println("Arrays.toString(front11) = " + Arrays.toString(front11));


    }
}
