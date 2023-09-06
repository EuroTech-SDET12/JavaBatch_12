package com.days.day25;

import java.util.Random;

public class RandomBetweenBorders {


    public static void main(String[] args) {

        Random random = new Random();
        // what if I want to get random number between 1 and 30 or 10 and 50 !!???

        // generate number between 1 and 5
        System.out.println(random.nextInt(4) + 1);
        // nextInt(HIGH - low ) + low

        // write a code to generate random number between 7(inc) and 11(ex)

        System.out.println("random.nextInt(4) + 7 = " + (random.nextInt(4) + 7));


    }



}










