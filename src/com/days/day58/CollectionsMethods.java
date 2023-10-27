package com.days.day58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {

    public static void main(String[] args) {

//        Collections

        List<Integer> list1 = new ArrayList<>(Arrays.asList(11, 22, 33, 44));
        System.out.println("list1 = " + list1);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(55, 66, 77));
        System.out.println("list2 = " + list2);

        // addAll
        Collections.addAll(list1, 88, 99, 113, 114, 113, 114);
        System.out.println("list1 = " + list1);

        //copy
        Collections.copy(list1, list2);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);


        // FILL
//        for (int i = 0; i < list1.size(); i++) {
//
//            list1.set(i, 1111);
//        }
        Collections.fill(list2, 111);
        System.out.println("list2 = " + list2);


        // Frequency
        int counter =0;
        for (Integer integer : list2) {
            if(integer == 113){
                counter++;
            }
        }
        System.out.println("Collections.frequency(list1,113) = " + Collections.frequency(list1, 113));
        System.out.println("Collections.frequency(list1,113) = " + Collections.frequency(list1, 1));


        // MAX
//        int[] numbers = {1,6,3,1,4,7,0,66,1,22,1};
        System.out.println("Collections.max(list1) = " + Collections.max(list1));
//        System.out.println("Collections.max(numbers) = " + Collections.max(Arrays.asList(1,6,3,1,4,7,0,66,1,22,1)));


        // Replace All
        Collections.replaceAll(list1,113, 11111);
        System.out.println("list1 = " + list1);
//        for (int i = 0; i < list1.size(); i++) {
//            if (list1.get(i) == 113) {
//                list1.set(i, 111111);
//            }
//        }


        // Reverse
        Collections.reverse(list1);
        System.out.println("list1 = " + list1);
    }
}


