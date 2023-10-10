package com.days.day46.InterestSample;

public class AXIS extends Bank{

    float interestRate = 0.09f;

    public AXIS(float interestRate) {
        super(interestRate);
    }

    @Override
    public void getInterestRate() {
        super.getInterestRate();
    }

    public void printClassName(AXIS axis){
        System.out.println("axis.getClass().getName() = " + axis.getClass().getName());
    }

}
