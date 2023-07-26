package com.days.day7;

public class Promotion {
    public static void main(String[] args) {
        byte b = 25;
        short s = 56;
        int n = b + s;// byte + short ---> int
        String str = "Java " + 10 + 20;
        //  String + int  --> String   Java10
        //    String + 20 --->String   Java1020
        //   Java 1020 -->String
        System.out.println("str = " + str);//Java 1020

        String str5 = 10 + 20 + " Java";
        // int + int -->int-->30
        //  int + String --> 30 + Java-->String
        // 30 Java
        System.out.println("str5 = " + str5);
        System.out.println(10 + 20 + " Java " + 10 * 20);
        // 30 + " Java "+  200

        //double + short ===>double
        // double+ int===>double
        //double =long ===>double
        //double =byte ===>double

        int n5 = 50;
        long l = 253;
        long l1 = l + n5;//alt + enter --> introduce local variable
// long + int ---> long
        float f = 12.87f;
        int v = (int) (f + n5);
        float v1 = f + n5;
        //   float + int ===>float
        short s5 = 54;
        byte b5 = 65;
        int i = b5 + s5;
//     byte + short ====> int
        System.out.println(10 / 4);
//                         int int ===> int
        System.out.println(10 / 4.0);
        //                 int  double ===> double
        int n2 = (short) (20.87 + 10);
//               double + int ===> double
//                larger --> smaller
    }
}
