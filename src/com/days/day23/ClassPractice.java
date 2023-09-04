package com.days.day23;
public class ClassPractice {

    int number =2; // instance variable!!!  Non Static Fields
    int numClass = 101; // instance variable!!! Non Static Fields
    int invoiceNumber; // instance variable!!! Non Static Fields

    static int count = 1; // class variable !! Static Fields

    { // BLOCKS!!!
    }
    public void test1_CreateInvoice(){  // instance method
        System.out.println("numClass = " + numClass);
        System.out.println("number = " + number);
        invoiceNumber = 10001;
        //scripts... enter invoice inf...
        // click create inv
        System.out.println("count = " + count);
    }

    public void test2_VerifyInvoice(){
        // get actual inv number from document
        int actualInvoiceNumber = 10001;
        // call your inv number that you create
        // and verify with actual
        if(invoiceNumber == actualInvoiceNumber){
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED!!");
        }
    }


    public static void main(String[] args) {  // static method
        int number = 2; //local variable

        System.out.println("count = " + count);

    }



    public static void test(){  // static method

        int number = 2;     // local variable
        int numTest= 111;  // local variable
        if(true){

            System.out.println("numTest = " + numTest);
        }

        System.out.println("count = " + count);
//        System.out.println(invoiceNumber);
    }



}