package com.days.day23;

public class MobilePhone {

    String model;
    int serialNumber;
    int ramSize;
    int memory;
    boolean isResistanceToWater;

    static int phoneCount;

    public void call(){
        System.out.println("Calling");
    }

    public void sendMessage(){
        System.out.println("Message send");
    }

    // right click-> generate -> toString-> choose all fields

    @Override
    public String toString() {
        return "MobilePhone{" +
                "\n model='" + model + '\'' +
                ",\n serialNumber=" + serialNumber +
                ",\n ramSize=" + ramSize +
                ",\n memory=" + memory +
                ",\n isResistanceToWater=" + isResistanceToWater +
                '}';
    }
}
