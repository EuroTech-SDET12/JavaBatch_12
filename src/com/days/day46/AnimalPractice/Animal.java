package com.days.day46.AnimalPractice;

public class Animal {

    public boolean isAPet = true;
    public String owner;

    public Animal(String owner) {
        this.owner= owner;
        System.out.println("Animal constructor is running!!!");
    }

    public Animal(){
        System.out.println("Animal DEFAULT constructor is running!!!");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }

    public void eat(){
        System.out.println("Eating!!");
    }
}
