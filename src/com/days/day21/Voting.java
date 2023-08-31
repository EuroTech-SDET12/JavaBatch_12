package com.days.day21;

public class Voting {
    // elligibleForVoting(); if age is >=18  print you can give vote else print you cant vote

    public static void main(String[] args) {
        elligibleForVoting(50);
        int a = 15;
        elligibleForVoting(a);//the value that we pass is  named as "argument"
        print((int)20.50);
        // byte short int long float double
        //--->widening   implicitly casting automaticaly
        //              narrowing    <----  explicitly casting  we have to cast
    }

    public static void elligibleForVoting(int age) {
        if (age >= 18) {
            System.out.println("You are elligible for voting.");
        } else {
            System.out.println("You are not elligible for voting");
        }
    }


    static void print(int number) {
        System.out.println("number = " + number);
    }

}
