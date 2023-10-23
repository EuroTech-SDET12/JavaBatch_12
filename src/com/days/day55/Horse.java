package com.days.day55;

public class Horse extends Animal {
    Horse() {

    }

    Horse(String name) {
        super(name);
    }


    @Override
    public void moves() {
        System.out.println("Horses are walking and running!!!!");
    }
}
