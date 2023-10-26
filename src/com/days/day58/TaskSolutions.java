package com.days.day58;

import java.util.ArrayList;

public class TaskSolutions {

    public static void main(String[] args) {

        ArrayList<Integer> number1 = new ArrayList<>();
        System.out.println("\n// add() \\\\\\\\\\\\\\\\\\\\\\");
        number1.add(22);
        number1.add(33);
        number1.add(44);
        System.out.println("number1 = " + number1);
        number1.add(0,11);
        System.out.println("number1 = " + number1);

        number1.set(1,222);
        System.out.println("number1 = " + number1);


        System.out.println("number1.subList(0,3) = " + number1.subList(0, 3));

//        number1.retainAll()

    }
}
