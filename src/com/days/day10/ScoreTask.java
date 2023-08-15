package com.days.day10;

public class ScoreTask {

    public static void main(String[] args) {
        double balance = 120;
        int score =6 ;

        if (score>= 8) { // FATHER
            balance += 50;
        }
//       else { // if father not giving a money, then uncle should be able to give!!
//
//        }

        if(score>6){ // UNCLE
            balance+=20;

        } else{
            balance-=10;
        }


        System.out.println("balance = " + balance);
    }
}
