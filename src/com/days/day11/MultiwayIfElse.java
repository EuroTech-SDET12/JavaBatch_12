package com.days.day11;

public class MultiwayIfElse {

    public static void main(String[] args) {

        // if number bigger than 0 -> positive
        // if number less  than 0 -> negative
        // if number equal to 0 -> zero

        int number = 10;
        // OPTION -1
        if (number > 0) {
            System.out.println("Number " + number + " is POSITIVE!!");
        } else if (number == 0) {
            System.out.println("Number " + number + " is ZERO!!");
        } else {  //  number < 0)
            System.out.println("Number " + number + " is NEGATIVE!!");
        }

        ////////////
        // OPTION -2
        if (number > 0) {
            System.out.println("Number " + number + " is POSITIVE!!");
        }
        if (number == 0) {
            System.out.println("Number " + number + " is ZERO!!");
        }
        if (number < 0){
            System.out.println("Number " + number + " is NEGATIVE!!");
        }
    }
}
