package com.days.day17;

public class BranchingStatements {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");//0 1 2 3 4
            if (i == 4) {
                break;//terminate execution of the for loop
            }
        }
        System.out.println("out of the for loop!!!!");

        System.out.println("Nested Loopsssss!!!!");

        row:
        for (int i = 0; i < 5; i++) {
            column:

            for (int n = 1; n <= 10; n++) {

                System.out.print(n);
                if (n == 6) {
                    break column;
                }
            }

            System.out.println();

        }


        System.out.println("============");

        outer:
        for (int i = 0; i < 5; i++) {
            inner:
            for (int n = 1; n <= 10; n++) {
                if (i == 3) {
                    break outer;
                }
                System.out.print(i);

            }
            System.out.println();
        }
        // 0000000000
        // 1111111111
        // 2222222222
        // 3333333333
        // 4444444444


        System.out.println("==========================");

        outer:
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break;
            }
            inner:
            for (int n = 1; n <= 10; n++) {

                System.out.print(i);

            }

            System.out.println();
        }


    }
}
