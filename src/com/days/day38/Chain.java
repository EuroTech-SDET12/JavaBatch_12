package com.days.day38;

public class Chain {
    int number;
    String name;
    boolean result;

    public Chain(){
      // this(100);
      //  this(101,"Henry");
      //  this(102,"James",true);
        System.out.println("NO ARG CONSTRUCTOR!!");
    }
    public Chain(int number) {
        this(); // call no arg cons!!
        this.number = number;
        System.out.println("CONS WITH NUMBER!!!");
    }

    public Chain(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Chain(int number, String name, boolean result) {
        this.number = number;
        this.name = name;
        this.result = result;
    }
}
