package com.days.day21;

public class Multiple3 {
    //  Return true if the given non-negative number is a multiple of 3

//    multiple3();//1 parameter, check number is multiple of 3 or not , if multiple of 3  return true else return false

    public static void main(String[] args) {
        System.out.println(multiple3(13));
        System.out.println("main method!!!");
    }

    public static boolean multiple3(int number) {
        // solution 1
//        if (number % 3 == 0) {
//            return true;
//        } else {
//            return false;
//        }

//         solution 2
//        boolean result = true;
//        if (number % 3 == 0) {
//
//        } else {
//            result = false;
//        }
//        return result;

        //         solution 3
//        boolean result = number % 3 == 0 ? true : false;
//        return result;

        //         solution 3

        return number % 3 == 0;
    }
}
