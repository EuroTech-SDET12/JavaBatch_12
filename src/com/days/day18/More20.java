package com.days.day18;

public class More20 {
    //    print true if the given non-negative number is 1 or 2 more than a multiple of 20.
//    See also: Introduction to Mod
//
//    more20(20) → false
//    more20(21) → true
//    more20(22) → true
    public static void main(String[] args) {
        int n = 20;
        if (n % 20 == 1 || n % 20 == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
