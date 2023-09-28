package com.days.day39;

public class Bank {

    private int accountId;
    private String accountType;
    private double balance;

    /* TASK
    Create encapsulation for all data fields
    There are only 3 types of accounts: GOLD, EURO, COIN
    User must only update account types with these accounts
    Balance cannot be negative!!!
    Account id must be 5 digits!!
     */

    //GETTERS
    public int getAccountId(){
        return this.accountId;
    }
    public String getAccountType(){
        return this.accountType;
    }
    public double getBalance(){
        return this.balance;
    }

    //SETTERS
    public void setAccountId(int newId){
        if(newId > 9999 && newId <100000) {
            this.accountId = newId;
        } else {
            System.out.println("Wrong input id! Please enter 5 digit id number!");
        }

    }
    public void setAccountType(String newAccountType){
        newAccountType = newAccountType.toUpperCase();
        if(newAccountType.equals("GOLD") || newAccountType.equals("EURO") || newAccountType.equals("COIN")) {
            this.accountType = newAccountType;
        } else{
            System.out.println("WRONG Account Type, Please set again with valid account name!!");
        }
    }
    public void setBalance(double newBalance){
        if(newBalance > 0){
            this.balance = newBalance;
        } else {
            System.out.println("Balance cannot be negative!!");
        }
    }
}
