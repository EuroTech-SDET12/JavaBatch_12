package com.days.day55.game;

public abstract class Player extends Person {

//    Player(String name, int birthYear, char gender, String city, String teamName, String branch) {
    Player(String name, int birthYear, char gender, String city, Teams teamName, String branch) {
        super(name, birthYear, gender, city);
        this.branch = branch;
        this.teamName = teamName;
    }

    String branch;
    Teams teamName;

    public void training() {
        System.out.println(name + " is training with the " + teamName);
    }

    public abstract void playing();

}
