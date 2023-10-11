package com.days.day47;

public class DefaultSamePackTest extends DefaultSample {

    public static void main(String[] args) {

        // Create an object
        DefaultSample obj1 = new DefaultSample();
        System.out.println("obj1.defaultNum = " + obj1.defaultNum);
        System.out.println("obj1.publicNum = " + obj1.publicNum);
        obj1.publicMethod();
        obj1.defaultMethod();

        // via inheritance
        DefaultSamePackTest obj2 = new DefaultSamePackTest();
        System.out.println("obj2.publicNum = " + obj2.publicNum);
        System.out.println("obj2.defaultNum = " + obj2.defaultNum);
        obj2.defaultMethod();
        obj2.publicMethod();

    }
}
