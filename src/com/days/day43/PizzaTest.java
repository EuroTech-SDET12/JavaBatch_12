package com.days.day43;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza aliPizza = new Pizza();
        Pizza veliPizza = new Pizza();
        Pizza aysePizza = new Pizza();
        Pizza hakanPizza = new Pizza();
        aysePizza.pizzaOwner="Ayse";
        hakanPizza.pizzaOwner = "Hakan";
        veliPizza.pizzaOwner = "Veli";
        aliPizza.pizzaOwner = "Ali";
        aliPizza.eatOneSlicePizza();//Ali is eating pizza
        System.out.println("Pizza.familyPizzaSlices = " + Pizza.familyPizzaSlices);
        veliPizza.eatOneSlicePizza();
        System.out.println("Pizza.familyPizzaSlices = " + Pizza.familyPizzaSlices);
        hakanPizza.eatOneSlicePizza();
        System.out.println("Pizza.familyPizzaSlices = " + Pizza.familyPizzaSlices);
//        System.out.println("veliPizza.personalPizzaSlices = " + veliPizza.personalPizzaSlices);
//        System.out.println("aliPizza.personalPizzaSlices = " + aliPizza.personalPizzaSlices);

//        System.out.println("aliPizza.personalPizzaSlices = " + aliPizza.personalPizzaSlices);
//        System.out.println("hakanPizza.personalPizzaSlices = " + hakanPizza.personalPizzaSlices);

        System.out.println("aysePizza.personalPizzaSlices = " + aysePizza.personalPizzaSlices);
        System.out.println("aliPizza.personalPizzaSlices = " + aliPizza.personalPizzaSlices);
        aliPizza.eatOneSlicePizza();
        System.out.println("aliPizza.personalPizzaSlices = " + aliPizza.personalPizzaSlices);
        System.out.println("aysePizza.personalPizzaSlices = " + aysePizza.personalPizzaSlices);
    }
}
