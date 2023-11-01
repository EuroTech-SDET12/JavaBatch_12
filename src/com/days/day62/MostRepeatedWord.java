package com.days.day62;

import java.util.*;

public class MostRepeatedWord {

    public static void main(String[] args) {
        String[]input = {"A","A","A","A","B","B","B","C","C","C","C","C","C","E"};
        getMostRepeatedWord(input);
    }

    public static int getMostRepeatedWord(String[]input){

        // Array to list
        // then find the unique element
        // then use frequency method to find each's counts
        // then return max count!!
        System.out.println("Arrays.toString(input) = " + Arrays.toString(input));
        List<String> inputList = List.of(input);
        System.out.println("inputList = " + inputList);

        Set<String> inputSet= new HashSet<>(List.of(input));
        System.out.println("inputSet = " + inputSet);

        if (input.length == 1 || inputSet.size() == input.length) {
            return 1;
        } else if (inputSet.size() == 1) { // if all item in input are same!!
            return input.length;
        }


        int maxCount = 0;
        String maxRepeatedWord="";
        for (String s : inputSet) {
           if( Collections.frequency(inputList,s)> maxCount){
             maxCount = Collections.frequency(inputList,s);
             maxRepeatedWord = s;
           }
        }

        System.out.println("MAX COUNT IS " + maxCount + " and MAX REPEATED WORD IS " + maxRepeatedWord);
        return  maxCount;
    }



    public static int getMostRepeatedWord2(String[]input){
        Set<String> setInput = new TreeSet<>(List.of(input));

        if (input.length == 1 || setInput.size() == input.length) {
            return 1;
        } else if (setInput.size() == 1) { // if all item in input are same!!
            return input.length;
        }


        Map<String, Integer> inputMap = new HashMap<>();

        for (String d : input) {
            if (inputMap.containsKey(d)) {   // d is already exist in my inputmap
                inputMap.put(d, inputMap.get(d) + 1); // update d value , get exist value and add 1
            } else {  // d is not exist in container, it is first time we are adding it
                inputMap.put(d, 1);
            }
        }

        int max = Collections.max(inputMap.values());

        for (Map.Entry<String, Integer> entry:inputMap.entrySet()){
            if(entry.getValue().equals(max)){
                System.out.println(entry.getKey()); // to get max number department name!!
            }
        }

        return max;

    }

}
