package com.days.day60;

import java.util.*;

public class MapsReview {
    public static void main(String[] args) {
        // key       &      value
        //player name & jersey  number       messi --> 10  zidane --> 5
        // country    & capitals
        // student name  & id              ali  505  veli  506
        // team       & players            chelsea  ---> 18 players name


        Map<String, Integer> studentIds = new HashMap<>();
        studentIds.put("atabeg", 501);
        studentIds.put("Emre", 502);
        studentIds.put("Erkan", 503);
        System.out.println("studentIds.get(\"Emre\") = " + studentIds.get("Emre"));
        System.out.println("studentIds.get(\"erkan\") = " + studentIds.get("erkan"));//null key doesnt match
        System.out.println("studentIds.get(\"Erkan\") = " + studentIds.get("Erkan"));
        String name = " Atabeg ";
        System.out.println("studentIds.get(name) = " + studentIds.get(name.trim().toLowerCase()));
        System.out.println("studentIds.get(name) = " + studentIds.get(name.toLowerCase().trim()));
        Set<String> keys = studentIds.keySet();
        System.out.println("keys = " + keys);
        for (String key : keys) {
            System.out.print(key + " = ");   // atabeg  = 501  Emre = 502 Erkan = 503
            System.out.println(studentIds.get(key));
        }
        System.out.println("studentIds.values() = " + studentIds.values());
        System.out.println("studentIds = " + studentIds);

        // java 4 java exams
        // map store these results
        // Nurettin ---> 90,86,95,98
        // Pooja ---> 95, 85,90,95
        // Kilic ---> 97,90,85,96
        Map<String, ArrayList<Integer>> javaResultsOfStudents = new LinkedHashMap();
        ArrayList<Integer> nurettinResults = new ArrayList<>(Arrays.asList(90, 86, 95, 98));
        javaResultsOfStudents.put("Nurettin", nurettinResults);
        javaResultsOfStudents.put("Pooja", new ArrayList<>(Arrays.asList(95, 85, 90, 95)));
        name = "Kilic";
        ArrayList<Integer> kilicResults = new ArrayList<>(Arrays.asList(97, 90, 85, 96));
        javaResultsOfStudents.put(name, kilicResults);
        System.out.println("javaResultsOfStudents = " + javaResultsOfStudents);
        System.out.println("Pooja exam results = " + javaResultsOfStudents.get("Pooja"));
        System.out.println("Nurettin exam results = " + javaResultsOfStudents.get("Nurettin"));
        System.out.println("Kilic exam results = " + javaResultsOfStudents.get("Kilic"));
        //whether Erkan is in the keys or not?
        System.out.println("javaResultsOfStudents.containsKey(\"Erkan\") = " + javaResultsOfStudents.containsKey("Erkan"));

        if (javaResultsOfStudents.containsKey("Erkan")) {
            System.out.println(javaResultsOfStudents.get("Erkan"));
        } else {
            javaResultsOfStudents.put("Erkan", new ArrayList<>(Arrays.asList(90, 97, 96, 93)));
        }
        System.out.println("javaResultsOfStudents = " + javaResultsOfStudents);
    }
}
