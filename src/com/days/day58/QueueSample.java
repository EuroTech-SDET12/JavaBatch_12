package com.days.day58;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {

    public static void main(String[] args) {

        Queue<Integer> obj1 = new PriorityQueue<>();

        Queue<Integer> obj2 = new LinkedList<>();

        Queue<Integer> obj3 = new ArrayDeque<>();

        obj1.add(555);
        obj1.add(111);
        obj1.add(444);
        obj1.add(222);
        obj1.add(333);
        System.out.println("obj1 = " + obj1);
        System.out.println("obj1.poll() = " + obj1.poll());
        System.out.println("obj1 = " + obj1);



    }
}
