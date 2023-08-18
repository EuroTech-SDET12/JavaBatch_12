package com.days.day13;

public class NestedTernary {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 500;
        int largestNumber = 0;
        // find the largest number
        // if statement
        // print largestNumber value

        if (a > b && a > c) {
            largestNumber = a;
//        } else if (b > a && b > c) {// redundant part??????
        } else if (b > c) {
            largestNumber = b;
//        } else if (c > a && c > b){ unnecessary
        } else {
            largestNumber = c;
        }
        System.out.println("largestNumber = " + largestNumber);
        int greatestNumber = 0;
        if (a > b) {
            if (a > c) {
                greatestNumber = a;
            }
        } else if (b > c) {
            greatestNumber = b;

        } else {
            greatestNumber = c;
        }
        System.out.println(greatestNumber == largestNumber);
//                       operand1 ?     expresiion1 :  expression2
//                      condition         true      :     false
        int biggestNumber = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("largestNumber = " + largestNumber);
        System.out.println("greatestNumber = " + greatestNumber);
        System.out.println("biggestNumber = " + biggestNumber);

        System.out.println(largestNumber == greatestNumber && largestNumber == biggestNumber);

    }
}
