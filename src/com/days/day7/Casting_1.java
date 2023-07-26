package com.days.day7;

public class Casting_1 {
    public static void main(String[] args) {
        // numeric data types ---> byte, short, int, long
        //           decimal  ---> float,double
        // non numeric        --->boolean ,char
        int n = 10;
        double d = 20.50;
        d = n;
        boolean b = true;
        //  b = n; int ---> boolean not possible
        //   n = b; boolean ---> int   not possible

        //byte ---> 1 byte ---> 8 bit
        byte byte1 = -128; //256
        //    - - - - - - - -
        //    7 6 5 4 3 2 1 0  2 power
        //    128 64 32 16 8 4 2 1

        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);// 1 byte
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);// 2 byte
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);// 4 byte
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);// 8 byte

        //float --> 4 byte
        //long  --> 8 byte

        int n1 = 50;
        byte b2 = 50;
        n1 = b2;// widening
        b2=(byte)n1;


    }
}
