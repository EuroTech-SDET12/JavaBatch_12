package com.days.day51.BankProject;

public class BankTest {

    public static void main(String[] args) {

//        CentralBank c1 = new CentralBank();

        Akbank gold1 = new Akbank("Gold",5000);

        System.out.println("Gold 1 Account type: "+ gold1.getAccountType());
        System.out.println("Gold 1 Current balance: "+ gold1.getCurrentBalance());
      //  gold1.currentBalance =1000000;
        System.out.println("gold1.isAccountClose() = " + gold1.isAccountClose());
        System.out.println("gold1.getDepositBonus() = " + gold1.getDepositBonus());
        gold1.deposit(1000);
        gold1.deposit(2000);
        gold1.deposit(-2000);
        gold1.withdraw(2000);
        gold1.withdraw(130);
        gold1.withdraw(-2000);

        // TODO THERE IS A BUG in HERE
        //   LIMIT withdraw value according to balance!!

        gold1.withdraw(12000);

        gold1.closeAccount();


    }
}
