package com.days.day17;

public class DiamondPattern {
    public static void main(String[] args) {
        //              *
        //             ***
        //            *****
        //           *******
        for (int i = 1; i <= 4; i++) {
            for (int n = 4; n > i; n--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= 2*i-1; l++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
