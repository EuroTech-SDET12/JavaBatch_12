package com.days.day38;

public class School {


    //Const:
    /* Requests:
       1- After each School registration, keep total school count dynamically.
       2- After each School registration, print a Welcome message for each school
       and assign true to isSchoolActive
       3- All school id numbers must start 1000 and should increase 1 by 1 and
       assign to the related object automatically.
                ex s1.schoolId -> 1000
                   s2.schoolId -> 1001
                   s3.schoolId -> 1002
                   s4.schoolId -> 1003
      4- I would like to create objects with only /name\ or only /name and address\ or
      only /name, school rate and address\
     */

    //Data fields
    String schoolName;
    int schoolId = 1000;
    String address;
    char schoolRate;
    boolean isSchoolActive;

    static int count;

    public School(){
        System.out.println("!!! oooo WELCOME "+schoolName+ "!!!");
        isSchoolActive = true;
        schoolId += count; //schoolId = schoolId + count;
        count++;
    }

    public School(String schoolName) {
        this();
        this.schoolName = schoolName;
    }

    public School(String schoolName, String address) {
        this();
        this.schoolName = schoolName;
        this.address = address;
    }

    public School(String schoolName, String address, char schoolRate) {
        this();
        this.schoolName = schoolName;
        this.address = address;
        this.schoolRate = schoolRate;
    }
}
