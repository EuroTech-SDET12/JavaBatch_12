package com.days.day18;

public class NestedIf {
    public static void main(String[] args) {

        // divisible by 2 ---> print number is multiple of 2
        // multiple of 3 ----> print number is multiple of 3
        // multiple of 2 & 3 ==> print number is multiple of 6--> inside the other condition
//  rule : if number is multiple of 2 and 3 means that number is multiple of 6
        int num = 19;
        if (num % 2 == 0) {
            System.out.println(num + " is multiple of 2.");
            if (num % 3 == 0) {
                System.out.println(num + " is multiple of 3");
                System.out.println(num + " is multiple of 6 as well!!!!!!");
            }
        } else if (num % 3 == 0) {
            System.out.println(num + " is multiple of 3");
        } else {
            System.out.println("neither  of the condition is true!!!!");
        }
    }
}
