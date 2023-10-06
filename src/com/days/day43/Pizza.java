package com.days.day43;

public class Pizza {

    static {
        System.out.println("Pizza class started to  be executed");
        System.out.println("will be executed once.");
    }

    {
        System.out.println("Object created from Pizza Class.");
//        System.out.println("Whenever you create an object");
    }

    String pizzaOwner;
    int personalPizzaSlices = 6;
    //each family member will have oqn pizza
    static int familyPizzaSlices = 10;
    //this is belong to family

    public void eatOneSlicePizza() {
        personalPizzaSlices--;
        System.out.println(pizzaOwner + " is eating pizza");
        System.out.println(pizzaOwner + " has " + personalPizzaSlices + " slices pizza now after eating.");
        //Ali has 5 slices pizza
        familyPizzaSlices--;//eating from family pizza
//        System.out.println("family has " + familyPizzaSlices + " has pizza");
    }


}
