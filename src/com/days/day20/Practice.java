package com.days.day20;

public class Practice {

    public static void main(String[] args) {



      //  printNumbers(1,10);

        printMultiplicationTable(3,9);


    }
/**
     Create a method to print numbers for given values
     Input : Start = 1  End = 10
     Output: 1,2,3,4,5,6,7,8,9,10  (Print numbers with comma separation)
     Input : Start = -1  End = 4
     Output: -1,0,1,2,3,4 (Print numbers with comma separation)
 **/
    public static void printNumbers(int start, int end){
//        for (int i=start; i<= end ; i++ ){
//            if(i!=end){
//                System.out.print(i+ ", ");
//            } else { // i == end
//                System.out.print(i);
//            }
//        }
        int num = start;
        while(true){
            System.out.print(num);
            if(++num > end ){
                break;
            }
            System.out.print(", ");
        }
    }
    /**
     Write a method to print given numbers multiplication table value
     INPUT: Number = 3 , limit = 9

     OUTPUT:  1 x 3 = 3 ,   (PUT SPACE AND COMMA SEPARATION BESIDE LAST LINE!!!)
              2 x 3 = 3 ,
                ...
              9 X 3 = 27
     */

    public static void printMultiplicationTable(int number, int limit){

        for (int i= 1 ; i<= limit ; i++) {
            if(i != limit) {
                System.out.println(i + " x " + number + " = " + (i * number) + " ,");
            } else { //i == limit
                System.out.println(i + " x " + number + " = " + (i * number));
            }
        }
    }

    /**
     * Task 1: Write a java method to print a multiplication table to given limit in reverse order for given number.

     * Task 2: Write a java method to find the factorial of a given number using for loops.
     */



}
