package com.days.day50;

public class Rabbit extends Animal{


    Rabbit(String name) {
        super(name);
    }

    @Override
    public void moves() {
        System.out.println("Rabbits are jumping.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Rabbits says hrrrrr");
    }

    @Override
    public void isSleeping(int hour) {
        System.out.println("Rabbits sleeping "+hour+" underground.");
    }
}
