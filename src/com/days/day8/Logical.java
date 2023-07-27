package com.days.day8;

public class Logical {
    public static void main(String[] args) {
        //  weekend && sunny  ----> will go to picnic  -->true
        // weekday && sunny  ----> false
        //weekend(sunday)&&rainy ---> false
        // tuesday&&rainy ---> false
        System.out.println(10 > 5 && 10 > 9);
        //                   true &&   true  ----> true
        System.out.println(10 > 5 && 10 > 20);
        //                  true  &&   false -----> false
        System.out.println(10 > 20 & 10 > 5);
        //                  false && true  --->  true
        System.out.println(10 > 20 && 10 > 50);
        //                  false  && false ----> false
        boolean b = 10 > 20 && 10 > 50;
        System.out.println("b = " + b);

        //number is greater then 0   and number %2==0  this number is even number
        int var = 20;
        boolean isEvenNumber = var > 0 && var % 2 == 0;
        System.out.println("isEvenNumber = " + isEvenNumber);
//        boolean isOddNumber = var > 0 && var % 2 == 1;
        boolean isOddNumber = var > 0 && var % 2 != 0;
        System.out.println("isOddNumber = " + isOddNumber);
        System.out.println(isEvenNumber != isOddNumber);//true

        //   ||

        // cash || card
        // true || true --> true
        // false|| true --> true
        // true || false--> true
        // false|| false--> false

        System.out.println(10 > 5 || 10 > 6);//---->true
        System.out.println(10 > 5 || 10 > 60);//---->true
        System.out.println(10 > 50 || 10 > 6);//---->true
        System.out.println(10 > 50 || 10 > 20);//---->false
        //today is saturday
        boolean isSaturday = true;
        boolean isSunday = false;
        boolean isWeekend = isSaturday || isSunday;
        System.out.println("isWeekend = " + isWeekend);

        int var2 = 20;
        int var3 = 30;
        int var4 = 10;
        //var3 with other 2 variable
        // check whether var3 is the largest value or not
        boolean isVar3Largest = var3 > var2 && var3 > var4;// if the result is true var3 is the largest value
        System.out.println("isVar3Largest = " + isVar3Largest);

        // ! not operator
        boolean result = true;
        System.out.println(!result);
        isWeekend = true;
        boolean weekday = !isWeekend;//if the day is not weekend the day is weekday
        System.out.println("weekday = " + weekday);
        isWeekend = false;
        weekday = !isWeekend;
        System.out.println(weekday);

        // number%2==0  ---> even number
        var = 21;
        isEvenNumber = var % 2 == 0;
        boolean isOddNUmber = !isEvenNumber;
        System.out.println("isEvenNumber = " + isEvenNumber);//false
        System.out.println("isOddNUmber = " + isOddNUmber);//true


        var = 10;
        var2 = 20;
        var3 = 30;
        System.out.println(var > var2 && var3 > var);
        //                   false     &&
        var = 10;
        System.out.println(var3 > var2 && var3 > ++var);
        //                     true          true
        System.out.println("var = " + var);//11
        var = 10;
        System.out.println(var > var2 && var3 > ++var);
        //                    false   &&
        System.out.println("var = " + var);//10


        var = 10;
        System.out.println(var > var2 & var3 > ++var);
        //                    false   &&
        System.out.println("var = " + var);//11


        var = 10;
        var2 = 20;
        var3 = 30;
        System.out.println(var3 > var2 || var3 > ++var);
        //                   true
        System.out.println("var = " + var);


        var = 10;
        var2 = 20;
        var3 = 30;
        System.out.println(var > var2 || var3 > ++var);
        //                   false
        System.out.println("var = " + var);

    }
}
