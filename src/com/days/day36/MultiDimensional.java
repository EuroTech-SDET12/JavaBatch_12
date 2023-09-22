package com.days.day36;

import java.util.Arrays;

public class MultiDimensional {
    public static void main(String[] args) {
        //fruits--->4 apple banana orange mango
        //vegetables--->3 Potato  onion brocoli carrot
        String[] fruits = {"apple", "banana", "orange", "mango"};
        String[] vegetables = new String[3];
        vegetables[0] = "Potato";
        vegetables[1] = "Onion";
        vegetables[2] = "Carrot";
        System.out.println("Arrays.toString(fruits) = " + Arrays.toString(fruits));
        System.out.println("Arrays.toString(vegetables) = " + Arrays.toString(vegetables));
//                                                        0      1       2       3
        // first row index number is 0     //  fruits        apple, banana, orange, mango
        //  second row index is      1   //  vegetables      Potato, Onion, Carrot
        //  nuts        index        2         nuts          hazelnut pistachio
        String[][] fruitVegs = new String[3][];
//        fruitVegs[0] = new String[4];
//        fruitVegs[1] = new String[3];
        fruitVegs[0] = fruits;
        fruitVegs[1] = vegetables;

        System.out.println("fruitVegs[0][2] = " + fruitVegs[0][2]);
        System.out.println("fruitVegs[1][0] = " + fruitVegs[1][0]);

        fruitVegs[2] = new String[]{"hazelnut", "Pistachio"};
        System.out.println("Arrays.deepToString(fruitVegs) = " + Arrays.deepToString(fruitVegs));
        System.out.println("fruitVegs[2][1] = " + fruitVegs[2][1]);


    }
}
