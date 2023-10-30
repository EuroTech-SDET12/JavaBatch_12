package com.days.day60;

import java.util.ArrayList;
import java.util.Arrays;

public class ListTest {
    public static void main(String[] args) {
        ListQuestions questions = new ListQuestions();
//        questions.evenNumbersInList();

        ArrayList<String> nbaResult = new ArrayList<>();
        nbaResult.add("Chicago Bulls-LaLakers : 120-115");
        nbaResult.add("Detroit -Orlando : 100-117");
        nbaResult.add("Clippers-Toronto : 91-99");
        nbaResult.add("Portland-Boston : 127-115");
        nbaResult.add("Knicks-Wizards : 130-114");
        // get numbers(results) from elements , put into an arraylist as integer
        // 120, 115, 100, 117......
        String str = "Chicago Bulls-LaLakers : 120-115";
        String[] splitedString = str.split(": ");
        System.out.println("split[1] = " + splitedString[1]);
        String[] numbersString = splitedString[1].split("-");
        System.out.println("Arrays.toString(numbersString) = " + Arrays.toString(numbersString));
//convert a string to integer
        int first = Integer.parseInt(numbersString[0]);
        int second = Integer.parseInt(numbersString[1]);
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        ArrayList<Integer> resultsNumbers = new ArrayList<>();
        for (String str1 : nbaResult) {
            String[] splitedString1 = str1.split(": ");
            String[] numbersString1 = splitedString1[1].split("-");
            //convert a string to integer
            int first1 = Integer.parseInt(numbersString1[0]);
            int second1 = Integer.parseInt(numbersString1[1]);
          resultsNumbers.add(first1);
          resultsNumbers.add(second1);
        }
        System.out.println("resultsNumbers = " + resultsNumbers);
    }
}
