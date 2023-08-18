package com.days.day13;

public class NestedTernary_2 {
    public static void main(String[] args) {
        int age = 20;
        int weight = 50;
        // if age is over 18 and weight over 55 can donate blood
        //if age is under 18 print sorry you are under 18 so cant donate blood
        // if weight is under 55  your weight is under 55 so cant donate blood
        // both condition is true then you can donate blood.
        if (age >= 18) {
            if (weight > 55) {
                System.out.println("both condition is true then you can donate blood.");
            } else {
                System.out.println("your weight is under 55 so you cant donate blood!!!!");
            }
        } else {
            System.out.println("sorry you are under 18 so you cant donate blood");
        }
        //use ternary operator for this question!!!!!!!!!

    }
}
