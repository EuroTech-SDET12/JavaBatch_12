package com.days.day10;

public class ifStatement {

    public static void main(String[] args) {

        int number = -1;

        System.out.println("Before IF");
        if (number < 0){  // if the number is negative   // { }  this is create a code block!!
           // we can only access this block , if the condition is TRUE!!!
            System.out.println("The number "+ number+" is negative !!");            // Statement: The number is NEGATIVE!!!
        }
        System.out.println("After IF");


        boolean control = false;
        if (control){
            System.out.println("A -Line1"); // ctrl+ D copy-paste the line
            System.out.println("A -Line2");
        }

        if (control)
            System.out.println("B -Line1"); // only (the first line)this line  belongs to the if condition !!!
            System.out.println("B -Line2");





    }
}
