package com.days.day53;

public class ThrowSample {

    public static void main(String[] args)  {

        System.out.println("Start");


      // throw new ArrayIndexOutOfBoundsException();
        throw new ArithmeticException("THIS IS MY MESSAGE TO the PERSON WHO" +
                "DID NOT ATTEND GROUP STUDY!!! ");

// Unreachable code!!
//        System.out.println("END");
    }
}
