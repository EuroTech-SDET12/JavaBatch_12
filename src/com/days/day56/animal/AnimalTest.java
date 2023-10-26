package com.days.day56.animal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sounds();
        animal = new Dog();
        animal.sounds();
        animal = new Cat();
        animal.sounds();

        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();

        ArrayList<Animal> listOf = new ArrayList<>();
        listOf.add(cat);
        listOf.add(cat1);
        listOf.add(cat2);
        listOf.add(dog);
        listOf.add(duck);

        List<String> stringList = new ArrayList<>();
        stringList = new LinkedList<>();

    }
}
