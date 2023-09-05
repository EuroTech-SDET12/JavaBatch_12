package com.days.day24;

import java.util.Scanner;

public class NextPractice {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        // INPUT:  key1:"Java", key2: "is", key3:"awesome!!"

        System.out.println("Please enter ALL keys with space separator");
        //   System.out.println("Please enter key 1:");
        // whenever see the space, it stops to store the value!!!
        String key1 = scanner.next();

     //   System.out.println("Please enter key 2:");
        String key2 = scanner.next();


     //   System.out.println("Please enter key 3:");
        String key3 = scanner.next();

        System.out.println("keys = " + key1 + " " + key2 + " "+ key3);
        System.out.println("key1 = " + key1);
        System.out.println("key2 = " + key2);
        System.out.println("key3 = " + key3);


    }

}
