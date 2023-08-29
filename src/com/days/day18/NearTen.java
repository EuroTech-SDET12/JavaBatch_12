package com.days.day18;

//      Given a non-negative number"num",print true if num is within 2 of a multiple of 10.
//        Note:(a%b)is the remainder of dividing a by b,so(7%5)is 2.See also:Introduction to Mod
//
//                nearTen(12) → true
//                nearTen(17) → false
//                nearTen(19) → true  2*10=20   18 19  21 22       38 39    41 42

public class NearTen {
    public static void main(String[] args) {

        int n = 19;
        System.out.println("38%10 = " + 38 % 10);
        System.out.println("39%10 = " + 39 % 10);
//           41                42            38            39          40
        if (n % 10 == 1 || n % 10 == 2 || n % 10 == 8 || n % 10 == 9||n%10==0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
