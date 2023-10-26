package com.days.day55;

public class Lion extends Animal implements IPredator {


    @Override
    public void moves() {
        System.out.println("Lions are walking!!!!");
    }

    @Override
    public void hunt() {
        System.out.println("Lions are hunting alone or as a team.");
    }

    @Override
    public void hunt(String animal) {
        System.out.println("Lion hunted " + animal);
    }
}
