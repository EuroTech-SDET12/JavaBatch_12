package com.days.day61;

public class FamilyTest {
    public static void main(String[] args) {
        Vehicle fatherVehicle = new Vehicle();
        fatherVehicle.personalCar = "Opel";
        Vehicle motherCar = new Vehicle();
        motherCar.personalCar = "Audi";
        Vehicle childCar = new Vehicle();
        childCar.personalCar = "BMW";
        Vehicle childCar2 = new Vehicle();
        childCar2.personalCar = "Honda";
        System.out.println("Vehicle.familyBus = " + Vehicle.familyBus);
//50+30 80 20 -->100 +40=140
        System.out.println("motherCar.personalCar = " + motherCar.personalCar);

    }
}
