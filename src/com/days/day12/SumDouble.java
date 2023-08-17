package com.days.day12;

public class SumDouble {
    //    Given two int values, print their sum. Unless the two values are the same,
//    then print double their sum.
//
//            sumDouble(1, 2) → 3
//    sumDouble(3, 2) → 5
//    sumDouble(2, 2) → 8
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int sum = a + b;
        if (a == b) {
            sum *= 2;//    sum = 2 * sum;
        }
        System.out.println("sum = " + sum);


//        if (a == b) {
////            System.out.println(2 * (a + b));
////            System.out.println(2 * sum);
//            sum *= 2;//    sum = 2 * sum;
////        } else if (a != b) {
//        }
////        else {
//////            System.out.println(a + b);
//////            System.out.println(sum);
////        }
//        System.out.println("sum = " + sum);


    }


}
