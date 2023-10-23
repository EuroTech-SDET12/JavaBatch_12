package com.days.day55;

import java.io.StringReader;

public abstract class Animal {
    String color;
    String name;

    Animal() {

    }

    Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal is eating.");
    }

    public abstract void moves();


}