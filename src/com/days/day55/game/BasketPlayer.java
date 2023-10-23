package com.days.day55.game;

public class BasketPlayer extends Player {

    String arenaName="Sequare Garden";

    BasketPlayer(String name, int birthYear, char gender, String city, Teams teamName, String branch) {
        super(name, birthYear, gender, city, teamName, branch);
    }

    public void training() {
        System.out.println(name + " is training with the " + teamName + " in the saloon " + arenaName);
    }

    @Override
    public void playing() {
        System.out.println(name + " is playing basketball.");
    }
}
