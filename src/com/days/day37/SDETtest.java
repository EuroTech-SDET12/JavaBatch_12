package com.days.day37;

public class SDETtest {

    public static void main(String[] args) {

        SDET s1 = new SDET("Jane",35,'F',"BMW",1000000,true);

        s1.increaseSalary(15000);
        System.out.println("s1.salary = " + s1.salary);

        System.out.println("s1.company = " + s1.company);


    }
}
