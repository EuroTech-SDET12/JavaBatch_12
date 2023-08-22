package com.days.day14;

public class Makes10 {
    //    Given 2 ints, a and b, print true if one  them is 10 or if their sum is 10.otherwise you will print false
//
//    makes10(9, 10) → true
//    makes10(9, 9) → false
//    makes10(1, 9) → true
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        boolean result = true;
        boolean result2;
        if (a == 10 || b == 10 || a + b == 10) {
//            System.out.println(true);
            result2 = true;
        } else {
//            System.out.println(false);
            result = false;
            result2 = false;
        }
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);

        boolean result3;
        if (a == 10) {
            result3 = true;
        } else if (b == 10) {
            result3 = true;
        } else if (a + b == 10) {
            result3 = true;
        } else {
            result3 = false;
        }
        System.out.println("result3 = " + result3);

        boolean result4 = (a == 10 || b == 10 || a + b == 10) ? true : false;
        System.out.println("result4 = " + result4);


    }
}
