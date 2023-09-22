package com.days.day36;

import java.util.ArrayList;
import java.util.Arrays;

public class ListOfFruits {
    public static void main(String[] args) {
        //fruits--->4 apple banana orange mango
        //vegetables--->3 Potato  onion brocoli carrot
        ArrayList<String> fruitList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Mango"));
        ArrayList<String> vegList = new ArrayList<>(Arrays.asList("Potato", "Onion", "Carrot"));
        System.out.println("fruitList.get(fruitList.size()-1) = " + fruitList.get(fruitList.size() - 1));
        System.out.println("fruitList.get(fruitList.size()-1).toUpperCase() = " + fruitList.get(fruitList.size() - 1).toUpperCase());
        System.out.println("vegList.get(3).substring(0,3) = " + vegList.get(2).substring(0, 3));
        String car = "car";
        System.out.println(vegList.get(2).substring(0, 3).equals(car));
        System.out.println(vegList.get(2).substring(0, 3).equalsIgnoreCase(car));
        System.out.println(vegList.get(2).substring(0, 3).toLowerCase().equals(car));
        //  methods from       Arraylist    String           String      String

        for (String fruit : fruitList) {
            System.out.println(fruit.charAt(0));
            System.out.println(fruit);
        }


    }
}
