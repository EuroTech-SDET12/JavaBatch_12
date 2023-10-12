package com.days.day48;

import java.util.Arrays;

public class FinalArray {

    public static void main(String[] args) {

        int[] number1 = {11,22,33,44};
        System.out.println("Number1 = " + Arrays.toString(number1));
        number1[0] = 55;
        System.out.println("Number1 = " + Arrays.toString(number1));
        int[] number2 = {44,33,22,11};
        number1 = number2;
        System.out.println("Number1 = " + Arrays.toString(number1));

        System.out.println("//////////////////\n");
        final int[] number3 = {5,6,7,8};
        System.out.println("Number3 = " + Arrays.toString(number3));
        number3[0] = 55;
        System.out.println("Number3 = " + Arrays.toString(number3));

      //  number3 = number2; NO POSSIBLE !! IT IS FINAL ARRAY!!
    }
}
