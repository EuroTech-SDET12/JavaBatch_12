package com.days.day45.EmployeeSample;

public class Developer extends Employee {

    String name;
    String projectName;
    String mainLang;

    public Developer() {
        super();
    }


    public void releaseCode(){
        this.name="";
        super.name="dasdsd";
        super.raiseSalary(1);
        System.out.println("Code released!!");
    }

    public void assignVM(){
        System.out.println("VM is created and assigned");
    }

}
