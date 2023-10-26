package com.days.day56.vehicle;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "BMW";
        car.moving();
        Plane plane = new Plane();
        plane.moving();
        Vehicle vehicle = new Car();
        Vehicle vehicle2 = new Plane();
        Ship ship = new Ship();
        Vehicle vehicle1 = new Ship();

        new Vehicle().moving();
        vehicle=new Car();
        vehicle.moving();
        vehicle=new Ship();
        vehicle.moving();
        vehicle=new Plane();
        vehicle.moving();




    }
}
