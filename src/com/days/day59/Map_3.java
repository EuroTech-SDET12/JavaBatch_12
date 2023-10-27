package com.days.day59;

import java.util.Map;
import java.util.TreeMap;

public class Map_3 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> numbersReversed = new TreeMap<>();
        numbersReversed.put(105, 501);
        numbersReversed.put(103, 301);
        numbersReversed.put(102, 201);
        numbersReversed.put(109, 901);
        numbersReversed.put(107, 701);
        numbersReversed.put(11, 11);
        numbersReversed.put(82, 28);
        System.out.println("numbersReversed = " + numbersReversed);
//key are in ascending order
        System.out.println("numbersReversed.get(800) = " + numbersReversed.get(800));
        System.out.println("numbersReversed.get(82) = " + numbersReversed.get(82));

//        Map<Integer, Integer> numbers = new Map<>();'Map' is abstract cannot be instantiated



    }
}
