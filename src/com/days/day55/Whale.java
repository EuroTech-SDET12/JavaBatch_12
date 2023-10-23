package com.days.day55;

public class Whale extends Animal implements IPredator {
    @Override
    public void moves() {
        System.out.println("Whales are swimming!!!");
    }

    @Override
    public void hunt() {
        System.out.println("Whales are hunting as a team!!!");
    }

    @Override
    public void hunt(String animal) {
        System.out.println("Whales are hunting " + animal);
    }
}
