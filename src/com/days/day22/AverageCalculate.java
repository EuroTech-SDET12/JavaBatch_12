package com.days.day22;

public class AverageCalculate {

    public static void main(String[] args) {
        double test =averageCalculator(1,2,2);
        System.out.println("test = " + test);
    }
    /**
     * Write a method to calculate given 3 numbers average and return it as double !
     */

    public static double averageCalculator(int num1, int num2, int num3){

        double returnValue = (num1+num2+num3)/3.0;  // int/double -> double!!!

      //  1 2 2 -> 5/3  1.666666666666..  1.0!!!
        return  returnValue;
    }
}
