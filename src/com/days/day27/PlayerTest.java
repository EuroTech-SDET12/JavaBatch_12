package com.days.day27;

public class PlayerTest {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.makeTraining();// null   is training
        player1.name = "Zidane";
        player1.makeTraining();//zidane is training

        Player player2 = new Player();
        System.out.println("player2.name = " + player2.name);
        player2.name = "Ronaldo";
        player2.makeTraining();
        System.out.println("player1.trainingCounter = " + player1.trainingCounter);
        System.out.println("player2.trainingCounter = " + player2.trainingCounter);

        Player player3 = new Player();
        System.out.println("player3.clubName = " + player3.clubName);
        System.out.println("player2.clubName = " + player2.clubName);
        player2.clubName = "El Ittihad";
        System.out.println("player2.clubName = " + player2.clubName);
        player2.age = 39;
        System.out.println("player2.toString() = " + player2.toString());
        player1.age = 50;
        System.out.println("player1.toString() = " + player1.toString());

        player3.name = "Maradona";
        player3.age = 60;
        player3.clubName = "Napoli";
        String player3Values = player3.toString();
        System.out.println("player3Values = " + player3Values);


    }
}
