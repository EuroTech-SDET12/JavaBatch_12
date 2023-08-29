package com.days.day17;

public class NestedDo_While {
    public static void main(String[] args) {
        // **********
        int i = 0;
        while (i < 10) {
            System.out.print("*");
            i++;
        }
        System.out.println("\ni = " + i);
        i = 0;
        while (i < 10) {
            System.out.print("*");
            i++;
        }
        System.out.println("\ni = " + i);

        while (i < 20) {
            System.out.print("*");
            i++;
        }


        //nested while loop
//        **********
//        **********
//        **********
        System.out.println("\n==================");
        int n = 0;
        i = 0;
        outer:
        while (n < 3) {
            inner:
            while (i < 10) {
                System.out.print("*");
                i++;
            }
            i = 0;
//            System.out.println("\ni = " + i);
            System.out.println();
            n++;
        }


    }
}
