package com.days.day26;

import com.days.day23.Student;

public class Strings {
    public static void main(String[] args) {
        String name = "Ronaldo";// first way
        String studentName = new String("Messi");//second way
        System.out.println("studentName = " + studentName);
        String number = "123";
        System.out.println("456");
        System.out.println("Hello Strings");

        //city
        // class name    variablename = new classname
//Returns:
//the length of the sequence of characters represented by this object.
        String city = new String("London");
        String country = "Spain";// 5 characters
        System.out.println("Italy");
        System.out.println("country.length() = " + country.length());//5
        int lengthOfCountry = country.length();
        System.out.println("lengthOfCountry = " + lengthOfCountry);
        System.out.println("city.length() = " + city.length());//London --->6 characters
        city = "Barcelona";
        System.out.println("city.length() = " + city.length());//9
        System.out.println("\"Istanbul\".length() = " + "Istanbul".length());//8

//        charAt
        city = "Istanbul";
        //      01234567  index number starts from    0   !!!!!!!!!!!!
//        city.charAt(index)
        System.out.println("city.charAt(0) = " + city.charAt(0));
        System.out.println("city.charAt(1) = " + city.charAt(1));
        System.out.println("city.charAt(2) = " + city.charAt(2));
        System.out.println("city.charAt(3) = " + city.charAt(3));
        System.out.println("city.charAt(4) = " + city.charAt(4));
        System.out.println("city.charAt(5) = " + city.charAt(5));
        System.out.println("city.charAt(6) = " + city.charAt(6));
        System.out.println("city.charAt(7) = " + city.charAt(7));
        city = "Barcelona";
        //      012345678
        System.out.println("city.charAt(7) = " + city.charAt(7));
        System.out.println("city.length() = " + city.length());
        System.out.println("city.charAt(8) = " + city.charAt(8));
        //write a dynamic code to access the last letter of the string object
        city.charAt(8);
        System.out.println("city.charAt(city.length()-1) = " + city.charAt(city.length() - 1));
        int lastLetterIndexNumber = city.length() - 1;
        System.out.println("city.charAt(lastLetterIndexNumber) = " + city.charAt(lastLetterIndexNumber));
        city = "London";
        //      012345
        System.out.println("city.charAt(city.length()-1) = " + city.charAt(city.length() - 1));
        printLastLetter("Hello!");
        printLastLetter("Hello Java");
        printLastLetter("London");

        // use loops to print each letter of the string!!!!!!!!!

        city = "Istanbul";
        //      01234567
        city = "madrid";//length 6
        //      012345
        for (int i = 0; i < city.length(); i++) {
            System.out.println(city.charAt(i));
        }
        city = "istanbull";
        System.out.println("city.contains(\"bull\") = " + city.contains("bull"));
        System.out.println("city.contains(\"lamp\") = " + city.contains("lamp"));


    }

    public static void printLastLetter(String str) {
        System.out.println("last letter of the  " + str + " = " + str.charAt(str.length() - 1));
    }
}
