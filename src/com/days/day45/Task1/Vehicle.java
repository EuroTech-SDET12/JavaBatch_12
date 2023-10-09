package com.days.day45.Task1;

public class Vehicle {

    String name;
    double weight;
    double length;
    int seats;
    boolean lightsOn = true;
    private int vehicleID;


    public void start(){
        System.out.println("Start!");
    }

    public void stop(){
        System.out.println("Stop!");
    }

    public void move(){
//        int number;
//        System.out.println("number = " + number);
        System.out.println("Move!");
    }
}
