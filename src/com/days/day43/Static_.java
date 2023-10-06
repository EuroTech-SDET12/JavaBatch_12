package com.days.day43;

public class Static_ {
    static final String continent = "Europe";
    String country;

    public static void main(String[] args) {
        int number = 10;
//        static int digit = 50; in any method you cant create static variable
        Static_ static_1 = new Static_();
        static_1.country = "Germany";
        Static_ static_2 = new Static_();
        static_1.country = "Turkey";
        Static_.print();

    }

    public void write() {
        print();
    }


    public static void print() {
//        static String name = "Ali";
        System.out.println("continent = " + continent);
        //can access a statgic variable inside instance method
//        System.out.println(country);Non-static field 'country' cannot be referenced from a static context
    }
}
