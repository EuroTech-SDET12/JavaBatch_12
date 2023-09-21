package com.days.day35;

public class Question_1 {
    public static void main(String[] args) {
        // byte -->Byte
        //short -->Short
        //int--> Integer
        //long-->Long
        //boolean--> Boolean
        //char-->Character
        //float-->Float
        //double-->Double
        //primitive-->Wrapper autoboxing
        //wrapper ---> primitive unboxing
        Integer number = Integer.valueOf(10);
        Integer number2 = 10;
        Character character = Character.valueOf('a');
        int number10 = number;

        String age = "40";
        int expectedAge = 40;
        int i = Integer.parseInt(age);
        int actualAge = Integer.valueOf(age);
        System.out.println(expectedAge == actualAge);
        String price = "65.89";
        double doubleValue = Double.parseDouble(price);
        System.out.println("doubleValue = " + doubleValue);

        String str = "jc2kdhjkdhjkdhjk!%^^&^(*^*(^&*^*&%12*&*(*&(*)()KJH54()(&()&)(21";
//        Character.isDigit()-->parameter is char

        System.out.println("Character.isDigit(str.charAt(0)) = " + Character.isDigit(str.charAt(0)));
        System.out.println("Character.isDigit(str.charAt(1)) = " + Character.isDigit(str.charAt(1)));
        System.out.println("Character.isDigit(str.charAt(2)) = " + Character.isDigit(str.charAt(2)));
        System.out.println("Character.isDigit(str.charAt(3)) = " + Character.isDigit(str.charAt(3)));
        System.out.println("Character.isDigit(str.charAt(4)) = " + Character.isDigit(str.charAt(4)));
        System.out.println("Character.isDigit(str.charAt(5)) = " + Character.isDigit(str.charAt(5)));
        for (int n = 0; n < str.length(); n++) {
            if (Character.isDigit(str.charAt(n))) {
                System.out.println("str.charAt(n) = " + str.charAt(n));
            }
        }
    }
}
