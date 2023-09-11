package com.days.day28;

public class DoubleChar {
    //    Given a string, return a string where for every char in the original, there are two chars.
//
//
//            doubleChar("The") → "TThhee"
//    doubleChar("AAbb") → "AAAAbbbb"
//    doubleChar("Hi-There") → "HHii--TThheerree"
    public static void main(String[] args) {
        doubleChar("The");
        doubleChar("AAbb");
    }

    public static void doubleChar(String str) {
//        str.charAt(0)+
//        str.charAt(0)+
//        str.charAt(1)+
//        str.charAt(1)+
//        str.charAt(2)+
//        str.charAt(2)+
        String doubleVal = "";
        for (int i = 0; i < str.length(); i++) {
            doubleVal = doubleVal + str.charAt(i) + str.charAt(i);
        }
        System.out.println("doubleVal = " + doubleVal);
    }
}
