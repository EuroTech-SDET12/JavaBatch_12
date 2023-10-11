package com.days.day47.ProtectedTest;

import com.days.day47.ProtectedData.ProtectedSample;

public class PTest extends ProtectedSample {

    public static void main(String[] args) {
        // Create an object from parent
        ProtectedSample obj1 = new ProtectedSample();
        System.out.println("obj1.publicNum = " + obj1.publicNum);
    //    System.out.println("obj1.privateNum = " + obj1.privateNum);
    //    System.out.println("obj1.defaultNum = " + obj1.defaultNum);
//        System.out.println("obj1.protectedNum = " + obj1.protectedNum);
// there is no inheritance yet!! let create inherit connection!!

        // Create an object from child class!!
        PTest obj2 = new PTest();
        System.out.println("obj2.publicNum = " + obj2.publicNum);
//        System.out.println("obj2.privateNum = " + obj2.privateNum);
//        System.out.println("obj2.defaultNum = " + obj2.defaultNum);
        System.out.println("obj2.protectedNum = " + obj2.protectedNum);
    }
}
