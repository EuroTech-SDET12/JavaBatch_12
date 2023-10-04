package com.days.day42;

public class MainTest {

    public static void main(String[] args) {
        Test1 obj1 = new Test1(100);
        System.out.println("obj1.number1 = " + obj1.number1);


        Test2 obj2 = new Test2(111);
        System.out.println("obj2.number2 = " + obj2.number2);
        System.out.println("Test2.value2 = " + Test2.value2);
    }
}
