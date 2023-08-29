package com.days.day19;

public class Method_3 {

    static void printNameAge(String name, int age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        //Ronaldo is 40 years old.
        //Messi is 35 years old.
        //Faruk is 30 years old.
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        int number;//declaration
        System.out.println("Main Method!!!");
        printNumber(10);
        System.out.println("After method");
        printNumber(20);
        number = 123;
        printNumber(number);
        // printNumber("");required = int but provided= String
        printName("Ali");
        String sonName = "Adil";
        printName(sonName);
        printNameAge("Ronaldo", 40);
        printNameAge("Messi", 35);

        int birthYear = 1990;
        //age=?
        System.out.println(2023 - 1990);
        calculateAge("Ali", birthYear);
        String firstName = "David";
        calculateAge(firstName,1950);
        //getSum of the 2 integer
        //print the number between  ... and .... for loop  printNumbersBetween(int start,int end)


    }
    //Main Method!!!
    //num = 10
    //After method
    //num = 20

    static void printNumber(int num) {
        System.out.println("num = " + num);
    }

    //printName

    static void printName(String name) {
        System.out.println("name = " + name);
    }

    //calculateAge  String name, int birthYear

    //    print age
    static void calculateAge(String name, int birthYear) {
        int age = 2023 - birthYear;
        System.out.println(name + " is " + age + " years old.");
        //                 Ali is 35 years old.
        //                 Veli is 40 years old.
    }

}
