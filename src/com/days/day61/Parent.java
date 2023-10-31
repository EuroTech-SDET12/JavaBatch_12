package com.days.day61;

public class Parent {

    public int number = 10;       //instance variable
    final public int VALUE = 11;  //constant variable
    public static int count = 12; //Global variable

    { // instance block
        System.out.println("!! Instance block on the way !!");
    }

    static {
        System.out.println("!!!! STATIC block on the way !!!!");
    }

    public void test(){
        System.out.println("Test method");
    }

    public Parent(int numberParam) { //parameterize constructor
        System.out.println("Constructor is on the way!!!!!!!!!!");
        this.number = numberParam;
    }
}
