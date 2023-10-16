package com.days.day50;

public abstract class Animal {
    String name;
    String color;

    Animal(String name) {
        this.name = name;
    }

    public abstract void moves();

    public void eating() {
        System.out.println(name + " is eating.");
    }

    //makeNoise abstract implement in the child classes
    public abstract void makeNoise();

    public abstract void isSleeping(int hour);

}
