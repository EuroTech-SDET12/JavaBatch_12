package com.days.day40;

public class SkyTest {

    public static void main(String[] args) {

        Sky sky1= new Sky();

        System.out.println("sky1.weather = " + sky1.weather);

//        System.out.println(this.weather);

        Sky sky2= new Sky("test");
    }
}
