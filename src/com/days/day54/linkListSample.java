package com.days.day54;

import java.util.LinkedList;

public class linkListSample {

    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("UI");
        list1.add("DB");
        list1.add("API");

        System.out.println("list1.getFirst() = " + list1.getFirst());
        list1.add("Test");
        System.out.println("list1 = " + list1);
        list1.addFirst("VIP");

        System.out.println("list1 = " + list1);

    }
}
