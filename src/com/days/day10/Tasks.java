package com.days.day10;

public class Tasks {


    public static void main(String[] args) {


        //Task1

        double salary = 100000, hour = 11;

        if (hour > 38) {
            salary *= 1.5; // salary = salary *1.5;
        }

        System.out.println("salary = " + salary);


        // Task2

        int x = 0, y = 3;

        if (y > 0) {
            x = 1;
        }

        System.out.println("x = " + x);

        // Task 3

        double pay = 100, score = 91;

        if (score > 90){
            pay *= 1.03; //pay = pay + pay*0.03;
        }

        System.out.println("pay = " + pay);
    }
}
