package com.days.day16;

public class PrimeNumber {
    public static void main(String[] args) {
        // prime number ---> number is divisible by 1 and itself ---> prime number
        // 7 , 11 , 13 , 17 , 19 , 23 , 29
        int number = 7;
        //find this number prime or not
        // after for loop if the number is prime  print 19 is a prime number  else 20 is not a prime number
        // 2 3 4 5 6    7%2==0 7%3==0  7%4==0  7%5==0 7%6==0
        // 2 3 9%2==0 9%3==0
        number = 20;
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) { // isPrime==true
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not prime number.");
        }

        // find the prime numbers between 20-80


    }
}
