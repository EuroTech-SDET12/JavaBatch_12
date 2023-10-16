package com.days.day50;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Grey");
        cat.moves();//cat is walking
        Rabbit rabbit = new Rabbit("Jumper");
        rabbit.moves();// rabbit is jumping
//        Animal animal = new Animal();  'Animal' is abstract, cannot be instantiated
        //Base
        cat.eating();
        System.out.println("cat.name = " + cat.name);
        cat.isSleeping(10);
        rabbit.isSleeping(8);
    }
}
