package com.days.day38;

public class Staff {

    String name;
    String title;
    double salary;
    int staffId;

    public Staff(String name, String title, double salary, int staffId) {
        this.name = name;
        this.title = title;
        this.salary = salary;
        this.staffId = staffId;
    }

    public double getBaseSalary(){
    // if %20 is tax! %80 salary is base salary!!
        return salary*0.8;
    }


}
