package com.days.day6;

public class UnaryOptPractice {

    public static void main(String[] args) {

        // Unary plus and minus operator
        int result = +4 + -4;  //4 - 4 not same for opt
        System.out.println("result = " + result);


        // Unary Increment and Decrement opt  a++  a--
        int number = 4;
        System.out.println("number = " + number); //4
        number++;   // number = number + 1 ;
        System.out.println("number = " + number); //5

        number = 11;
        System.out.println("number = " + number); //11
        number--;
        System.out.println("number = " + number); //10

        // Logical complement operator ! use only with boolean!!
        boolean isActive = true;
        System.out.println("isActive = " + isActive); // true
        System.out.println("!isActive = " + !isActive); // false
        System.out.println("isActive = " + isActive); // true


        //////////////////

        int a = 3;

        int b = a++;  // POST INCREMENTATION: get a use it, THEN increment it!!!
        System.out.println("a = " + a);  // 4
        System.out.println("b = " + b);  // 3

        //
        a = 3;
        b = ++a; // PRE INCREMENTATION: First INCREMENT a, THEN use it!!!

        System.out.println("a = " + a);  // 4
        System.out.println("b = " + b);  // 4


        /////////////////////

        int num1 = 5, // 7
            num2 = 3; // 2

        double expression1 = (num1++ - --num2) + num1++;
        //                 = (5 - 2) + 6;
        System.out.println("expression1 = " + expression1); // =9

        num1 = 5; // 6 , 5
        num2 = 3; // 4 , 5
        double expression2 = ++num1 - (num1-- * num2++) * num2++;
/*
                           =  6 - ( 6 * 3 ) * 4
                           =  6 - 18 * 4
                           =  6 - 72  = -66
 */
        System.out.println("num1 = " + num1); // 5
        System.out.println("num2 = " + num2); // 5
        System.out.println("expression2 = " + expression2);


        // TASK -5
        int n1 = 5; //
        int n2 = 3; //
        double expression3 = --n1 / ++n2 - (n1 * n2++) * --n1 + ++n2;

        // TODO : Write step by step solution for given exp and
        //        calculate n1 and n2 final value
        System.out.println("expression3 = " + expression3);

    }
}
