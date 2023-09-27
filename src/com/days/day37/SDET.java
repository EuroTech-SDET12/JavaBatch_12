package com.days.day37;

public class SDET {

    String name;
    int age;
    char gender;
    String company;
    double salary;
    boolean isSuccessful;

    public SDET(String name, int age, char gender,
                String company, double salary, boolean isSuccessful) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.salary = salary;
        this.isSuccessful = isSuccessful;
    }

    public void increaseSalary( int increaseAmount){
      this.salary += increaseAmount;
    }

    public void changeCompany(String newCompany){
        this.company = newCompany;
    }
}
