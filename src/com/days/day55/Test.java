package com.days.day55;

public class Test {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
//        Animal animal = new Animal();'Animal' is abstract; cannot be instantiated
        Horse horse = new Horse("Black Wind");
        Horse horse1 = new Horse();
        System.out.println("horse.name = " + horse.name);
        lion.hunt();
//        IPredator iPredator = new IPredator(); 'IPredator' is abstract cannot be instantiated
        IPredator.observing();
        System.out.println("IPredator.forest = " + IPredator.forest);
//        IPredator.forest = "";Cannot assign a value to final variable 'forest
        System.out.println("IData.city = " + IData.city);

    }
}
