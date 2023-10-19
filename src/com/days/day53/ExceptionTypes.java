package com.days.day53;

public class ExceptionTypes {

    public static void main(String[] args) {

        System.out.println("Navigate to login page");
        System.out.println("Wait 3 second");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
        }
        System.out.println("Enter login credentials, then hit enter ");
        System.out.println("Wait 2 second");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
        }
        System.out.println("Then verify dashboard screen.");


    }
}
