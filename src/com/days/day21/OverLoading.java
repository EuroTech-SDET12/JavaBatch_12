package com.days.day21;

public class OverLoading {
    public static void main(String[] args) {
        String name = "Benzema";
        print(50.55);
        print(10);
        print("Ali");
        print(name, 35);
        print(30, name);
        print();

    }
    //create a method print()-->1 parameter String
//   Different ways of Method Overloading
    //1-parameter type is different
    //2-number of parameter is different
    //3-order of the parameters different(By changing the sequence of arguments)

    public static void print(int number) {//signature=name + parameter-s
        System.out.println("number = " + number);
    }

    public static void print(double number) {
        System.out.println(number);
    }

    public static void print(String name) {
        System.out.println(name);
        switch (name) {
        }
    }
//    public static void print(String firstName) {  'print(String)' is already defined in 'com.days.day21.OverLoading'
//    }

    public static void print(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void print(int age, String name) {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void print() {
        System.out.println("Hello!!!!");
    }

    public static void print(byte b) {
        System.out.println("Hello!!!!");
    }

//    int print() { print()' is already defined in 'com.days.day21.OverLoading'
//        System.out.println("Hello!!!!");
//        return 2;
//    }


}
