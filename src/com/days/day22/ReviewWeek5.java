package com.days.day22;

public class ReviewWeek5 {

    public static void main(String[] args) {
        System.out.println("Beginning of Main method");
        int test1 = 10;
        System.out.println(test1);

        test1();

        System.out.println("End of Main method");


        int number;

      //  System.out.println(number);

        String text = "Hello Batch 12";
//        System.out.println(text);
        printText(text);

        System.out.println(1/0);
    }

    public static void test1(){
        System.out.println("Test1");
    }


    public static void printText (String text){
        System.out.println(text);
    }


}
