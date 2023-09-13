package com.days.day30;

import java.util.Arrays;

public class ArrayPractice2 {


    public static void main(String[] args) {

        // ex1

        int[] array1 = {22, 22, 22, 44, 22};
        System.out.println("array1.length = " + array1.length); // 5
        System.out.println("array1[4] = " + array1[4]); // 22

        array1[3] = 22;
        System.out.println("array1.length = " + array1.length); // 5

        System.out.println("Arrays.toString(array1) = " + Arrays.toString(array1));
        // 22,22,22,22,22

        System.out.println("/////////////////////\n");
//        printArray();

        createOddNumberArray();
    }


    public static void printArray() {

        int[] numbers = {44, 23, 11, 10, 22};  //,33,5,6,66,77,88,34,22,1,22,44,55,666
        // INDEX = 0, 1, 2.............................................,numbers.length -1

        // sample output 44, 23, 11, 10

//        System.out.print(numbers[0] + ",");
//        System.out.print(numbers[1] + ",");
//        System.out.print(numbers[2] + ",");
//        System.out.print(numbers[3] );  .........
//        System.out.print(numbers[numbers.length-1])

        for (int i = 0; i <= numbers.length - 1; i++) {
//            System.out.println("numbers["+i+"] = " + numbers[i]);
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }


    }


    // Write a method: initialize 10 size array to assign ODD numbers between 11 and 30 via LOOPS!!
    // Sample Output to array print:  {11,13,15,17,19,21,23,25,27,29}
    // Sample Output to array( 1 to 20) print:  {1,3,5,7,9,11,13,15,17,19}

    public static void createOddNumberArray() {
        int[] oddArray = new int[10];
//                             index     value    value
//        oddArray[0]= 11;       0         1        11
//        oddArray[1]= 13;       1         3        13
//        oddArray[2]= 15;       2         5        15
//        oddArray[3]= 17;       3         7
//        .....
//        oddArray[10]= 29;

        for (int i = 0, j = 11; i <= oddArray.length - 1; i++, j += 2) {  // j+=2 => j=j+2
//            System.out.print("i = " + i);
//            System.out.println(" j = " + j);

            // i is my index , j is my values!!!
            oddArray[i] = j;
        }

        System.out.println("Arrays.toString(oddArray) = " + Arrays.toString(oddArray));
    }
}
