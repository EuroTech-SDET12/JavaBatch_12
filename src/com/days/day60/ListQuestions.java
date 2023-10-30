package com.days.day60;

import java.util.*;

public class ListQuestions {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(50);
        numbers.add(100);
        numbers.add(70);
        numbers.add(70);
        numbers.add(25);
        numbers.add(125);
        numbers.add(125);
        numbers.add(501);
        numbers.add(200);
//        how can i remove duplicate values?
        Set<Integer> uniqeValues = new LinkedHashSet<>(numbers);
        numbers.clear();
        numbers.addAll(uniqeValues);
        System.out.println("numbers = " + numbers);
        //can you create a method to remove duplicate values in a list
        //create a method print even numbers in a list
        // will return even numbers as a list

        //create a method with 1 parameter , list
        //solution in the method
        // create a list
        //put even numbers into the that list
        // return that list
        ListQuestions questions = new ListQuestions();
        questions.evenNumbersInList(numbers);
//        Collections.sort(numbers);
//        System.out.println("numbers = " + numbers);
//        System.out.println("numbers.get(6) = " + numbers.get(6));
//        System.out.println("numbers.get(numbers.size()-1) = " + numbers.get(numbers.size() - 1));
        int largest = questions.largestValueIn(numbers);
        System.out.println("largest = " + largest);
        List<Integer> anotherList = new ArrayList<>(Arrays.asList(1000, 800, 900, 500));
        System.out.println(questions.largestValueIn(anotherList));
    }

    public List<Integer> evenNumbersInList(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(" even number = " + number);
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    //create a method returning largest value in a list
    //create a method with 1 parameter , list
    //solution in the method
    // create a variable
    //assign largest value to that variable
    // return that variable

    public int largestValueIn(List<Integer> numbers) {
        Collections.sort(numbers);
        int largest = numbers.get(numbers.size() - 1);
        return largest;
    }

}
