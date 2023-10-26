package com.days.day55;

public class Eagle extends Animal implements IPredator, IWalking {
    @Override
    public void moves() {
        System.out.println("Eagles are flying.");
    }

    @Override
    public void hunt() {
        System.out.println("Eagles are hunting.");
    }

    @Override
    public void hunt(String animal) {
        System.out.println("Eagle hunted " + animal);
    }

    @Override
    public void walking() {
        System.out.println("Eagles walking on the grass.");
    }
}
