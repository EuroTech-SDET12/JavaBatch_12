package com.days.day43;

public class GarageCarsTest {
    public static void main(String[] args) {
        GarageCars toyota = new GarageCars("Toyota", "Blue", 2020, 9000, 4, false);
//        System.out.println("toyota.color = " + toyota.color);
        GarageCars bmw = new GarageCars("BMW", "Black", 2023, 5000, 2, true);
        GarageCars honda = new GarageCars("Honda", "Red", 2010, 150000, 4, true);
//        //numberOfWholeCars;
        System.out.println("honda.carNumber = " + honda.carNumber);
        System.out.println("toyota.carNumber = " + toyota.carNumber);
        System.out.println("bmw.carNumber = " + bmw.carNumber);
        System.out.println("GarageCars.numberOfWholeCars = " + GarageCars.numberOfWholeCars);
        // static block first executed, only once
        // instance block second executed, whenever you create an object
        // constructor third executed whenever you create an object


    }
}
