package com.days.day59;

import java.util.LinkedHashMap;
import java.util.Set;

public class Map_2 {
    public static void main(String[] args) {
        // country,capital -->Norway,Oslo  4 keys-values

        LinkedHashMap<String, String> countryCapitals = new LinkedHashMap<>();
        countryCapitals.put("India", "Delhi");
        countryCapitals.put("China", "Beijing");
        countryCapitals.put("Turkey", "Ankara");
        countryCapitals.put("Germany", "Munich");
        System.out.println("countryCapitals = " + countryCapitals);
        //keeps insertion order
        Set<String> keys = countryCapitals.keySet();
        for (String key : keys) {
            System.out.println(countryCapitals.get(key) + " is the capital of " + key);
        }
        countryCapitals.put("Germany", "Berlin");
        System.out.println("countryCapitals = " + countryCapitals);
        System.out.println(countryCapitals.containsValue("Oslo"));
        if (!countryCapitals.containsValue("Oslo")) {
            countryCapitals.put("Norway", "Oslo");
        }
        System.out.println("countryCapitals = " + countryCapitals);
        System.out.println(countryCapitals.containsKey("Norway"));
        countryCapitals.replace("Germany", "Munich");
        System.out.println("countryCapitals = " + countryCapitals);
        countryCapitals.put("Germany", "Berlin");
        System.out.println("countryCapitals = " + countryCapitals);
        countryCapitals.remove("Norway");
        System.out.println("countryCapitals = " + countryCapitals);


        LinkedHashMap<Integer, Double> numbersPowers = new LinkedHashMap<>();
        System.out.println("Math.pow(2,2) = " + Math.pow(2, 2));//2*2-->4
        numbersPowers.put(2, Math.pow(2, 2));
        numbersPowers.put(3, Math.pow(3, 2));
        numbersPowers.put(4, Math.pow(4, 2));
        numbersPowers.put(5, Math.pow(5, 2));
        System.out.println("numbersPowers = " + numbersPowers);
        System.out.println("numbersPowers.get(5) = " + numbersPowers.get(5));

    }
}
