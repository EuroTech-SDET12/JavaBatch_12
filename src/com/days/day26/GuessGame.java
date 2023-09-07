package com.days.day26;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {


    public static void main(String[] args) {
        guessGame();
    }

// TASK: try to apply hasNextInt() with next() to handle INVALID DATA entry
    // and do not count INVALID DATA entry!!!
    public static void guessGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 0;
        int secretNumber = random.nextInt(30) + 1;

        System.out.println("Welcome to my GAME!!! Please Enter a number to catch my luck number!! :");

        while (true) {
            count++;
            int number = scanner.nextInt();
            if (number < 31 && number > 0) {
                if (number == secretNumber) {
                    System.out.println("BRAVO!! You got the number in " + count + " times!!!");
                    break;
                } else if (number > secretNumber) {
                    System.out.println(number + " is too large, please try again!!!");
                } else {  // number < secretNumber
                    System.out.println(number + " is too short, please try again!!!");
                }
            } else { // number > 30 or number < 1
                System.out.println("INVALID Number border, please enter a number between 1 and 30!");
            }
        }

    }
}
