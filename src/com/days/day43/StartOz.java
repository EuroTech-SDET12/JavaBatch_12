package com.days.day43;

public class StartOz {

    //    Given a string, return a string made of the first 2 chars (if present),
//    however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
//
//    startOz("ozymandias") → "oz"
//    startOz("bzoo") → "z"
//    startOz("oxx") → "o"
    public static void main(String[] args) {
        System.out.println("startOz(\"ozymandias\") = " + startOz(""));
    }

    public static String startOz(String str) {
        String s = "";
        if (str.length() >= 2) {
            if (str.charAt(0) == 'o' && str.charAt(1) == 'z') {
//                return "oz";
                s = "oz";
            } else if (str.charAt(1) == 'z') {
                s = "z";
            } else if (str.charAt(0) == 'o') {
                s = "o";
            }

        } else {//length is less then 2
            if (str.length() == 0) {//if the length is 0

            } else if (str.charAt(0) == 'o') {//if the length is 1
                s = "o";
            }
        }
        return s;
    }
}
