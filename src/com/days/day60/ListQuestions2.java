package com.days.day60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListQuestions2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(100);
        numbers.add(70);
        numbers.add(25);
        numbers.add(125);
        numbers.add(501);
        numbers.add(200);
        //reverse the list?
        //Collections.reverse(numbers);
        System.out.println("numbers = " + numbers);
        Collections.swap(numbers, 0, 3);//swap the values
        System.out.println("numbers = " + numbers);
        List<Integer> subList = numbers.subList(2, 5);//create a sublist
        System.out.println("subList = " + subList);
        //copy the whole list
        List<Integer> copied = new ArrayList<>(numbers);
        System.out.println("copied = " + copied);


    }
}
