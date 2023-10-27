package com.days.day59;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_4 {
    public static void main(String[] args) {
        //can you use map as a reference type and assign a subclass object
        // Integer,Integer
        Map<Integer, Double> numbeRoots = new TreeMap<>();
        numbeRoots.put(25, Math.sqrt(25));
        numbeRoots.put(100, Math.sqrt(100));
        numbeRoots.put(16, Math.sqrt(16));
        numbeRoots.put(144, Math.sqrt(144));
        System.out.println("numbeRoots = " + numbeRoots);
        HashMap<Integer, Double> nums = new HashMap<>();
        print(nums);
        TreeMap<Integer, Double> doubleValues = new TreeMap<>();
        print(doubleValues);

    }
    public static void print(Map<Integer, Double> numbers) {
        System.out.println("numbers = " + numbers);
    }

//    public static void print(TreeMap<Integer, Double> numbers) {
//        System.out.println("numbers = " + numbers);
//    }
//
//    public static void print(HashMap<Integer, Double> numbers) {
//        System.out.println("numbers = " + numbers);
//    }


}
