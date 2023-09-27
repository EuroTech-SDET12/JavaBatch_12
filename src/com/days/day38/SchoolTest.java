package com.days.day38;

public class SchoolTest {

    public static void main(String[] args) {

        School s1 = new School("Alfa");
        School s2 = new School("Beta","Baker Street");
        School s3 = new School("Charlie", "Fly St", 'A');

        System.out.println("s1.schoolId = " + s1.schoolId); // 1000
        System.out.println("s2.schoolId = " + s2.schoolId); // 1001 = 1000 + previous school count!!
        System.out.println("s3.schoolId = " + s3.schoolId); // 1002 = 1000 + previous school count!!

    }
}
