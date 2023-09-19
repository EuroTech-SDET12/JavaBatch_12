package com.days.day33;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int number = 10;
        //            monday  tuesday  wednesday thursday friday
        // Emre         4        3        7         5       6
//        int[] javaHoursEmre = {4, 3, 7, 5, 6};
        int[] javaHoursEmre = new int[5];
        javaHoursEmre[0] = 4;
        javaHoursEmre[1] = 3;
        javaHoursEmre[2] = 7;
        javaHoursEmre[3] = 5;
        javaHoursEmre[4] = 6;
        System.out.println("Arrays.toString(javaHoursEmre) = " + Arrays.toString(javaHoursEmre));


        //            monday  tuesday  wednesday thursday friday
        // Emre         4        3        7         5       6
        // Gylych       5        4        6         2       7
        // Erkan        6        5        2         3       4

//Array of the Arrays
        int[][] javaHours = {
                {4, 3, 7, 5, 6},//first row   0
                //           0  1  2  3  4   column
                {5, 4, 6, 2, 7},//second row  1

                {6, 5, 2, 3, 4}//third row    2
//               0  1  2  3  4
        };
        System.out.println("javaHours.length = " + javaHours.length);
        System.out.println("javaHours[0][2] = " + javaHours[0][2]);//7
        System.out.println("javaHours[0][4] = " + javaHours[0][4]);
//        System.out.println("javaHours[1][5] = " + javaHours[1][5]);ArrayIndexOutOfBoundsException:
        System.out.println("javaHours[1][4] = " + javaHours[1][4]);
        System.out.println("javaHours[2][0] = " + javaHours[2][0]);
        System.out.println("javaHours[2][4] = " + javaHours[2][4]);
        System.out.println("Arrays.toString(javaHours[0]) = " + Arrays.toString(javaHours[0]));
        System.out.println("Arrays.toString(javaHours[1]) = " + Arrays.toString(javaHours[1]));
        System.out.println("Arrays.toString(javaHours[2]) = " + Arrays.toString(javaHours[2]));

        System.out.println("Arrays.deepToString(javaHours) = " + Arrays.deepToString(javaHours));
//        System.out.println("javaHours[3] = " + javaHours[3]);ArrayIndexOutOfBoundsException:

//        for (int i = 0; i < javaHoursEmre.length; i++) {
        for (int i = 0; i < 5; i++) {
//            System.out.println(i);//0 1 2 3 4
            System.out.println("javaHoursEmre[i] = " + javaHoursEmre[i]);
        }

        System.out.println("===================");
//            javaHours[0][]
//            javaHours[1][]
//            javaHours[2][]
        for (int i = 0; i < javaHours.length; i++) {// outer loop row count
//            System.out.println( i);//0 1 2
            for (int n = 0; n < 5; n++) {//column count
                System.out.print(javaHours[i][n] + " ");
            }
            System.out.println();
        }


    }

}
