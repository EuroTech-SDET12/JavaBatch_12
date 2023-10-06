package com.days.day44;

import java.time.LocalDate;

public class BankAccount {

    private String holderName;
    private int birthYear;
    private char gender;
    private String city;
    private double amount;//belong to instance, person
    private static double wholeBankAmount;//this amount is not belong to person , it is belong to bank

    BankAccount(String name, int year, char gender, String city, double deposit) {
        this.holderName = name;
        birthYear = year;
        this.gender = gender;
        this.city = city;
        amount = deposit;
        wholeBankAmount += deposit;
    }

    BankAccount() {

    }

    public String getHolderName() {
        return holderName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    //the account holder wants to put money into the personal account
    public void putMoneyIntoAccount(double money) {
        this.amount = this.amount + money;
        wholeBankAmount = wholeBankAmount + money;
        //               2000        500   =2500
    }

    public void withdrawMoneyFromAccount(double money) {
        if (money > amount) {
            System.out.println(holderName + " sorry you dont have enough money in your account, pls enter different amount!!!");
        } else {
            this.amount = amount - money;
            wholeBankAmount = wholeBankAmount - money;
            System.out.println("Wait a minute "+holderName+" pls, you will receive " + money + " then your balance is : "+ amount);
        }

    }


    public double getAmount() {//if the user wants to learn how much money user has in the account
        return this.amount;
    }

    public static double getWholeBankAmount() {
        return wholeBankAmount;
    }

    // date =2023-10-06
    // Ronaldo , you have 5000 in your account.
    public void printData() {
        LocalDate date = LocalDate.now();
        System.out.println("date = " + date);
        System.out.println(holderName + ", you have " + amount + " in your account.");
    }


}
