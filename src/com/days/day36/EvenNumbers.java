package com.days.day36;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumbers {
    public static void main(String[] args) {
        //create an arraylist 8 elements
        //find the even-odd numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(19);
        numbers.add(80);
        numbers.add(83);
        numbers.add(100);
        numbers.add(47);
        System.out.println("numbers.get(0)%2==0 = " + (numbers.get(0) % 2 == 0));
        System.out.println("numbers.get(1)%2==0 = " + (numbers.get(1) % 2 == 0));
        System.out.println("numbers.get(2)%2==0 = " + (numbers.get(2) % 2 == 0));
        System.out.println("numbers.get(3)%2==0 = " + (numbers.get(3) % 2 == 0));

//        for (int i = 0; i < numbers.size(); i++) {
//            //       10 is an even number
//
//            if (numbers.get(i) % 2 == 0) {
//                System.out.println(numbers.get(i) + " is an even number.");
//            }else {
//                System.out.println(numbers.get(i) + " is an odd number.");
//            }
//        }
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num + " is an even number.");
                evenNumbers.add(num);
            } else {
                System.out.println(num + " is an odd number.");
                oddNumbers.add(num);
            }
        }
        System.out.println("evenNumbers = " + evenNumbers);
        System.out.println("oddNumbers = " + oddNumbers);

        System.out.println(getEvenNumbers(numbers));
        ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(125, 160, 158, 190, 170, 199, 200, 300, 359));
        ArrayList<Integer> evenDigits = getEvenNumbers(digits);
        System.out.println("evenDigits = " + evenDigits);
        ArrayList<Integer> oddDigits = getOddNumbers(digits);
        System.out.println("oddDigits = " + oddDigits);

    }

    public static ArrayList<Integer> getEvenNumbers(ArrayList<Integer> numbers) {
        //function of method is to find even numbers in an arraylist
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

    public static ArrayList<Integer> getOddNumbers(ArrayList<Integer> numbers) {
        //function of method is to find odd numbers in an arraylist
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }


}
