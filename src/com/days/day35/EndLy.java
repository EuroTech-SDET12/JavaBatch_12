package com.days.day35;

public class EndLy {
//    Given a string, return true if it ends in "ly".

    //    endsLy("oddly") → true
//    endsLy("y") → false
//    endsLy("oddy") → false
    public static void main(String[] args) {
        String str = "oddly";
        System.out.println("str.endsWith(\"ly\") = " + str.endsWith("ly"));
        System.out.println(endsLy("oddy"));
        System.out.println("endsLy(\"y\") = " + endsLy("y"));
        System.out.println("endsLy(\"oddly\") = " + endsLy("oddly"));

        //  first 2 letters is "od"  or not
        System.out.println("str.startsWith(\"od\") = " + str.startsWith("od"));
    }

    public static boolean endsLy(String str) {
//        if (str.endsWith("ly")) {
//            return true;
//        } else {
//            return false;
//        }
        return str.endsWith("ly");
    }
}
