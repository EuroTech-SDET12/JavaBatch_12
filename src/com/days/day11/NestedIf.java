package com.days.day11;

public class NestedIf {


    public static void main(String[] args) {

        boolean gardenKey = true, frontKey = true, backYardKey = false;

        if (gardenKey) { // garden key is true!! if I have the garden key:
            System.out.println("I can access the GARDEN!!! ");

            if (frontKey) {
                System.out.println("I can access the HOUSE!!!");
            }
        } else { // I don't have GARDEN KEY!!

            if (backYardKey) {
                System.out.println("I can access the HOUSE!!!");
            }
        }

    }
}
