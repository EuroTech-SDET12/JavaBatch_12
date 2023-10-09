package com.days.day45.InheritanceType;

public class TypeTest {

    public static void main(String[] args) {

        Child1 c1 = new Child1();
        System.out.println("c1.child1Field = " + c1.child1Field);
        System.out.println("c1.parent1Field = " + c1.parent1Field);
        System.out.println("c1.test = " + c1.test);
//        c1.child2Field  NO ACCESS !!!
        // there is only 1 way connection!!!

        Child2 c2 = new Child2();
        System.out.println("c2.child1Field = " + c2.child1Field);
        System.out.println("c2.parent1Field = " + c2.parent1Field);


    }

}
