package com.days.day4;

public class IntegerDataTypes {

    public static void main(String[] args) {

        byte byteValue = 127;
        System.out.println(byteValue);
//        soutv
        System.out.println("byteValue = " + byteValue);

     //   byteValue = 128;  throws error because value 128 is out of byte range!!!

        // ctrl  /
//        byteValue = -129; throws error because value -129 is out of byte range!!!


        short shortValue = 32767;
        // soutv
        System.out.println("shortValue = " + shortValue);

//        shortValue = 32768;

//        int cardNumber = 4444333322221111;

        // all integer value that we add java code , it will be int data type automatically
        // it's mean that the default data type for integer number is "int"
        // it's mean that the default data type for floating number is "double"

        // to declare long, add 'L' character end of the number!!!!
        long cardNumber = 4444333322221111L;
        System.out.println("cardNumber = " + cardNumber);

        cardNumber = 13;
    }
}
