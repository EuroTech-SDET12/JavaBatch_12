package com.days.day21;

public class HelloName {
//    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".//
//
//    helloName("Bob") → "Hello Bob!"
//    helloName("Alice") → "Hello Alice!"
//    helloName("X") → "Hello X!"

    public static void main(String[] args) {
        String str = helloName("Ali");
        System.out.println("str = " + str);
    }

    public static String helloName(String name) {
        String str = "Hello " + name + "!";
        return str;
    }


}
