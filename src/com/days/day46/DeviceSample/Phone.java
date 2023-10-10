package com.days.day46.DeviceSample;

public class Phone extends Device {

    public String name="Iphone";
    public int id;
    public int phoneSerial;

    public void formatToPhone(){
        System.out.println("Formatting");
    }
    public void test(String name){
        System.out.println(name); // Local variable
        // Sub class Instance variable
        System.out.println("this.name = " + this.name);
        // Parent class Instance variable
        System.out.println("super.name = " + super.name);
    }

    public void updateDeviceName(String name){
        super.name= name;
        super.reset();
    }

}
