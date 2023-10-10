package com.days.day46.InterestSample;

public class Bank { // PARENT!!

   private float interestRate;

    public Bank(float interestRate) {
        this.interestRate = interestRate;
    }

    public void getInterestRate(){
        System.out.println("this.interestRate = "
                + this.interestRate);
    }


}
