package com.days.day26;

import java.util.Scanner;

public class ScannerTasks {


    public static void main(String[] args) {
        calculateMinutes();
    }


    public static void calculateMinutes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter minutes: ");

        long minutes = scanner.nextLong();

        long year = minutes / 525600 ;  // (60 * 24 * 365)

        long remainMinutes= minutes % (525600);
        long day = remainMinutes / (1440);

        System.out.println(minutes + " is approx. " + year + " year and "+day+" days");
    }
}
