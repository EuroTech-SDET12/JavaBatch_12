package com.days.day30;

import java.util.Random;
import java.util.Scanner;

public class GuessGameWithArray {

    public static void main(String[] args) {
        guessGame();
    }

    // TASK - Use base guessGame question then update it for this output, do not change any feature of question!!
    // STORE USER's LAST 10-guesses number in an array data container,
    // when the user finds the number, print his all guessed numbers!!!

    // sample input: User guess:  1 3 2 5 8 9 10  11  12 14 15 17(Lucky number)
    // output: All your guess numbers: {15, 17, 2, 5, 8, 9, 10,  11,  12, 14}
    public static void guessGame() {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int count = 0;
        int secretNumber = random.nextInt(50) + 1;
        System.out.println("Welcome to my GAME!!! Please Enter a number to catch my luck number!! :");

        while (true) {
            if (scanner.hasNextInt()) {
                count++;
                int number = scanner.nextInt();
                if (number < 51 && number > 0) {
                    if (number == secretNumber) {
                        System.out.println("BRAVO!! You got the number in " + count + " times!!!");
                        break;
                    } else if (number > secretNumber) {
                        System.out.println(number + " is too large, please try again!!!");
                    } else {  // number < secretNumber
                        System.out.println(number + " is too short, please try again!!!");
                    }
                } else { // number > 50 or number < 1
                    System.out.println("INVALID Number border, please enter a number between 1 and 30!");
                }
            } else {
                System.out.println("PLEASE ENTER NUMERIC VALUE!!!");
                scanner.next();
            }
        }
    }
}
