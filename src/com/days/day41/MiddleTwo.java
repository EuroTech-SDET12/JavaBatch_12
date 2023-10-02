package com.days.day41;

public class MiddleTwo {

    //    Given a string of even length, return a string made of the middle two chars,
//    so the string "string" yields "ri". The string length will be at least 2.
//
//
//    middleTwo("string") → "ri"  6
    //           012345
//    middleTwo("code") → "od"
//    middleTwo("Practice") → "ct"
    public static void main(String[] args) {
        String str = "code";
        int half = str.length() / 2;
//        System.out.println( str.substring((str.length() / 2) - 1, (str.length() / 2) + 1));
        System.out.println(str.substring(half - 1, half + 1));
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
    }

    public static String middleTwo(String str) {
        int half = str.length() / 2;
        return str.substring(half - 1, half + 1);
    }
}
