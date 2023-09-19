package com.days.day33;

import java.util.Arrays;

public class MultiDimensional_3 {
    public static void main(String[] args) {
        //Champions League

        //England        Manchester City,  Man.United ,  Arsenal,  NewCastle United
        //Turkey         Galatasaray,      Besiktas
        //Germany        Bayern Munich,     Leipzig,  Union Berlin
        //Italy          Milan,             Inter ,   Lazio

        String[][] champions = {
                {"Manchester City", "Man.United", "Arsenal", "NewCastle United"},//row index 0
                {"Galatasaray", "Besiktas"},// row index 1
                {"Bayern Munich", "Leipzig", "Union Berlin"},
                {"Milan", "Inter", "Lazio"}
        };
        System.out.println("champions[0].length = " + champions[0].length);
        System.out.println("champions.length = " + champions.length);
        System.out.println("Arrays.deepToString(champions) = " + Arrays.deepToString(champions));
        System.out.println("champions[3][1] = " + champions[3][1]);//inter
        System.out.println("champions[2][0] = " + champions[2][0]);
        champions[3][2] = "Atalanta";
        System.out.println("Arrays.deepToString(champions) = " + Arrays.deepToString(champions));


        String[] teams[] = new String[4][];
        teams[0] = new String[4];
        teams[1] = new String[]{"GAlatasaray", "Besiktas"};
        teams[2] = new String[3];
        teams[3] = new String[3];
        System.out.println("Arrays.deepToString(teams) = " + Arrays.deepToString(teams));


        //3 dimensional array
        //            monday  tuesday  wednesday thursday friday
        // Emre         4        3        7         5       6     row index  0
//        column index  0        1        2         3       4
        // Gylych       5        4        6         2       7
        // Erkan        6        5        2         3       4


        //            monday  tuesday  wednesday thursday friday
        // Emre         2        5       8         4      10     row index  0
        // Gylych       10       8        3         9       6
        // Erkan        9        4        6         7       5
        // Mehmet       8        3        7         10       4
        int[][][] tables = {
//                first table
                {
                        //first table first row
                        {
                                4, 3, 7, 5, 6
                        },
                        //first table second row
                        {
                                5, 4, 6, 2, 7
                        },
                        {
                                6, 5, 2, 3, 4
                        },


                },
                //second table
                {
                        {2, 5, 8, 4, 10}, {}, {}, {}


                }


        };
        System.out.println("Arrays.deepToString(tables) = " + Arrays.deepToString(tables));
    }
}
