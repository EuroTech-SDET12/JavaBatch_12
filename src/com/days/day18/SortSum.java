package com.days.day18;

public class SortSum {
    //    Given 2 ints, a and b, print their sum. However, sums in the range 10..19 inclusive,
//    are forbidden, so in that case just print 20.
//
//    sortaSum(3, 4) → 7
//    sortaSum(9, 4) → 20
//    sortaSum(10, 11) → 21
    public static void main(String[] args) {
        int a = 10;
        int b = 11;

        int sum = a + b;
        if (sum >= 10 && sum < 20) {
            System.out.println(20);
        } else {
            System.out.println(sum);
        }

    }
}
