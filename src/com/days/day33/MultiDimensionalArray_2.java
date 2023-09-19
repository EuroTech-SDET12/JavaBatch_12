package com.days.day33;

import java.util.Arrays;

public class MultiDimensionalArray_2 {
    public static void main(String[] args) {
        //            monday  tuesday  wednesday thursday friday
        // Emre         4        3        7         5       6     row index  0
//        column index  0        1        2         3       4
        // Gylych       5        4        6         2       7
        // Erkan        6        5        2         3       4

        int[][] javaHours = new int[3][5];
        javaHours[0][0] = 4;
        javaHours[0][1] = 3;
        javaHours[0][2] = 7;
        javaHours[0][3] = 5;
        javaHours[0][4] = 6;
        System.out.println("Arrays.deepToString(javaHours) = " + Arrays.deepToString(javaHours));
        javaHours[1][0] = 5;
        javaHours[1][1] = 4;
        javaHours[1][2] = 6;
        javaHours[1][3] = 2;
        javaHours[1][4] = 7;
        System.out.println("Arrays.deepToString(javaHours) = " + Arrays.deepToString(javaHours));
        javaHours[2][0] = 6;
        javaHours[2][1] = 5;
        javaHours[2][2] = 2;
        javaHours[2][3] = 3;
        javaHours[2][4] = 4;
        System.out.println("Arrays.deepToString(javaHours) = " + Arrays.deepToString(javaHours));
        System.out.println("javaHours[0].length = " + javaHours[0].length);
        System.out.println("javaHours[1].length = " + javaHours[1].length);
        System.out.println("javaHours[2].length = " + javaHours[2].length);
        for (int row = 0; row < javaHours.length; row++) {//outer loop row count

            for (int column = 0; column < javaHours[row].length; column++) {
                System.out.print(javaHours[row][column] + " ");
            }
            System.out.println();

        }
    }

}
