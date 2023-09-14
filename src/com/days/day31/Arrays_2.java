package com.days.day31;

import java.util.Arrays;

public class Arrays_2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 5, 15, 3, 1};
//        for (int i = 4; i < numbers.length; i++) {
//            System.out.println("number[i] = " + numbers[i]);
//        }
        //for each loop
        for (int number : numbers) {
            System.out.println("number = " + number);
        }
        String[] clubs = {"Real Madrid", "Bayern Munich", "Hertha Berlin", "Sporting Lisbon"};
        for (String club : clubs) {
            System.out.println("club = " + club);
        }
        //Madrid Munich Berlin Lisbon
        String cityClub = "Sporting Lisbon is a club from Portugal.";
        //
        //                 Sporting
        //                 Lisbon
        //                  is
        //                   a
        //                  club
        //                  from
        //                 Portugal.

        String[] lisbon = cityClub.split(" ");
        System.out.println("lisbon.length = " + lisbon.length);
        System.out.println("Arrays.toString(lisbon) = " + Arrays.toString(lisbon));
        String str = "Hello1Arrays1Java1!!";
        //           Hello
        //           Arrays
        //           Java
        //           !!
        String[] split = str.split("1");
        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));

//        str = "Sporting Lisbon";// Lisbon
        str = "Hertha Berlin";// Berlin
        String[] split1 = str.split(" ");
        System.out.println("split1[1] = " + split1[1]);
        System.out.println("str.split(\" \")[1] = " + str.split(" ")[1]);


    }
}
