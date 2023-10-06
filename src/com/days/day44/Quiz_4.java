package com.days.day44;

public class Quiz_4 {    public static void main(String[] args) {
        String var = new String("Hello");
        String str = "Hello";
        System.out.println("var==str = " + (var == str));
        System.out.println(var.equals(str));
        str = " hello Java";
        //   01234567
        System.out.println(str.indexOf("Java"));
        int[] numbers = new int[10];
        numbers[0] = 30;
        System.out.println("numbers[0] = " + numbers[0]);//30
        numbers = new int[20];//new array
        System.out.println(numbers[11]);
        System.out.println("numbers[0] = " + numbers[0]);
        String[] months = new String[12];
        int[] digits = {1, 2, 3};
    }
}
