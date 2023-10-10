package com.days.day46.AnimalPractice;

public class Dog extends Animal {

    String dogType;
    double barkLevel;

    public Dog() {
        super();
        System.out.println("Dog constructor is running!!");
    }

    public void bark() {
        System.out.println("Woof!!!");
    }
}
