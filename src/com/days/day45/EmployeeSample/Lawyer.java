package com.days.day45.EmployeeSample;

public class Lawyer extends Employee {

    String caseName;
    String caseStatus;


    public void joinCourt(){
        System.out.println("JOIN COURT for case " + this.caseName);
    }

    public void submitClaim(){
        if(caseStatus.equals("REJECTED")){
            System.out.println("SUBMIT CLAIM!!");
        }
    }


}
