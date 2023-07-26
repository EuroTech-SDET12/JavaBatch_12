package com.days.day7;

public class ImplicitlyCasting {
    //    implicit Casting - Widening: converting a smaller data type to a larger size data type.
    public static void main(String[] args) {
        //byte-short-int-long-float-double
        // smaller   to   larger size data
        byte byte1 = 50;
        int integer1 = byte1;//implicitly casting
        System.out.println("integer1 = " + integer1);
        long long1 = byte1;
        System.out.println("long1 = " + long1);
        double double1 = integer1;
        System.out.println("double1 = " + double1);


        short short1 = 21;
        double double2 = 5;
        double2 = short1;
        System.out.println("Double = " + double1);

    }
}
