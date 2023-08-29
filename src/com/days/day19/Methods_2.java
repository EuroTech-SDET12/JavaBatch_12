package com.days.day19;

public class Methods_2 {
    public static void main(String[] args) {
        System.out.println("At the beginning of the main method!!!!");
        createdMethod();
        System.out.println("back to the main method!!!");
        secondMethod();
        System.out.println("Again main method!!!!");

    }
    //At the beginning of the main method!!!!
    //method executed!!!!
    //back to the main method!!!

    static void createdMethod() {
        System.out.println("method executed!!!!");
    }

    static void secondMethod() {
        System.out.println("Second method!!!!");
    }


}
