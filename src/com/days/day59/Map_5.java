package com.days.day59;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Map_5 {
    public static void main(String[] args) {
        //Key-->country  Value-->cities
        // country --->  4 cities
        // UK ---> London Leeds Manchester Newcastle
        //Germany--> Berlin Munich Hamburg Bremen
        //Italy  --> Milano Roma Genoa Verona

        Map<String, ArrayList<String>> citiesOfCountry = new TreeMap<>();
        ArrayList<String> ukCities = new ArrayList<>(Arrays.asList("London", "Leeds", "Manchester", "Newcastle", "Leicester"));
        citiesOfCountry.put("UK", ukCities);
        ArrayList<String> germanCities = new ArrayList<>(Arrays.asList("Berlin", "Munich", "Hamburg", "Bremen"));
        citiesOfCountry.put("Germany", germanCities);
        ArrayList<String> italyCities = new ArrayList<>(Arrays.asList("Milano", "Roma", "Geneo", "Verona"));
        citiesOfCountry.put("Italy", italyCities);
        System.out.println("citiesOfCountry = " + citiesOfCountry);

        System.out.println("citiesOfCountry.get(\"Germany\") = " + citiesOfCountry.get("Germany"));
        System.out.println("citiesOfCountry.get(\"UK\") = " + citiesOfCountry.get("UK"));


        //  uk premier clubs --->   arsenal chelsea newcastle liverpool
        // bundesliga clubs --->   bayern munich werder bremen stutgart
        // laliga
        // clubs of country

        // try to find example
        Map<String, Map<String, ArrayList<String>>> dataOfCountry = new TreeMap<>();
        dataOfCountry.put("Cities", citiesOfCountry);
        Map<String, ArrayList<String>> clubsOfCountry=new TreeMap<>();
        dataOfCountry.put("FootballClubs", clubsOfCountry);
    }
}
