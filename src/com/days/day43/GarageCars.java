package com.days.day43;

public class GarageCars {
    //you have a garage
    //each car has a brand
    //each car has color, year, km, doorNumber

    static {
        numberOfWholeCars = 1;// i have already a car in my garage
        System.out.println("Garage class started!!!!!");
    }
    {

        System.out.println("Oooo congrat you bought one more!!!!!!!");

    }


    String brand;
    String color;
    int year;
    int km;
    int doorNumber;
    boolean sunroof;
    static int numberOfWholeCars;
    int carNumber;

    GarageCars(String brand, String color, int year, int km, int doorNumber, boolean sunroof) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.km = km;
        this.doorNumber = doorNumber;
        this.sunroof = sunroof;
        numberOfWholeCars++;
        System.out.println("Y w there are " + numberOfWholeCars + " in your garage.");
        carNumber = numberOfWholeCars;
    }


}
