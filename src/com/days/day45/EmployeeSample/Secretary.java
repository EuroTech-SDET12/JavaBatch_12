package com.days.day45.EmployeeSample;

public class Secretary extends Employee {

    String officeName;
    int managerId;

    public void giveReport(){
        System.out.println("Give a report to " + this.managerId);
    }

    public void createList(){
        System.out.println("Create a list for office " + this.officeName);
    }



}
