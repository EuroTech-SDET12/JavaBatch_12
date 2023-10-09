package com.days.day45.EmployeeSample;

public class EmpTest {

    public static void main(String[] args) {

        Employee employee = new Employee();


        Developer developer1 = new Developer();
        developer1.name = "Kilic";
        developer1.raiseSalary(50000);
        System.out.println("developer1.salary = " + developer1.salary);
        System.out.println("developer1.name = " + developer1.name);

        Lawyer lawyer1 = new Lawyer();
        System.out.println("lawyer1.caseStatus = " + lawyer1.caseStatus);
        lawyer1.joinCourt();
        lawyer1.name = "Pooja";
        System.out.println("lawyer1 = " + lawyer1.name);

        Secretary secretary1 = new Secretary();
        System.out.println("secretary1.officeName = " + secretary1.officeName);
        secretary1.giveReport();
        secretary1.name = "Tirkish";
        System.out.println("secretary1 = " + secretary1.name);
    }
}
