package com.days.day35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
//add() Appends the specified element to the end of this list.
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(29);
        numbers.add(39);
        numbers.add(9);
        numbers.add(50);
        System.out.println("numbers = " + numbers);
        //keeps insertion order
        numbers.add(0, 100);
        System.out.println("numbers = " + numbers);
        int var = 45;
        numbers.add(var);
        //size() Returns the number of elements in this list
        System.out.println("numbers = " + numbers);
        System.out.println("numbers.size() = " + numbers.size());
        //get() Returns the element at the specified position in this list
        System.out.println("numbers.get(0) = " + numbers.get(0));
        System.out.println("numbers.get(1) = " + numbers.get(1));
        System.out.println("numbers.get(2) = " + numbers.get(2));
        System.out.println("numbers.get(9) = " + numbers.get(9));
        System.out.println("numbers.get(size-1) = " + numbers.get(numbers.size() - 1));

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("numbers.get(" + i + ") = " + numbers.get(i));
        }
//        for (Integer num : numbers) {
        for (int num : numbers) {
            System.out.println("num = " + num);
        }
        System.out.println("numbers = " + numbers);

        //set() Replaces the element at the specified position in this list with the specified element.
        numbers.set(1, 500);
        System.out.println("numbers = " + numbers);
        numbers.set(numbers.size() - 1, 200);
        System.out.println("numbers = " + numbers);
//        numbers.set(numbers.size(),200);
//        numbers.set(10,200);Index 10 out of bounds for length 10
        System.out.println("numbers = " + numbers);
        //remove()Removes the element at the specified position in this list.
        numbers.remove(9);
        System.out.println("numbers = " + numbers);
        Integer var2 = 100;
        numbers.add(100);
        numbers.remove(var2);
        System.out.println("numbers = " + numbers);
        numbers.remove(var2);
        System.out.println("numbers = " + numbers);
//contains()Returns true if this list contains the specified element.
        System.out.println("numbers.contains(15) = " + numbers.contains(15));
        System.out.println("numbers.contains(150) = " + numbers.contains(150));
//Returns the index of the first occurrence of the specified element in this list,
// or -1 if this list does not contain the element.
        System.out.println("numbers.indexOf(15) = " + numbers.indexOf(15));
        System.out.println("numbers.indexOf(150) = " + numbers.indexOf(150));
        System.out.println("numbers = " + numbers);
        numbers.add(20);
        //lastIndexOf() Returns the index of the last occurrence of the specified element in this list,
        // or -1 if this list does not contain the element.
        System.out.println("numbers = " + numbers);
        System.out.println("numbers.lastIndexOf(20) = " + numbers.lastIndexOf(20));
        System.out.println("numbers.indexOf(20) = " + numbers.indexOf(20));
//  clear() Removes all of the elements from this list. The list will be empty after this call returns.
//        numbers.clear();
        System.out.println("numbers = " + numbers);

        ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(10, 20, 60, 50));
        System.out.println("digits = " + digits);
        //equals()   Compares the specified object with this list for equality.
        // Returns true if and only if the specified object is also a list
        System.out.println(numbers.equals(digits));
        ArrayList<Integer> copy = numbers;
        System.out.println(numbers.equals(copy));
        System.out.println("copy = " + copy);
        System.out.println("numbers = " + numbers);
//sort() Sorts the specified list into ascending order
        Collections.sort(numbers);
        System.out.println("numbers = " + numbers);
        System.out.println("copy = " + copy);
        //max() Returns the maximum element of the given collection
        System.out.println("Collections.max(numbers) = " + Collections.max(numbers));
        Collections.reverse(numbers);
        System.out.println("numbers = " + numbers);
        System.out.println("==========");
        numbers.forEach(System.out::println);
        numbers.add(80);
        numbers.add(180);
        System.out.println("===============");
        //go numbers arraylis check the elemnts which are greater then 50 then print them
        numbers.stream().filter(n->n>50).forEach(System.out::println);

    }

    //create a method to find index number of the element
}
