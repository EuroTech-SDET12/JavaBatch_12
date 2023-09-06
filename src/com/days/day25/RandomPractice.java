package com.days.day25;

import java.util.Random;

public class RandomPractice {

    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt();
        System.out.println("randomNumber = " + randomNumber);

        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        // each time nextInt() will provide a new 'random' number


        // up-bound is exclusive, start point is 0
        System.out.println("randomNumber with boundary = " + random.nextInt(50));
        System.out.println("randomNumber with boundary = " + random.nextInt(100));
        System.out.println("randomNumber with boundary = " + random.nextInt(3));

        // Generate a number between 0.0<= number < 1.0
        System.out.println("random.nextDouble() = " + random.nextDouble());
        System.out.println("random.nextDouble() = " + random.nextDouble());

//      I want to generate double number between  0(inx) - 100(ex) !!
        // 0 - 100 int  +   0<= x < 1
       double randomDouble= random.nextInt(100) + random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);


        System.out.println("random.nextBoolean() = " + random.nextBoolean());
        System.out.println("random.nextBoolean() = " + random.nextBoolean());
    }
}
