package com.days.day16;

public class WhileLoop {
    public static void main(String[] args) {
        // variable , condition , increment/decrement, block
        //    +          +                +               +
        int number = 0;
        while (number < 3) {// 0<3-->true, 1<3 --> true , 2<3 -->true, 3<3-->false
            System.out.println("number = " + number);// print 0, 1 , 2
            number++;//1 2 3
        }
        System.out.println("out of the block!!!!");
        System.out.println("number = " + number);
        System.out.println("===============");
        number = 5;
        // 5 4 3 2 1

        while (number > 0) {
            System.out.println(number);
            number--;
        }

        number = 123;

        System.out.println("number%10 = " + number % 10);
        number = number / 10;
        System.out.println("number = " + number);
        System.out.println("number%10 = " + number % 10);
        number = number / 10;
        System.out.println("number%10 = " + number % 10);


        System.out.println("number/10 = " + number / 10);
        System.out.println("=================");
        number = 123456789;
        while (number > 0) {
            System.out.println("number%10 = " + number % 10);
            number = number / 10;
        }
        System.out.println("===========================");
        System.out.println("For Loop!!!!");
        long number1 = 987654321023l;
        for (int i = 0; i < 9; i++) {//will not print the first 3 digit
            System.out.println("number%10 = " + number1 % 10);
            number1 = number1 / 10;
        }

        // reverse the number
        //  654321  ====> 123456


    }
}
