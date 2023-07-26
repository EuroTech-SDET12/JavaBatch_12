package com.days.day7;

public class ExplicitlyCasting {
    public static void main(String[] args) {
        //    Expilicitly Casting - Narrowing: converting a larger data type to a smaller size data type.
        //  double-float-long-int-short-byte
        // larger to smaller
        double double1 = 200.96;
        int integer1 = (int) double1;//explicitly casting
        System.out.println("integer1 = " + integer1);
        int integer2 = (int) 85.432;
        System.out.println("integer2 = " + integer2);
        short short1 = (short) integer2;
        System.out.println("short1 = " + short1);
        short1 = (short) 23.47;
        System.out.println("short1 = " + short1);

        byte byte2 = (byte) 300;//256 module 256   byte --->1 byte -->8 bit 8 bit keeps 256 128+128
        System.out.println("byte2 = " + byte2);// 44
        byte2 = (byte) 257;
        System.out.println("byte2 = " + byte2);
        byte2 = (byte) 128;//127-256
        System.out.println("byte2 = " + byte2);
        short short5 = 290;
        byte byte5 = (byte) short5;//290-256  34
        System.out.println("byte5 = " + byte5);
        //      0001 0010 0010   ---->290
        //           0010 0010   ----> byte
        //             32     2 --->34

        byte byte6 = (byte) 150;
        System.out.println("byte6 = " + byte6);// -106
    }
}
