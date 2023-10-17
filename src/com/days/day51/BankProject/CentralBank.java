package com.days.day51.BankProject;

public abstract class CentralBank {

    // FIELDS \\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    private String bankName;

    private String accountType; // GOLD, SAVING, INTEREST

    private double currentBalance;
    private double finalBalance; // calculate this when close the account with return rate

    private double depositBonus;
    private double withdrawExpense;
    private double returnRate;

    private double welcomeMoney;

    private boolean isAccountClose = true;

    // CONS \\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public CentralBank(String bankName, String accountType, double currentBalance,double welcomeMoney) {
        this.bankName = bankName;
        this.accountType = accountType;
        this.welcomeMoney = welcomeMoney;
        this.currentBalance = currentBalance + welcomeMoney;
        this.isAccountClose = false;


   }

    //GETTERS \\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public String getBankName() {
        return bankName;
    }
    public String getAccountType() {
        return accountType;
    }
    public double getCurrentBalance() {
        return currentBalance;
    }
    public double getFinalBalance() {
        return finalBalance;
    }
    public double getDepositBonus() {
        return depositBonus;
    }
    public double getWithdrawExpense() {
        return withdrawExpense;
    }
    public double getReturnRate() {
        return returnRate;
    }
    public double getWelcomeMoney() {
        return welcomeMoney;
    }
    public boolean isAccountClose() {
        return isAccountClose;
    }

    //SETTERS \\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public void setDepositBonus(double depositBonus) {
        this.depositBonus = depositBonus;
    }

    public void setWithdrawExpense(double withdrawExpense) {
        this.withdrawExpense = withdrawExpense;
    }

    public void setReturnRate(double returnRate) {
        this.returnRate = returnRate;
    }


    // FUNCTIONS \\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void deposit(double depositValue){

        if(depositValue>0) {
            this.currentBalance += depositValue;
            System.out.println("You were deposit " + depositValue + " to your " + getAccountType() + " account");
            // TODO use like below code print if there is bonus !!!
            //System.out.println("You were deposit " + (depositValue-getDepositBonus()) +"+ (" +getDepositBonus()+" BONUS )"+ " to " + "your " + getAccountType());
            System.out.println("Your current balance after deposit is: "+ getCurrentBalance());
        } else{
            System.out.println("INVALID/NEGATIVE deposit value!\n " +
                    "Transaction cancelled! Please try again");
// TODO Make this more dynamic!!
//  Try to give a change to user enter a valid amount!! (While loop + Scanner!!)
// TODO EXTRA CHALLENGE : set a limit re enter amount to user! if exist 3 input, then
//  block users account!!  to block need to add another isAccountBlock field. and all the
//  existing functions should check this, if it is true, no func should work!!!
        }

    }

    public void withdraw(double withdrawValue){
        if(withdrawValue>0 || withdrawValue <= this.currentBalance) {
            this.currentBalance -= withdrawValue;
            System.out.println("You were withdraw " + withdrawValue + " to " +
                    "your " + getAccountType());
            System.out.println("Your current balance after withdraw is: "+ getCurrentBalance());
        } else{
            System.out.println("INVALID/NEGATIVE withdraw value!\n " +
                    "Transaction cancelled! Please try again");
// TODO Make this more dynamic!!
//  Try to give a change to user enter a valid amount!!
        }
    }


    public void closeAccount(){
        // TODO When user call this method, before close the account
        //  ask again Are you sure? if user only say YES then close it!!
        if(this.isAccountClose){
            System.out.println("!!!! Account is ALREADY Close !!!!");
        } else{
            System.out.println(" \t\t******** ACCOUNT CLOSE PROCESS START  **********");
            this.isAccountClose = true;
            this.finalBalance = currentBalance * this.returnRate;
            this.currentBalance = 0;
            System.out.println("Your FINAL Balance is : "  + this.finalBalance);
            System.out.println("\t\t!!!!!!!!  YOUR "+getAccountType()+" ACCOUNT CLOSED    !!!!!!!!");
        }

        // TODO Create some mandatory policy rules for each sub class!!
        //  they have to create a their own policy function!!


    }










}
