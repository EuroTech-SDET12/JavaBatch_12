package com.days.day19;

public class Methods {


    public static void main(String[] args) {
        System.out.println("Hello Ali!!!!");
        int result = 5 + 3;
        System.out.println(result);
        System.out.println("Hello Ali!!!");
        result = 5 + 6;
        System.out.println("result = " + result);
        System.out.println("Write sthng....");
        result = 10 + 15;
        System.out.println("result = " + result);
        System.out.println("Before Calling Print Method!!!!");
        print();
        System.out.println("After print method!!!!");
        printMyName();
        printMyName();
        printMyName();
        myInfo();
        myInfo();
    }

    //1-->access  modifier
    //2--->return type   void--> returns nothing
    //3--->name of the method
    //4---->paranthesis(inside it parameters)
    //5--> method body-block
    // 1           2    3   4
    // 3+4--->method signature
    public static void print() {//header
        System.out.println("Hello Methods!!!");
//        5
    }

    //Before Calling Print Method!!!!"
    //Hello Methods!!!
    //After print method!!!!
    public static void printMyName() {
        System.out.println("Hello, I'm Ali!!!!");
        System.out.println("How are you?");
    }

    // myInfo
    // name
    // country city
     static void myInfo() {
         System.out.println("Hello, I'm Ali!!!!");
         System.out.println("I'm from Turkey.");
         System.out.println("I'm 25 years old.");
         System.out.println("I'm learning Java!!!!!");
    }


}
