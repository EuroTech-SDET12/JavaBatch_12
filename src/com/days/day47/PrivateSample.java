package com.days.day47;

public class PrivateSample {

    public int number = 100;

    private double taxRate = 0.20;


    public void test() {
        System.out.println("number = " + number);

        System.out.println("taxRate = " + taxRate);
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}
