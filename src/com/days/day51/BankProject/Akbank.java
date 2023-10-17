package com.days.day51.BankProject;

public class Akbank extends CentralBank {


    public Akbank(String accountType, double currentBalance) {
        super("Akbank", accountType.toUpperCase(), currentBalance,120);
        switch (accountType.toUpperCase()){
            case "GOLD":
                setDepositBonus(80);
                setWithdrawExpense(70);
                setReturnRate(1.3);
                break;
            case "SAVING":
                setDepositBonus(90);
                setWithdrawExpense(60);
                setReturnRate(1.2);
                break;
            case "INTEREST":
                setDepositBonus(100);
                setWithdrawExpense(50);
                setReturnRate(1.1);
                break;
            default:
                System.out.println("INVALID ACCOUNT TYPE!!");
                // TODO Group study - try to handle this switch case more dynamic in only parent class!!!!!
        }
    }

    @Override
    public void deposit(double depositValue) {
        if( depositValue<2000){
            super.deposit(depositValue);
        } else{ // I have to add deposit bonus before send the value to parent!!
            super.deposit(depositValue + getDepositBonus() );
        }
    }

    @Override
    public void withdraw(double withdrawValue) {
        if( withdrawValue<1000){
            super.withdraw(withdrawValue);
        } else{ // I have to add withdraw expense before send the value to parent!!
            super.withdraw(withdrawValue + getWithdrawExpense() );
        }
    }
}
