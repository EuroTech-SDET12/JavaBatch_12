package com.days.day61;

public class TestLead extends Employee {
    @Override
    public void performDuty() {
        System.out.println("As a test lead "+this.getName()+" is writing test cases and preparing test plan.");
    }

    TestLead(String name, double salary) {
        super(name, salary);
    }
}
