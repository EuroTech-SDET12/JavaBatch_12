package com.days.day18;

public class Old35 {
    //
//    print true if the given non-negative number is a multiple of 3 or 5, but not both.
//    Use the % "mod" operator -- see Introduction to Mod
//
//    old35(3) → true
//    old35(10) → true
//    old35(15) → false
    public static void main(String[] args) {
        int n = 15;
        // if number multiple of 3 and 5
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println(false);
        } else if (n % 3 == 0 || n % 5 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
