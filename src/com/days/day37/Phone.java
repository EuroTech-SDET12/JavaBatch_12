package com.days.day37;

public class Phone {

    int serialNumber;
    int size;
    String model;

    public Phone(){
        serialNumber = 1000;
        size= 4;
        model= "ProXmax";
    }

    public static void main(String[] args) {

        Phone obj1 = new Phone();

        System.out.println("obj1.model = " + obj1.model);
        System.out.println("obj1.serialNumber = " + obj1.serialNumber);
    }

}
