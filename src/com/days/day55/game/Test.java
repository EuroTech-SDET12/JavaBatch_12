package com.days.day55.game;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        FootballPlayer footballPlayer1 = new FootballPlayer("Benzema", 1985, 'M',
//                "Lyon", "Real Madrid", "Football");
                "Lyon", Teams.REALMADRID, "Football");
        footballPlayer1.eating();

        BasketPlayer basketPlayer = new BasketPlayer("Curry", 1990, 'M',
//                "New York", "Golden State", "Basketball");
                "New York", Teams.GOLDENSTATEWARRIORS, "Basketball");
        basketPlayer.eating();
        footballPlayer1.training();
        basketPlayer.training();
        footballPlayer1.attack();

        FootballPlayer footballPlayer2 = new FootballPlayer("Junior", 1999,
//                'M', "Madrid", "Real Madrid", "Football");
                'M', "Madrid", Teams.REALMADRID, "Football");

        ArrayList<FootballPlayer> playersList = new ArrayList<>();
        playersList.add(footballPlayer1);
        playersList.add(footballPlayer2);
        System.out.println("playersList.get(0).name = " + playersList.get(0).name);
        System.out.println("playersList.get(1).name = " + playersList.get(1).name);

        String teamName = Teams.REALMADRID.toString();
        System.out.println("teamName = " + teamName);
        System.out.println("GameBranches.FOOTBALL = " + GameBranches.FOOTBALL);
    }
}
