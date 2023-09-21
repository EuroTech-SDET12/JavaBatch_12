package com.days.day35;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_2 {
    public static void main(String[] args) {
        //store car brands in an arraylist
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Bmw");
        cars.add("Mazda");
        cars.add("Mercedes");

        System.out.println("cars.get(2) = " + cars.get(2));
        System.out.println("cars.get(0).equals(\"Ford\") = " + cars.get(0).equals("Ford"));
//get method from ArrayList class equals method from String class
        cars.forEach(System.out::println);
        cars.set(0,"Audi");
        System.out.println("cars = " + cars);
        System.out.println("cars.contains(\"VW\") = " + cars.contains("VW"));
        System.out.println("cars.contains(\"Bmw\") = " + cars.contains("Bmw"));
        System.out.println("cars.get(0) = " + cars.get(0).toUpperCase());
        System.out.println("cars.indexOf(\"Bmw\") = " + cars.indexOf("Bmw"));
        cars.remove("Mercedes");
        System.out.println("cars = " + cars);
        cars.remove(0);
        System.out.println("cars = " + cars);
        System.out.println("cars.isEmpty() = " + cars.isEmpty());
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }
        System.out.println("cars = " + cars);
        Collections.sort(cars);
        System.out.println("cars = " + cars);
        Collections.reverse(cars);
        System.out.println("cars = " + cars);



    }
}
