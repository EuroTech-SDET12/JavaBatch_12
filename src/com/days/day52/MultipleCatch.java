package com.days.day52;

import java.util.Scanner;

public class MultipleCatch {

    public static void main(String[] args) {
        System.out.println("START");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER VALUE 1:");
        int value1=scanner.nextInt();
        System.out.println("ENTER VALUE 2");
        int value2=scanner.nextInt();

        try {
            System.out.println("TRY BLOCK -->>");
            // this value may be coming from some application input
            System.out.println("value1/value2 = " + (value1/value2));
            System.out.println("ENTER BROWSER: ");
//            String browser= scanner.next();
            String browser= null;
            if (browser.equals("Chrome")){
                System.out.println("TEST PASSED!!");
            } else{
                System.out.println("TEST FAILED!!");
            }
        }catch (NullPointerException n){
            System.out.println("--->>> NullPointerException CATCH BLOCK --->>>");
            System.out.println("INVALID NULL INPUT EXIST, CHECK DB CONNECTION");
            System.out.println("TEST FAILED!!");
        }catch (ArithmeticException a){
            System.out.println("--->>> ArithmeticException CATCH BLOCK --->>>");
            System.out.println("DB DATA REMOVED, reinsert them!!!");
            System.out.println("TEST FAILED!!");
        }
        System.out.println("END of MAIN METHOD");
    }
}
