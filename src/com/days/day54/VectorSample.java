package com.days.day54;

import java.util.Vector;

public class VectorSample {

    public static void main(String[] args) {
        Vector<Integer> obj1 = new Vector<>();

        obj1.add(150);
        obj1.add(250);
        obj1.add(-150);
        obj1.add(300);
        obj1.add(300);
        obj1.add(300);
        obj1.add(300);
        obj1.add(300);
        obj1.add(300);
        obj1.add(300);
        obj1.add(300);
        obj1.add(300);
        obj1.add(300);
        obj1.add(311);

        System.out.println("obj1 = " + obj1);

        System.out.println("obj1.capacity() = " + obj1.capacity());

        System.out.println("obj1.firstElement() = " + obj1.firstElement());
        System.out.println("obj1.lastElement() = " + obj1.lastElement());
        obj1.ensureCapacity(50);

        System.out.println("obj1.capacity() = " + obj1.capacity());


    }
}
