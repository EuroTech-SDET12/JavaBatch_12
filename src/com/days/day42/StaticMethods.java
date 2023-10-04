package com.days.day42;

public class StaticMethods {

    int number;  // INSTANCE FIELD - Instance variable
    static int count; // STATIC FIELD - Class variable

    public static void main(String[] args) {
//        System.out.println("number = " + number); CAN NOT CALL/ACCESS NON STATIC FIELDS!!!!
//        nonStatic(); CAN NOT CALL/ACCESS NON-STATIC METHODS in STATIC METHODS!!!

        System.out.println("count = " + count);
        staticTest();

    }

    public static void staticTest() {
        System.out.println("staticTest");
//        System.out.println("number = " + number); //CAN NOT CALL/ACCESS NON STATIC FIELDS!!!!
//        nonStatic(); CAN NOT CALL/ACCESS NON-STATIC METHODS in STATIC METHODS!!!
    }

    public void nonStatic() { // instance method
        System.out.println("Non static");
        System.out.println("number = " + number);
        System.out.println("count = " + count);
        staticTest();
    }
}
