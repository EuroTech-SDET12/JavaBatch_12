package com.days.day17;

public class Return {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            return;// not only terminate execution of the for loop but also will terminate execution of the method block
        }
        System.out.println("Out of the foor loop!!!!");
        System.out.println("Will not be printed!!!!!!");






    }
}
