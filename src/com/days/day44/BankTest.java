package com.days.day44;

import java.time.LocalDate;

public class BankTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
//        System.out.println("account1.holderName = " + account1.holderName);
        BankAccount account2 = new BankAccount("Ali", 2000, 'm', "Istanbul", 2000);
//        System.out.println("account2.holderName = " + account2.holderName);
//        account2.holderName = "Veli";
        //want to read name data in this class
        System.out.println("account2.getHolderName() = " + account2.getHolderName());
        String city = "Izmir";
//        account2.setCity("Izmir");
        account2.setCity(city);
        System.out.println("account2.getCity() = " + account2.getCity());
        BankAccount account3 = new BankAccount("Mary", 1990, 'f', "Bremen", 4000);
//        System.out.println("BankAccount.wholeBankAmount = " + BankAccount.wholeBankAmount);
        BankAccount account4 = new BankAccount("Ronaldo", 1985, 'm', "Lisbon", 9000);
//        System.out.println("BankAccount.wholeBankAmount = " + BankAccount.wholeBankAmount);
//        BankAccount.wholeBankAmount = 10;
        account2.putMoneyIntoAccount(500);//total money int the whole bank should be 15500
        System.out.println(account2.getAmount());
        System.out.println("BankAccount.getWholeBankAmount() = " + BankAccount.getWholeBankAmount());
        account4.withdrawMoneyFromAccount(14000);
        account4.withdrawMoneyFromAccount(4000);
        System.out.println("account4.getAmount() = " + account4.getAmount());
        System.out.println("BankAccount.getWholeBankAmount() = " + BankAccount.getWholeBankAmount());
       account2.printData();
       account3.printData();
       account4.printData();
    }
}
