package com.days.day56;

import com.days.day56.vehicle.Toyota;

public class DriverTest {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.name = "Ali";
        Honda honda = new Honda();
        honda.model = "Accord";
        driver.drive(honda);
        Toyota toyota=new Toyota();
        toyota.model="Rav 4";
        driver.drive(toyota);
        driver.drive(new BMW());
    }
}
