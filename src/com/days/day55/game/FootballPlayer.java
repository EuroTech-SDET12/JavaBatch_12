package com.days.day55.game;

public class FootballPlayer extends Player implements IAttack {
    FootballPlayer(String name, int birthYear, char gender, String city, Teams teamName, String branch) {
        super(name, birthYear, gender, city, teamName, branch);
    }

    @Override
    public void playing() {
        System.out.println("Playing football.");
    }

    int games;
    int jerseyNumber;
    String position;


    @Override
    public void attack() {
        System.out.println(name + " is attacking to score goal.");
    }
}
