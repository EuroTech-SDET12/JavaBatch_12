package com.days.day5;

public class ConcatenationSample {

    public static void main(String[] args) {

        System.out.println("Hello Java");

        System.out.println("Hello "+"Java");

        System.out.println("Hello" + 5);

        System.out.println(3 + " Kids");

        System.out.println("Java "+ "is "+"sooo "+ "cool!!");

        System.out.println(1 + 3 + " tables"); // "4 tables"

        System.out.println("The total table number is " + 1 + 3);
        // "The total table number is 1" + 3
        // "The total table number is 13"

        System.out.println("The total table number is " + (1 + 3));
        // "The total table number is " + 4
        // "The total table number is 4"

        /////////////////////////

        String name = "Emre";
        double salary = 55100.50;

        // Target output:  Emre's salary is 55100.50

        System.out.println(name + "'s salary is " + salary);
        /////////////////////////

        int a = 2;

        int b = a + 1; // 3
     }
}
