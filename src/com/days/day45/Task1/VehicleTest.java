package com.days.day45.Task1;

public class VehicleTest {


    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        Car car1 = new Car();
        System.out.println("car1.lightsOn = " + car1.lightsOn);
        System.out.println("car1.brand = " + car1.brand);

        // NO access to private fields as child/sub-class object!!
//        System.out.println("car1.vehicleID = " + car1.vehicleID);

        Plane plane1 = new Plane();
        System.out.println("plane1.lightsOn = " + plane1.lightsOn);
        plane1.engineType= "TurboShaft";
        System.out.println("plane1.engineType = " + plane1.engineType);
    }
}
