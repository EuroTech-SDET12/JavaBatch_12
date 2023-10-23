package com.days.day55.game;

public abstract class Person {

    String name;
    int birthYear;
    char gender;
    String city;

    Person(String name, int birthYear, char gender, String city) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.city = city;
    }

    public void sleeping() {
        System.out.println(name + " is sleeping.");
    }

    public void eating() {
        System.out.println(name + " is eating.");
    }


    //  sleeping
    //  eating





    // FootballPlayer extend Player
    //  int number
    //  int games;
    //  String position

    // playing
    //


}
