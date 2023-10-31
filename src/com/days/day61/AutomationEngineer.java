package com.days.day61;

public class AutomationEngineer extends Employee implements JavaProgLang,Selenium{

    @Override
    public void performDuty() {
        System.out.println(this.getName() + " is automating filter scenarios.");
    }

    AutomationEngineer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void coding() {
        System.out.println("Using java while automating.");
    }

    @Override
    public void automateBrowser() {
        System.out.println("Automating browsers by selenium.");
    }
}
