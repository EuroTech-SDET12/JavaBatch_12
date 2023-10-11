package com.days.day47;

public class AccessTest extends PrivateSample {


    public static void main(String[] args) {
       // how can I access PrivateSample class fields!?
        // Create an object:
        PrivateSample obj1 = new PrivateSample();
        System.out.println("obj1.number = " + obj1.number);
        obj1.test();
//        System.out.println("obj1.taxRate = " + obj1.taxRate);
        System.out.println("obj1.getTaxRate() = " + obj1.getTaxRate());

        // or create an inheritance
        AccessTest obj2 = new AccessTest();
        System.out.println("obj2.number = " + obj2.number);
        obj2.test();
//        System.out.println("obj2.taxRate = " + obj2.taxRate);
        System.out.println("obj2.getTaxRate() = " + obj2.getTaxRate());

    }
}
