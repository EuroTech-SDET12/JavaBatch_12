package com.days.day12;

public class Switch_1 {
    public static void main(String[] args) {
        int number = 4;
        //number equals 1 ---> print "one"
        //number equals 2 ---> print "two"
        //number equals 3 ---> print "three"
        //number equals 4 ---> print "four"
        //number equals 5 ---> print "five"
        // else "not matched the number"
        if (number == 1) {
            System.out.println("one");
        } else if (number == 2) {
            System.out.println("two");
        } else if (number == 3) {
            System.out.println("three");
        } else if (number == 4) {
            System.out.println("four");
        } else if (number == 5) {
            System.out.println("five");
        } else {
            System.out.println("not matched number.");
        }

        number = 4;
        switch (number) {
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
//                break; last statement block is already over
        }
        System.out.println("out of the switch block.");


        {
            System.out.println("Hi!!");
            System.out.println("hellooo!!");

        }


    }
}
