package com.days.day32;

import java.util.Arrays;

public class String_1 {
    public static void main(String[] args) {
        int number = 10;
        String club = "Manchester City";
        //             012345678901234
        String city = new String("Istanbul");
        //                              01234567
        System.out.println("London");
        //length()
        System.out.println("London".length());
        System.out.println("club.length() = " + club.length());
        System.out.println("city.length() = " + city.length());
        //charAt()
        System.out.println("club.charAt(0) = " + club.charAt(0));
        System.out.println("city.charAt(0) = " + city.charAt(0));
        System.out.println("club.charAt(14) = " + club.charAt(14));
        System.out.println("city.charAt(14) = " + city.charAt(7));
        System.out.println("club.charAt(club.length()-1) = " + club.charAt(club.length() - 1));
        System.out.println("city.charAt(city.length()-1) = " + city.charAt(city.length() - 1));
        //substring()
        System.out.println("club.substring(0,2) = " + club.substring(0, 2));
//        String club = "Manchester City";
        //             012345678901234
        System.out.println("club.substring(13,15) = " + club.substring(13, 15));
        System.out.println("club.substring(13) = " + club.substring(13));
        System.out.println("club.substring(club.length()-2) = " + club.substring(club.length() - 2));
        System.out.println("club.substring(club.length()-4) = " + club.substring(club.length() - 4));
//        String city = new String("Istanbul");
        //                          01234567
        System.out.println("city.substring(5) = " + city.substring(5));
        System.out.println("city.substring(city.length()-3) = " + city.substring(city.length() - 3));

        //Manchester City
        //   0        1
        //split()
        String[] split = club.split(" ");
        System.out.println("split[1] = " + split[1]);
        //London L nd n
        city = "London";
        String[] split1 = city.split("o");
        System.out.println("Arrays.toString(split1) = " + Arrays.toString(split1));

        //City
        //contains()
        System.out.println("club.contains(\"City\") = " + club.contains("City"));
        System.out.println("city.contains(\"city\") = " + city.contains("city"));

        //Manchester City
        System.out.println("club.toLowerCase() = " + club.toLowerCase());
        System.out.println("club.toLowerCase().contains(\"city\") = " + club.toLowerCase().contains("city"));
        System.out.println(club.contains("city"));
        System.out.println("club.toLowerCase().contains(\"CITY\".toLowerCase()) = " + club.toLowerCase().contains("CITY".toLowerCase()));
        System.out.println("club.contains(\"CITY\") = " + club.contains("CITY"));
        System.out.println(club.toLowerCase().contains("CITY".toLowerCase()));
        System.out.println(club.substring(club.length() - 4).toLowerCase().contains("city"));
//        "Manchester City"
        // 012345678901
        System.out.println("club.indexOf(\"C \") = " + club.indexOf("C"));
        int index = club.indexOf("C");
        System.out.println("club.substring(index) = " + club.substring(index));
        club = "Champion City";
        //      0123456789
        System.out.println("club.indexOf(\"C\") = " + club.indexOf("C"));
        System.out.println("club.lastIndexOf(\"C\") = " + club.lastIndexOf("C"));
        String hi = "Hi Ali Hi and Hi Veli";
        //          01234567890123456789
        //      1      2      3
        System.out.println("hi.indexOf(\"Hi\") = " + hi.indexOf("Hi"));//0
        System.out.println("hi.lastIndexOf(\"Hi\") = " + hi.lastIndexOf("Hi"));//14
        System.out.println("hi.indexOf(\"Hi\",1) = " + hi.indexOf("Hi", 1));
        int indexedOfFirstHi = hi.indexOf("Hi");
        System.out.println("hi.indexOf(\"Hi\",indexedOfFirstHi+1) = " + hi.indexOf("Hi", indexedOfFirstHi + 1));
        club = "Chelsea";
        String club2 = "Arsenal";//String pool
        System.out.println("club.equals(club2) = " + club.equals(club2));
        System.out.println("club.equals(\"Liverpool\") = " + club.equals("Liverpool"));
        System.out.println("club2.equals(\"Arsenal\") = " + club2.equals("Arsenal"));
        // ==   address
        String club3=new String("Arsenal");// not in the string pool
        String club4="Arsenal";//string pool
        System.out.println("club2==club3 = " + (club2 == club3));
        System.out.println("club2==club4 = " + (club2 == club4));

    }
}
