package com.days.day34;

import java.util.Arrays;

public class ArrayQuestions {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 25, 20, 35, 100, 200, 60, 70, 3};
        //max value?
        int max = 0;
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[numbers.length-1] = " + numbers[numbers.length - 1]);
        String str = "Hello Ali";
        System.out.println("str.substring(0,5) = " + str.substring(0, 5));
        System.out.println("str = " + str);


        String copyStr = str;
        System.out.println("copyStr = " + copyStr);//Hello ALi
        str = "Hello Veli";
        System.out.println("copyStr = " + copyStr);//Hello ALi
        System.out.println("str = " + str);//Hello Veli

        int[] copyArray = numbers;//Arrays are mutable  but Strings are immutable
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Arrays.toString(copyArray) = " + Arrays.toString(copyArray));
        copyArray[0] = 50;
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Arrays.toString(copyArray) = " + Arrays.toString(copyArray));
        makeFirstElement10(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Arrays.toString(copyArray) = " + Arrays.toString(copyArray));


        numbers = new int[]{10, 5, 25, 20, 35, 100, 200, 60, 70, 3};
        int[] copiedArray;
        copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Arrays.toString(copiedArray) = " + Arrays.toString(copiedArray));

        //find even and odd numbers
        int evenCounter = 0;
        int oddCounter = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
                evenCounter++;
            } else {
                System.out.println(number + " is an odd number.");
                oddCounter++;
            }
        }
        System.out.println("evenCounter = " + evenCounter);
        System.out.println("oddNumbers = " + oddCounter);
        int[] evenNumbers = new int[evenCounter];
        int[] oddNumbers = new int[oddCounter];
        int n = 0;
        int x = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers[n] = num;
                n++;
            } else {
                oddNumbers[x] = num;
                x++;
            }
        }
        System.out.println("Arrays.toString(evenNumbers) = " + Arrays.toString(evenNumbers));
        System.out.println("Arrays.toString(oddNumbers) = " + Arrays.toString(oddNumbers));

    }

    public static void makeFirstElement10(int[] numbers) {
        numbers[0] = 800;
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
    }

}
