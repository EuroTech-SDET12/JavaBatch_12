package com.days.day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Monster {
    public static void main(String[] args) {
        ArrayList<String> monsterName1 = new ArrayList<>(Arrays.asList("Lazy", "Strong", "Fast", "Furious"));
        ArrayList<String> monsterName2 = new ArrayList<>(Arrays.asList("Wolf", "Hunter", "Lion", "Horse"));

        Random random = new Random();
        int indexMonst1 = random.nextInt(monsterName1.size());
        int indexMonst2 = random.nextInt(monsterName2.size());
        System.out.println("indexMonst2 = " + indexMonst2);
        System.out.println("indexMonst1 = " + indexMonst1);
        System.out.println(monsterName1.get(indexMonst1) + " " + monsterName2.get(indexMonst2));

        for (int i = 0; i < 10; i++) {
            indexMonst1 = random.nextInt(monsterName1.size());
            indexMonst2 = random.nextInt(monsterName2.size());
            System.out.println(monsterName1.get(indexMonst1) + " " + monsterName2.get(indexMonst2));
        }
    }

}
