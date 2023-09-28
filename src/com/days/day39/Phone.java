package com.days.day39;

public class Phone {

    private String model;
    private int serialNumber;
    private boolean isRegister;
    private double price;
    private String colour;
    private int size;
    static public int count;

    //GETTERS
    public String getModel() {
        return model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public boolean isRegister() {
        return isRegister;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getSize() {
        return size;
    }

    //SETTERS

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setRegister(boolean register) {
        isRegister = register;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
