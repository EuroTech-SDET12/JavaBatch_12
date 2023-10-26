package com.days.day56;

import com.days.day56.vehicle.Toyota;

public class Driver {

    String name;

    public void drive(Car1 car) {
        System.out.println(name + " is driving honda " + car.model);
    }

//    public void drive(Honda honda) {
//        System.out.println(name + " is driving honda " + honda.model);
//    }
//
//    public void drive(Toyota toyota) {
//        System.out.println(name + " is driving honda " + toyota.model);
//    }
//    public void drive(BMW bmw) {
//        System.out.println(name + " is driving honda " + bmw.model);
//    }
}
