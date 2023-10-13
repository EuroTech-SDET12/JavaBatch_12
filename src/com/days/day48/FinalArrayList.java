package com.days.day48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FinalArrayList {

    public static void main(String[] args) {

    //    ArrayList<Integer> list1 = (ArrayList)Arrays.asList(new int[]{1, 2, 3, 4});
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);        list1.add(2);        list1.add(3);        list1.add(4);
        System.out.println("list1 = " + list1);
        list1.set(0,10);
        System.out.println("list1 = " + list1);

        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(11);
        list2.add(22);
        list2.add(33);

        list1 = list2;
        System.out.println("list1 = " + list1);

        final ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(55);
        list3.add(66);
        list3.add(77);
        System.out.println("list3 = " + list3);
        list3.remove(0);
        System.out.println("list3 = " + list3);

//        list3 = new ArrayList<>();
//        list3 = list2; NO NO NO !!

    }
}
