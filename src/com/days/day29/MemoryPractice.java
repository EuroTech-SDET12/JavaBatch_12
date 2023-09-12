package com.days.day29;

public class MemoryPractice {

    static int bigNumber = 1000; //class variable
    int check = 2; // instance variable

    public static void main(String[] args) {
        int number = 1;  //local variable
        System.out.println("number = " + number);
        System.out.println("bigNumber = " + bigNumber);

        if (number == 1) {
            int testValue = 4; //local variable
            System.out.println("testValue = " + testValue);
        }
        test1();
        test2();
    }

    public static void test1() {
        int test1Num = 2; //local variable
        System.out.println(test1Num);
        if (test1Num == 2) {
            int test1 = 0; //local variable
        }

    }

    public static void test2() {
        for (int i = 1; i <= 3; i++) {  // i local variable !!
            System.out.println("Hi");
        }
    }


}
