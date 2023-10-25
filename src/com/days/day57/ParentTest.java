package com.days.day57;

import com.days.day48.HidingPractice.Sub;

public class ParentTest {
    public static void main(String[] args) {
        SubClass1 subClass1 = new SubClass1();
        subClass1.print();
        SubClass2 subClass2 = new SubClass2();
        subClass2.print();

        Parent parent1 = new SubClass1();
        parent1.print();
        parent1 = new SubClass2();
        parent1.print();
        callPrint(subClass1);
        callPrint(subClass2);
        Parent parent = new SubClass2();
        parent = subClass2;
        System.out.println("parent1.number = " + parent1.number);
        SubClass1 subClass11 = new SubClass1();
        System.out.println("subClass11.number = " + subClass11.number);
    }

    public static void callPrint(Parent parent) {
        parent.print();
    }

//    public static void callPrint(SubClass2 class2) {
//        class2.print();
//    }
//    public static void callPrint(SubClass1 class1) {
//        class1.print();
//    }


    public static void callPrint(String str) {

    }

    public static void callPrint(int num) {

    }
}
