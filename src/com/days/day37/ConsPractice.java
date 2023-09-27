package com.days.day37;

public class ConsPractice {

    int number ;

    // Rules for Declare Constructor!!
    // 1- There is no RETURN TYPE
    // 2- Constructor Method name must be same with CLASS name
    public ConsPractice(){
        System.out.println("!!Constructor!!");
    }

    public static void main(String[] args) {

        ConsPractice obj1 = new ConsPractice();
        System.out.println("obj1.number = " + obj1.number);
    }
}
