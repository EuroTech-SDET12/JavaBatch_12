package com.days.day34;

import java.util.ArrayList;

public class WrapperClasses_1 {
    public static void main(String[] args) {
//        ArrayList<int> numbers = new ArrayList();Type argument cannot be of primitive type
        ArrayList<Integer> numbers = new ArrayList();

        Integer number = new Integer(20);//Integer(int)' is deprecated and marked for removal
        System.out.println("number = " + number);
        Integer digit = Integer.valueOf(20);
        System.out.println("digit = " + digit);
        Integer number5 = 20;
        System.out.println("number5 = " + number5);
        Double doubleValue = new Double(50.68);
        double result = 32.65;
        Double doubleValue2 = Double.valueOf(result);
        System.out.println("doubleValue2 = " + doubleValue2);
        System.out.println("doubleValue = " + doubleValue);
        Character character = Character.valueOf('B');
        System.out.println("character = " + character);
        int number10 = 10;
        Integer var = number10;
        int number25 = var;
        Boolean booleanValue = Boolean.valueOf(true);
        Boolean booleanValue2 = Boolean.valueOf("false");
        System.out.println("booleanValue2 = " + booleanValue2);

        String text = "35";
        int age = Integer.valueOf(text);
        System.out.println("age = " + age);
        int number2 = Integer.parseInt(text);
        System.out.println("number2 = " + number2);
        text = "Ali is 35";
        //       0  1  2
        //      01234567
        String[] split = text.split(" ");
        System.out.println("split[2] = " + split[2]);
        int i = Integer.parseInt(split[2]);
        System.out.println("i = " + i);
        text = "54.67";
        Double aDouble = Double.valueOf(text);
        System.out.println("aDouble = " + aDouble);
        double double5 = Double.valueOf(text);
        System.out.println("double5 = " + double5);
        ArrayList<Double> doubleValues = new ArrayList<>();
//        ArrayList<double> doubleValues2 = new ArrayList<>();Type argument cannot be of primitive type
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        int n = 10;
        System.out.println(Character.isDigit('n'));
        System.out.println("Character.isLetter('a') = " + Character.isLetter('a'));
        text = "Hello 65712 Ali";
        for (int x = 0; x < text.length(); x++) {
            if (Character.isLetter(text.charAt(x))) {//if that char is a letter print it
                System.out.print(text.charAt(x));
            }
        }
        System.out.println();
        System.out.println("Character.isDigit(50) = " + Character.isDigit(50));
        String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";


    }
}
