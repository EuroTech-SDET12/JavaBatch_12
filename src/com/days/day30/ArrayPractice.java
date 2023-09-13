package com.days.day30;

import java.util.Arrays;

public class ArrayPractice {


    public static void main(String[] args) {


        double invoiceAmount1 = 115.5;
        double invoiceAmount2 = 125.5;
        double invoiceAmount3 = 135.5;
        double invoiceAmount4 = 145.5;
        double invoiceAmount5 = 155.5;
//

        // DECLARE AN ARRAY
        //   double[] invoiceAmounts;  //double invoiceAmounts[];

        // CREATE ARRAY
        // 1. WAY

        double[] invoiceAmounts = new double[5];  //

        // to print array elements use Arrays.toString()
        System.out.println("Arrays.toString(invoiceAmounts) = " + Arrays.toString(invoiceAmounts));

        int[] numbers = new int[3];  // [ 0 , 0 , 0]
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        //arrayName[index] = value!!
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        // numbers[3] = 111;  Array size is fixed and it is 3, so you cannot add 3.index (4. element)
        numbers[0] = 111;
//        numbers[1] = 11.5;  NO! 11.5 is double and our array data type is INT!!!
        byte testByte = 11;
        numbers[1] = testByte;  // no problem, implicitly handle by Java, widening
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));


        System.out.println("////////////////////////////// \n");
        // CREATE ARRAY
        // 2. WAY

        int[] values = {};
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));

        //String[] names = new String[5];
        String[] names = {"Tirkish", "Erkan", "Emre", "Gylychmyrat", "Pooja"}; // 5 name string elements


        names[2] = "Emre Simsek";  // index 2 is belongs to 3. element of names array!!!

        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));


        // SIZE OF THE ARRAY

        System.out.println("names.length = " + names.length);

        int[] test;
        //   test[0]= 1;
        //   System.out.println("test.length = " + test.length);

        int[] test2 = {};
        System.out.println("test2.length = " + test2.length);// 0!!!
//      System.out.println("test2[0] = " + test2[0]); NO ! there is NO ELEMENT!!!



    }
}
