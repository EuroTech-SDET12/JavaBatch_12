package com.days.day45.EmployeeSample;

public class Employee {
    String name;
    int employeeID;
    double salary;
    double workHours;
    double vacationDay;
    char gender;


    public void raiseSalary(double newSalary){
        this.salary = newSalary;
    }

    public void leaveHoliday(double offDays){
        this.vacationDay -= offDays;
    }

    public void resign(){
        this.salary = 0;
        this.workHours = 0;
    }

}
