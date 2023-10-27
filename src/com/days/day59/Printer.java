package com.days.day59;

public class Printer<anything> {


    anything thingToPrint;

    Printer(anything str) {
        thingToPrint = str;
    }

    public void print() {
        System.out.println("thingToPrint = " + thingToPrint);
    }


}
