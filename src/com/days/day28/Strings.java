package com.days.day28;

public class Strings {
    public static void main(String[] args) {
        // name  --> literal  name==firstName   name==var1
        // firstName  -->new  firstName==var2
        // var1 -->literal var1==var2
        // var2 -->new

        String name = "Michael";
        String firstName = new String("Michael");
        String var1 = "Michael";
        String var2 = new String("Michael");

        System.out.println(name == firstName);//false
        System.out.println(name == var1);//true
        System.out.println(firstName == var2);//false
        System.out.println(var1 == var2);//false
        String myName = name;
        System.out.println(myName);
        System.out.println(name);
        System.out.println(name == myName);// they point same area in the memory/heap/string pool
        name = "Zidane";
        System.out.println("myName = " + myName);//Michael
        System.out.println("name = " + name);//Zidane

        printName(name);

        System.out.println("name = " + name);


    }

    //print method
    // 1 name
    // print that name
    public static void printName(String name) {
        name = "Messi";
        System.out.println("name = " + name);
    }
}
