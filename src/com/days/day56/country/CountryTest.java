package com.days.day56.country;

import com.days.day56.country.Country;
import com.days.day56.country.Student;

public class CountryTest {
    public static void main(String[] args) {
        Student student1 = new Student("David", 35, Country.UK);
        student1.studentInfo();
        Student student2 = new Student("Ayse", 30, Country.TURKEY);
        student2.studentInfo();
        Student student3 = new Student("Swathi", 27, Country.INDIA);
        student3.studentInfo();
        Student student4 = new Student("Okocha", 40, Country.NIGERIA);
        student4.studentInfo();

        System.out.println("Country.GERMANY.population = " + Country.GERMANY.population);

    }
}
