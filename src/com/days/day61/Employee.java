package com.days.day61;

public abstract class Employee {

    //how can i create a constructor
    //why i create constructor
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void performDuty();

    public void setSalary(double salary) {
        this.salary = salary;
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("An object generated.");
    }

    public void printEmployeeInfo() {
        System.out.println(name + " salary is " + salary+" per year.");
    }


}
