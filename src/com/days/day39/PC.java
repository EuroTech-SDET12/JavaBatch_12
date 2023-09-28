package com.days.day39;

public class PC {

    String model;
    private double price;
    private int ramSize;
    private String OS;
    char label = 'A';


    /* TASK
    1- User can only create an object with /model name\ or /modelName and price\ or /modelName and label\
    2- if user did not provide any label, the default label for each object is 'A'
    3- price, OS and ramSize should not able to directly change or access via objects!
    4- price cannot be negative
    5- OS can be only Windows, Mac or Linux.
    Please create a PC test class and create some sample objects!!!
     */

    // Const \\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public PC(String model) {
        this.model = model;
    }

    public PC(String model, double price) {
        this.model = model;
        setPrice(price);
    }

    public PC(String model, char label) {
        this.model = model;
        this.label = label;
    }

    //GETTER \\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public double getPrice() {
        return price;
    }
    public int getRamSize() {
        return ramSize;
    }
    public String getOS() {
        return OS;
    }

    //SETTER \\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void setPrice(double price) {
        if(price>=0){
            this.price = price;
        } else{
            System.out.println("Negative invalid value!");
        }

    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    public void setOS(String OS) {
        OS= OS.toUpperCase();
        if(OS.equals("WINDOWS") ||OS.equals("MAC") || OS.equals("LINUX")   ) {
            this.OS = OS;
        }else{
            System.out.println("INVALID OS!!!");
        }
    }
}
