package com.days.day37;

public class BankAccount {

    //DATA_FIELDS
    String bankName = "ABC";
    String accountType;
    String accountOwner;
    int accountNumber;
    double balance;
    boolean isAccountActive; //= false

   public static int totalAccountCount;


    // Cons
    public BankAccount(){
        System.out.println("Welcome "+bankName+" Bank! Your Account is ready to use!");
        isAccountActive = true;
        BankAccount.totalAccountCount++;
        accountOwner = "Will Smith";
    }

    // METHODS
    public void withdraw(double withdrawAmount){
        balance -= withdrawAmount; //balance = balance - withdrawAmount;
    }

}
