package com.days.day48;

public class TEst {


    public static void main(String[] args) {

        int a = 11144;
        int b = 11144;

        System.out.println("a==b = " + (a == b));


        String str1 = "Test";
        String str2 = new String("Test");

        System.out.println("str1 == str2 = " + (str1 == str2)); // checks objects memory location!
        System.out.println("str1.equals(str2) = " + str1.equals(str2)); // checking objects equality

        Integer num1 = new Integer(50);
        Integer num2 = 50;

        System.out.println("num1 == num2 = " + (num1 == num2));

    }
}
