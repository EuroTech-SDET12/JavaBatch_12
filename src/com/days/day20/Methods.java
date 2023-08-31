package com.days.day20;

public class Methods {

    public static void main(String[] args) {
        System.out.println("Main method!");
        printNumber();
        System.out.println("Still in the main method!!!");
        printName("Ali");
        String firstName = "Veli";
        printName(firstName);
        printNameAge("Ronaldo", 35);
        System.out.println("end of main method!!!!");
    }

    static void printNumber() {
        System.out.println(10);
    }

    static void printName(String name) {
        System.out.println("name = " + name);
    }

    static void printNameAge(String name, int age) {
        printName(name);
        System.out.println("age = " + age);
    }


}
