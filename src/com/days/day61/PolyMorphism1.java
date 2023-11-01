package com.days.day61;

import java.util.*;

public class PolyMorphism1 {
    public static void main(String[] args) {
        //  reference type                object type   -->polymorphism
        //  interface/parent class         subclasses

        List<String> cities = new ArrayList<>();
        cities.add("Mexico city");
        List<String> countries = new LinkedList<>();
        countries.add("Norway");
        print(cities);
        print(countries);
        Map<String, String> countryCapitals = new LinkedHashMap<>();
    }

    //  print
    public static void print(List<String> list) {
        System.out.println("list = " + list);
    }
}
