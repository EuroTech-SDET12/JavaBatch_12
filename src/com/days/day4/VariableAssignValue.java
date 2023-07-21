package com.days.day4;

public class VariableAssignValue {

    public static void main(String[] args) {

        // variable data type  variable name   =   value ;

//        double salary; // declare
//        salary = 60100.55; // initialize !!


        double salary = 60100.55;
        System.out.println(salary);
        System.out.println("The salary is " + salary);

        // BMW send an offer, he changed the job , new salary is 71000.00;

        //  = is assignment operator

//       double salary = 71000.00;  WE CAN NOT DECLARE SAME NAME VARIABLE ON SAME METHOD!!!

        salary = 71000.00;  // re assign a new value!!
        System.out.println(salary);
        System.out.println("The salary is " + salary);
    }
}
