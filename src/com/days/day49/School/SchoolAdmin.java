package com.days.day49.School;

public class SchoolAdmin {
    String name;
    int dob_year;
    char gender;
    String staffType;
   double registrationFee;

    public SchoolAdmin(String name, int dob_year, char gender, String staffType) {
        this.name = name;
        this.dob_year = dob_year;
        this.gender = gender;
        this.staffType = staffType;
    }

    public void registration(){
        System.out.println("Registration is started");
        System.out.println("Registration in progress");
        System.out.println("Checking files..");
        System.out.println("Checking files..");
        System.out.println("Checking files..");
        System.out.println("Pay the registration fee " + registrationFee);
    }
}
