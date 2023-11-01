package com.days.day61;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        AutomationEngineer employee = new AutomationEngineer("Ali", 58864.78);
        TestLead employee1 = new TestLead("David", 60000);
//        employee.name = "Veli";'name' has private access in 'com.days.day61.Employee'
        System.out.println(employee1.getSalary());
        AutomationEngineer engineer = new AutomationEngineer("Selim", 57000);
        engineer.printEmployeeInfo();
        TestLead testLead = new TestLead("Yusuf", 65000);
//        Employee employee2 = new Employee();
        engineer.performDuty();
        engineer.coding();
        Employee employee2 = new AutomationEngineer(" Marry", 70000);
        employee2.performDuty();
        employee2 = new TestLead("Marry", 80000);
        employee2.performDuty();
        // Emloyee list
        ArrayList<Employee> list = new ArrayList<>();
        list.add(engineer);
        list.add(testLead);
        list.add(employee1);
        list.add(employee2);
        list.get(0).printEmployeeInfo();
        list.get(1).printEmployeeInfo();
        list.get(2).printEmployeeInfo();
        list.get(3).printEmployeeInfo();


    }
}
