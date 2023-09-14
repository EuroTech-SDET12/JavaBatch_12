package com.days.day31;

import java.util.Arrays;

public class Arrays_1 {
    public static void main(String[] args) {
        //int  numbers   5 elements
        // String cities  5 elements
        int[] numbers = new int[5];
        numbers[2] = 20;
        numbers[3] = 50;
        numbers[0] = 30;
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        String capital1 = "Oslo";
        String cities[] = {"London", "Roma", "Istanbul", "Berlin", "Madrid", capital1};
        char[] abc = {'a', 'b', 'c', 'd'};
        String str = new String(abc);// sequence of char
        System.out.println("str = " + str);
        System.out.println("str.length() = " + str.length());
        System.out.println("cities.length = " + cities.length);
        System.out.println("numbers.length = " + numbers.length);
        numbers[0] = 500;
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        numbers[4] = 300;
        System.out.println("Arrays.asList(numbers) = " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {// 0 1 2 3 4
            System.out.println("numbers[i] = " + numbers[i]);
        }
        String city5 = "Oslo";
//        String cities[] = {"London", "Roma", "Istanbul", "Berlin", "Madrid", capital1};
        System.out.println("cities[0].equals(\"Oslo\") = " + cities[0].equals("Oslo"));
        System.out.println("cities[1].equals(\"Oslo\") = " + cities[1].equals("Oslo"));
        System.out.println("cities[2].equals(\"Oslo\") = " + cities[2].equals(city5));
        System.out.println("cities[3].equals(\"Oslo\") = " + cities[3].equals(city5));
        System.out.println("cities[4].equals(\"Oslo\") = " + cities[4].equals(city5));
        System.out.println("cities[5].equals(\"Oslo\") = " + cities[5].equals(city5));
        city5 = "Izmir";
//        String cities[] = {"London", "Roma", "Istanbul", "Berlin", "Madrid", capital1};
        int counter = 0;
        for (int i = 0; i < cities.length; i++) {
//            if (cities[i].equals("Oslo")) {
            if (cities[i].equals(city5)) {
//                System.out.println("One  of the element value cities Array equals " + city5);
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println("One  of the element value cities Array equals " + city5);
        } else {
            System.out.println("We couldnt find " + city5 + " in the cities array.");
        }
        numbers = new int[]{10, 5, 20, 30, 1, 3};
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Arrays.toString(cities) = " + Arrays.toString(cities));
        Arrays.sort(cities);
        System.out.println("Arrays.toString(cities) = " + Arrays.toString(cities));
        System.out.println("Arrays.binarySearch(numbers,30) = " + Arrays.binarySearch(numbers, 30));//index number of the element
        System.out.println("Arrays.binarySearch(numbers,100) = " + Arrays.binarySearch(numbers, 100));
        System.out.println("Arrays.binarySearch(cities,\"Oslo\") = " + Arrays.binarySearch(cities, "Oslo"));
        System.out.println("Arrays.binarySearch(cities,\"Izmir\") = " + Arrays.binarySearch(cities, "Izmir"));
    }
}
