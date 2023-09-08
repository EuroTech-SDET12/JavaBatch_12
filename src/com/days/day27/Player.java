package com.days.day27;

public class Player {
    String name;
    int age;
    int trainingCounter;
    String clubName = "Real Madrid";


    public void makeTraining() {
        System.out.println(name + " is training.");
        trainingCounter++;
        // ali is training
        //zidane is training
        // ronaldo is training
    }


    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", trainingCounter=" + trainingCounter +
                ", clubName='" + clubName + '\'' +
                '}';
    }
}