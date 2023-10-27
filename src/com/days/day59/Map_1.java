package com.days.day59;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_1 {
    public static void main(String[] args) {
        HashMap<String, Integer> players = new HashMap<>();
//        Type argument cannot be of primitive type
//        "Ali"-- > 10
//        "Ronaldo"-- > 7
//        "Saka"-- > 4
//        "Gomes"-- > 11
        players.put("Ali", 10);
        players.put("Ronaldo", 7);
        players.put("Saka", 4);
        players.put("Gomes", 11);
        players.put("Zidane", 5);
// not keeping insertion order
        System.out.println("players = " + players);
        players.put("Ronaldo", 9);
        System.out.println("players = " + players);
        //duplicate key is not accepted
        players.put("Henry", 9);
        System.out.println("players = " + players);
        //duplicate value is accepted
        players.put("Jesus", 9);
        System.out.println("players = " + players);
        players.put("Ronaldo", 20);
        System.out.println("players = " + players);
        System.out.println("players.containsKey(\"Henry\") = " + players.containsKey("Henry"));

        if (!players.containsKey("Messi")) {
            players.put("Messi", 6);
        }
        System.out.println("players = " + players);

        if (!players.containsKey("Gomes")) {
            players.put("Gomes", 8);
        }
        System.out.println("players = " + players);
        players.put("Gomes", 8);
        System.out.println("players = " + players);
        System.out.println("players.get(\"Jesus\") = " + players.get("Jesus"));
        System.out.println("players.get(\"Saka\") = " + players.get("Saka"));
        //a view of the values contained in this map
        System.out.println("players.values() = " + players.values());
        System.out.println("players.keySet() = " + players.keySet());
        Set<String> keyS = players.keySet();
        for (String key : keyS) {
            System.out.println(key + " = " + players.get(key));
        }
    }
}
