package com.days.day57;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(120);
        numbers.add(35);
        numbers.add(15);
        numbers.add(50);
        numbers.add(70);
        numbers.add(90);
        numbers.add(20);
        numbers.add(300);

        //numbers greater then 50
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 50) {
                System.out.println("numbers.get(i) = " + numbers.get(i));
            }
        }
        System.out.println("============");
        numbers.stream().filter(n -> n > 50).forEach(System.out::println);

        List<Integer> collect = numbers.stream().filter(n -> n > 50).collect(Collectors.toList());

        System.out.println("collect = " + collect);

        numbers.stream().filter(x -> x > 50).forEach(x -> System.out.println(x + " is greater then 50."));
//search
        numbers.stream().filter(n -> n % 2 == 0).forEach(x -> System.out.println(x + " is an even number."));
        System.out.println("===============");
        numbers.stream().forEach(x -> {
            if (x % 2 == 0) System.out.println(x + " is even number.");
            else System.out.println(x + " is an odd number.");
        });

        numbers.stream().map(n -> Math.pow(n, 2)).forEach(System.out::println);


    }
}
