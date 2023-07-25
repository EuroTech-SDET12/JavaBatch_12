package com.days.day6;

public class PrecedencePractice {

    public static void main(String[] args) {

        double result = 18 - 10 * 2 + 20 / 2.5;
/*
                      = 18 - 20 + 20 / 2.5
                      = 18 - 20 + 8.0
                      = -2 + 8.0
                      = 6.0
 */
        System.out.println("result = " + result);


        result = (3 / 2 + 3) + 4 * 4 + 5 * (4 + 3 / 1 - 2 * 2) - 1;
        /*     = 4 + 4 * 4 + 5 * (4 + 3 / 1 - 2 * 2) - 1
               = 4 + 4 * 4 + 5 * (4 + 3 - 4) - 1
               = 4 + 4 * 4 + 5 * 3 - 1
               = 4 + 16 + 15 - 1
               = 20 + 15 -1
               = 35 - 1 = 34
               result = 34

         */
        System.out.println("result = " + result); //34.0

        double value = 2;
        System.out.println("value = " + value); //2.0

        value = (3 / 2.0) + (3.0 / 2) + (3.0 / 2.0) + (3 / 2);
        // auto alignment ctrl + alt + L  -- readability
        /*
              = 1.5 + 1.5 + 1.5 + 1
              = 3.0 + 1.5 + 1
              = 4.5 + 1
              = 5.5
         */
        System.out.println("value = " + value); // 5.5
    }
}
