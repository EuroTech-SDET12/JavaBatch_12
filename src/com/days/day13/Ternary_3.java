package com.days.day13;

public class Ternary_3 {
    public static void main(String[] args) {
        int time = 13;
        String greeting;
        greeting = (time < 12) ? "Good morning!!!" : "Good Afternoon!!";
        System.out.println("greeting = " + greeting);

        int number = 21;// odd or even
        // 21 is an odd number    20 is an even number
        String evenOrOdd = number % 2 == 1 ? number + " is an odd number." : number + " is an even number.";
        System.out.println("evenOrOdd = " + evenOrOdd);
    }
}
