package com.days.day17;

public class Branching_2 {
    public static void main(String[] args) {
        one:
        for (int i = 1; i < 987654321; i++) {
            if (i == 11) {
                break one;//Unnecessary label 'one' on break statement
            }
            System.out.print(i);
        }


        System.out.println("\n==============");
        two:
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue two;//rest of the for block will not be executed when i==3 only 1 time
            //           Unnecessary label 'two' on continue statement
            }
            System.out.println(i);//0124
        }




    }
}
