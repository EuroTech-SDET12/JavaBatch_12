package com.days.day41;

public class Withoutx2 {

//    Given a string, if one or both of the first 2 chars is 'x',
//        return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
//

    //    withoutX2("xHi") → "Hi"
//    withoutX2("Hxi") → "Hi"
//    withoutX2("Hi") → "Hi"
//    withoutX2("Hix") → "Hix"
    public static void main(String[] args) {
        String str = "xxHiAli";// Hi

        System.out.println(str.substring(0, 2).replace("x", "") + str.substring(2));
        System.out.println(str.substring(0, 2).replace("x", "").concat(str.substring(2)));

//        str = "Hi Ali Hi Veli Hi Hi Messi Hi"; How many Hi are there in that string?!!!!!!!!!!!!!
        System.out.println("without2(\"Hxi\") = " + without2("Hxi"));
    }

    public  static String without2(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2).replace("x", "").concat(str.substring(2));
        } else if (str.length() == 1) {
            return str.substring(0, 1).replace("x", "");
        } else {
            return str;
        }
    }
}
