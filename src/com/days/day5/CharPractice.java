package com.days.day5;

public class CharPractice {

    public static void main(String[] args) {

        char character = 'A';  //65 decimal number
        System.out.println(character);

        character = '1'; // 49
        System.out.println(character);

        int value = 1;
        System.out.println(value);

        // value variable is not equal to character variable,
        // their data types are different!!

        char test = '§';
        System.out.println(test);

        int testDecimalValue = test; // java will take test char variables decimal values and assign to int variable

        System.out.println(testDecimalValue);


        char aWithUpperDot = 228; // this number is characters decimal number
        System.out.println(aWithUpperDot);

        char gWithDash = 286;
        System.out.println(gWithDash);

        gWithDash='Ğ';

    }
}
