package com.days.day41;

public class EncapTest {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
//        encapsulation.var1 = 10;
//        encapsulation.var2 = "Hello";
        System.out.println(" var1 " + encapsulation.getVar1());
        encapsulation.setVar2("Hi");
        System.out.println("encapsulation.getVar2() = " + encapsulation.getVar2());


    }
}
