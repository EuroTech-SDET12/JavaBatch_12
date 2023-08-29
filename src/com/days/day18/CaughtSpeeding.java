package com.days.day18;

public class CaughtSpeeding {


    //    You are driving a little too fast, and a police officer stops you.
//    Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket,
//    2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive,
//    the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day,
//    your speed can be 5 higher in all cases.
//
//
//    caughtSpeeding(60, false) → 0
//    caughtSpeeding(65, false) → 1
//    caughtSpeeding(65, true) → 0
    public static void main(String[] args) {
        //print no ticket(0)  60 or less
        //      small ticket(1) 61 - 80 inclusive
        //      big ticket(2) 81 or more

        // if birthday
        //print no ticket(0)  65 or less
        //      small ticket(1) 66 - 85 inclusive
        //      big ticket(2) 86 or more

        //your speed 63 --> small ticket(1)
        //birthday   63---> no ticket
        int speed = 65;
        boolean isBirthday = false;
        if (isBirthday) {
            if (speed <= 65) {
                System.out.println("no ticket(0)");
            } else if (speed <= 85) {
                System.out.println("small ticket(1)");
            } else {
                // if (speed > 85) {
                System.out.println("big ticket(2)");
            }
        } else {// if it is not birthday
            if (speed <= 60) {
                System.out.println("no ticket(0)");
            } else if (speed <= 80) {
                System.out.println("small ticket(1)");
            } else {
                // if (speed > 80) {
                System.out.println("big ticket(2)");
            }
        }
    }
}
