package com.days.day51.BankProject;

public class Karabank extends CentralBank{


    public Karabank( String accountType, double currentBalance) {
        super("Karabank", accountType, currentBalance,100);
        switch (accountType){
            case "GOLD":
                setDepositBonus(80);
                setWithdrawExpense(90);
                setReturnRate(1.4);
            case "SAVING":
                setDepositBonus(100);
                setWithdrawExpense(70);
                setReturnRate(1.1);
            case "INTEREST":
                setDepositBonus(90);
                setWithdrawExpense(80);
                setReturnRate(1.2);
            default:
                System.out.println("INVALID ACCOUNT TYPE!!");
                // TODO Group study!!
        }
    }

    @Override
    public void deposit(double depositValue) {
        if( depositValue<3000){
            super.deposit(depositValue);
        } else{ // I have to add deposit bonus before send the value to parent!!
            super.deposit(depositValue + getDepositBonus() );
        }
    }

    @Override
    public void withdraw(double withdrawValue) {
        if( withdrawValue<2000){
            super.withdraw(withdrawValue);
        } else{ // I have to add withdraw expense before send the value to parent!!
            super.withdraw(withdrawValue + getWithdrawExpense() );
        }
    }
}
