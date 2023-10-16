package com.days.day50;

public class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    public void moves() {
        System.out.println("Cats walking, sometimes running.");
    }

    public void makeNoise() {
        System.out.println("Cats meow");
    }

    public void isSleeping(int hour) {
        System.out.println("Cats are sleeping "+hour+"  hours in a day");
    }

}
