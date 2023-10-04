package com.days.day42;

public class TestStaticMethods {

    public static void main(String[] args) {

        StaticMethods.staticTest();

        StaticMethods obj1 = new StaticMethods();
        System.out.println("obj1.number = " + obj1.number);
        obj1.nonStatic();
    }
}
