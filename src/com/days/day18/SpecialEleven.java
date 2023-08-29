package com.days.day18;

public class SpecialEleven {

    //    We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
//    print true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod
//
//
//    specialEleven(22) → true
//    specialEleven(23) → true
//    specialEleven(24) → false
    public static void main(String[] args) {
        int n = 24;
        if (n % 11 == 0 || n % 11 == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
