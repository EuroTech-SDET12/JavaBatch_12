package com.days.day37;

public class BankAccountTest {

    public static void main(String[] args) {

        // Request-1 Whenever I create a new account, I would like to print
        // "Welcome ABC Bank! Your Account is ready to use!"
            /* Request-2
        I don't want to initialize bankName abd isAccountActive field
        manually. Because bankname is the same for all my accounts, and
        whenever I create an account, it will be active !!
         */
          /* Request-3
        I want to count my total account object number and want to get it!!
        It should be done automatically!!

        if I create 5 object, this count give me 5 !!
         */

        BankAccount golden = new BankAccount();

        //golden.totalAccountCount++;
//        BankAccount.totalAccountCount++;

        BankAccount euro = new BankAccount();

        //euro.totalAccountCount++;
//        BankAccount.totalAccountCount++;

        BankAccount dollar = new BankAccount();
//        BankAccount.totalAccountCount++;

        System.out.println("golden.isAccountActive = " + golden.isAccountActive);
        System.out.println("golden.bankName = " + golden.bankName);

        System.out.println("Total accountCount = " + BankAccount.totalAccountCount);

        System.out.println("dollar.accountOwner = " + dollar.accountOwner);


    }
}
