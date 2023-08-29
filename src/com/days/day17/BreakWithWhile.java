package com.days.day17;

public class BreakWithWhile {
    public static void main(String[] args) {
        int n = 0;
        while (n < 500) {
            System.out.println(n);
            if (n == 10) {
                break;
            }
            n++;
        }
        int number = 0;
        do {
            System.out.println(number);
            number++;
            if (number == 5) {
                break;
            }
        } while (number < 1000000000);


    }
}
