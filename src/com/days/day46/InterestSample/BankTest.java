package com.days.day46.InterestSample;

public class BankTest {


    public static void main(String[] args) {
        AXIS a1 = new AXIS(0.09f);
        a1.getInterestRate();
        a1.printClassName(a1);

        SBI s1 = new SBI(0.08f);
        s1.getInterestRate();
    }
}
