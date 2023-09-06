package com.days.day25;

import java.util.Random;

public class RandomOddNumberGenerator {


    public static void main(String[] args) {
        System.out.println("Random odd number between given values = " + generateOddNumberForGivenValues(50, 100));
    }



    public static int generateOddNumberForGivenValues(int low, int high){

        Random random = new Random();
        int returnNum=0;
        do {
            returnNum  = random.nextInt(high - low) + low;
           // System.out.println("returnNum = " + returnNum);

        }while (returnNum%2 == 0); // if it is even number
        // cond will be true and go inside the loop!!
        // if cond is false, loop will end and will return value
        return returnNum;
    }
}
