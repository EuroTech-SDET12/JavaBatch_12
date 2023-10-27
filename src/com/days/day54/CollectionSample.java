package com.days.day54;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionSample {


//    Collections a class which contains predefined useful methods

//   Collection is an interface that contains useful abstract methods

    public static void main(String[] args) {



        ArrayList<Integer> number1 = new ArrayList<>();
        System.out.println("\n// add() \\\\\\\\\\\\\\\\\\\\\\");
        number1.add(12);
        number1.add(13);
        number1.add(14);

        ArrayList<Integer> number2 = new ArrayList<>();
        System.out.println("\n// addAll() \\\\\\\\\\\\\\\\\\\\\\");
        number2.addAll(number1);

        System.out.println("number2 = " + number2);

        System.out.println("\n// clear() \\\\\\\\\\\\\\\\\\\\\\");
        number2.clear();

        System.out.println("\n// contains() \\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("number1.contains(15) = " + number1.contains(15));
        System.out.println("number1.contains(14) = " + number1.contains(14));

        System.out.println("\ncontainsAll() \\\\\\\\\\\\\\\\\\\\\\");
        number2.addAll(number1);
        System.out.println("number2 = " + number2);
        System.out.println("number1 = " + number1);
        System.out.println("number2.containsAll(number1) = " + number2.containsAll(number1));

        number2.add(15);
        System.out.println("number2 = " + number2);
        System.out.println("number1 = " + number1);
        System.out.println("number2.containsAll(number1) = " + number2.containsAll(number1));
        System.out.println("number1.containsAll(number2) = " + number1.containsAll(number2));

        ArrayList<Integer> number3 = new ArrayList<>();
        number3.add(14);
        number3.add(12);
        number3.add(13);
        System.out.println("number3 = " + number3);
        System.out.println("number1.containsAll(number3) = " + number1.containsAll(number3));

        System.out.println("\n// equal() \\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("number1.equals(number3) = " + number1.equals(number3));

        System.out.println("\n// hashCode() \\\\\\\\\\\\\\\\\\\\\\");
        ArrayList<Integer> number4 = number3;
        System.out.println("number3.hashCode() = " + number3.hashCode());
        System.out.println("number4.hashCode() = " + number4.hashCode());

        ArrayList<Integer> number5 = new ArrayList<>();
        number5.add(14);
        number5.add(12);
        number5.add(13);
        System.out.println("number5.hashCode() = " + number5.hashCode());
        System.out.println("number1.hashCode() = " + number1.hashCode());


        System.out.println("\n// isEmpty() \\\\\\\\\\\\\\\\\\\\\\");

        ArrayList<Integer> number6 = new ArrayList<>();
        ArrayList<Integer> number7 = null;
        ArrayList<Integer> number8;
        System.out.println("number6.isEmpty() = " + number6.isEmpty());
        System.out.println("number7 = " + number7);
  //      System.out.println("number7.isEmpty() = " + (number7.isEmpty()));
//        System.out.println("number8 = " + number8);
//        System.out.println("number8.isEmpty() = " + number8.isEmpty());


        System.out.println("\n// remove() \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        number5.add(14);
        System.out.println("number5 = " + number5);

        number5.remove(1); // INDEX!!!
        System.out.println("number5 = " + number5);

        number5.remove(Integer.valueOf(14)); // OBJECT
        System.out.println("number5 = " + number5);

        number5.remove((Integer)13); // OBJECT
        System.out.println("number5 = " + number5);

        System.out.println("\n// removeAll() \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("number2 = " + number2);
        System.out.println("number1 = " + number1);
        number2.removeAll(number1);
        System.out.println("number2 = " + number2);
        System.out.println("number1 = " + number1);
    }


}
