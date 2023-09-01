package com.days.day22;

public class CountNumberOddEven {

    public static void main(String[] args) {
      //  countEvenOddNumbers();
        countEvenOddNumbers(1,11);

    }

    public static void countEvenOddNumbers(){

        // even and odd numbers between 10 and 30
        int number = 10;
// and how many odd number and how many even number
        int oddNumbersCount = 0;
        int evenNumbersCount = 0;
        do {
            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
                evenNumbersCount++;
            } else {
                System.out.println(number + " is an odd number.");
                ++oddNumbersCount;
            }
            number++;
        } while (number <= 30);
        System.out.println("oddNumbersCount = " + oddNumbersCount);
        System.out.println("evenNumbersCount = " + evenNumbersCount);
    }

    public static void countEvenOddNumbers(int startNumber, int endNumber){
        int number = startNumber;
// and how many odd number and how many even number
        int oddNumbersCount = 0;
        int evenNumbersCount = 0;
        do {
            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
                evenNumbersCount++;
            } else {
                System.out.println(number + " is an odd number.");
                ++oddNumbersCount;
            }
            number++;
        } while (number <= endNumber);
        System.out.println("oddNumbersCount = " + oddNumbersCount);
        System.out.println("evenNumbersCount = " + evenNumbersCount);
    }
}
