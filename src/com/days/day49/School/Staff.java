package com.days.day49.School;

import com.days.day37.BankAccount;

public class Staff extends SchoolAdmin{

    int staffID;
    String department;

    public Staff(String name, int dob_year, char gender, String staffType) {
        super(name, dob_year, gender, staffType);
        super.registrationFee = 510;
    }

    public void prepareFiles(){
        System.out.println("Files on the way...");
    }


    @Override
    public void registration() {
        System.out.println("Staff registration selected!!");
        super.registration();
    }

    public static void main(String[] args) {
        System.out.println("BankAccount.totalAccountCount = " + BankAccount.totalAccountCount);
    }
}
