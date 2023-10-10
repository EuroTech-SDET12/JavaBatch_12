package com.days.day46.AnimalPractice;

public class Cat extends Animal {

    String catType;
    double thrumLevel;

    public Cat(String owner) {
        super(owner);
        System.out.println("Cat constructor is running!!");
    }

    public void meow(){
        System.out.println("Meow!!");
    }
}
