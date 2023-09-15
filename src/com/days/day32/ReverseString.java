package com.days.day32;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        //            01234
        String reverse = "";
        reverse = "olleH";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("=================");
//        for(int i=4;i>=0;i--){
        reverse = "";
        str = "David";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
            reverse = reverse + str.charAt(i);
        }
        System.out.println("reversed string = " + reverse);
        str = "Ali";
//        reverse="ilA";
        reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        System.out.println("reverse = " + reverse);

        reverseString("Emre");
        reverseString("Erkan");
        reverseString("Gylych");


    }


    public static void reverseString(String str) {
        //Hello ---> olleH
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            reversed = str.charAt(i) + reversed;
        }
        System.out.println("reversed = " + reversed);


    }
}
