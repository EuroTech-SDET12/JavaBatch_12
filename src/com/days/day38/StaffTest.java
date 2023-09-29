package com.days.day38;

public class StaffTest {

    public static void main(String[] args) {
        Staff s1 = new Staff("John","SDET",90000,1001);
        Staff s2 = new Staff("Julie","DevOps",80000,1002);
        Staff s3 = new Staff("Jane","SquadLead",50000,1003);
        Staff s4;
        Staff s5 = s3;
        System.out.println("s3.name = " + s3.name);

        printStaffSummary(s1);
        printStaffSummary(s2);
        printStaffSummary(s3);
        printStaffSummary(s5);
//        printStaffSummary(s4);
//        System.out.println("s4.name = " + s4.name);

    }

    public static void printStaffSummary(Staff ss){
        System.out.println("The staff name is "+ ss.name +
                "\nHis/her title is " + ss.title+
                "\nStaff id is "+ss.staffId+
                "\nStaff's base salary is "+ss.getBaseSalary()+"\n");
    }





}
