package com.days.day39;

public class BankTest {

    public static void main(String[] args) {

        Bank user1 = new Bank();
//        user1.accountId= 1000;
//        user1.accountType="Pound";

        user1.setAccountId(1000);
        user1.setAccountId(10000);
        System.out.println("user1.getAccountId() = " + user1.getAccountId());

        user1.setAccountType("Gold");
        System.out.println("user1.getAccountType() = " + user1.getAccountType());

        user1.setBalance(1111);
        System.out.println("user1.getBalance() = " + user1.getBalance());
    }
}
