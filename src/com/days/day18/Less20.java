package com.days.day18;

//Print  true if the given non-negative number is 1 or 2 less than a multiple of 20.
//        So for example 38 and 39 print true, but 40 prints false.
//        See also: Introduction to Mod   (2*20)-1=39     (2*20)-2=38      (3*20)-1=59 true  (3*20)-3=57-->false
//
//
//        less20(18) → true
//        less20(19) → true
//        less20(20) → false
public class Less20 {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(n % 20);//18 19
        if (n % 20 == 18 || n % 20 == 19) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
