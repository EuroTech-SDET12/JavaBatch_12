package com.days.day58;

import java.util.*;

public class SetSample {

    public static void main(String[] args) {

        HashSet<Integer> hashObj = new HashSet<>();
        TreeSet<Integer> treeObj = new TreeSet<>();

        hashObj.add(1111);
        hashObj.add(1111);
        hashObj.add(2222);
        hashObj.add(2222);
        hashObj.add(3333);
        hashObj.add(3333);
        hashObj.add(4444);
        hashObj.add(4444);
        hashObj.add(null);
        System.out.println("hashObj = " + hashObj);

        try {
            treeObj.add(4444);
            treeObj.add(4444);
            treeObj.add(4444);
            treeObj.add(4444);
            treeObj.add(4444);
            treeObj.add(1111);
            treeObj.add(1111);
            treeObj.add(2222);
            treeObj.add(2222);
            treeObj.add(3333);
            treeObj.add(3333);
            treeObj.add(null);
        } catch (NullPointerException e){
            System.out.println(" Data contains null values, TEST FAILED !!!");
        }
        System.out.println("treeObj = " + treeObj);


        List<String> statusList = new ArrayList<>(Arrays.asList("complete","complete","complete",
                "complete", "on the way",
                "on the way","on the way","on the way","on the way","on the way","on the way",
                "paid", "paid", "paid",
                "paid", "paid", "preparing", "preparing", "preparing", "preparing",
                "preparing",null,null));

        System.out.println(statusList);

        // how many different types of status I have :
        HashSet<String> hashSetStatus = new HashSet<>(statusList);
        System.out.println("hashSetStatus = " + hashSetStatus);

        try {
            TreeSet<String> treeSetStatus = new TreeSet<>(statusList);
            System.out.println("treeSetStatus = " + treeSetStatus);
        } catch (NullPointerException e){
            System.out.println("Null data value exist!!! do bla bla bla!!!!");
        }




    }



}
