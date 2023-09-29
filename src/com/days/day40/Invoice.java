package com.days.day40;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Invoice {
    /*
    Via objects of Invoice class we will generate Invoices...
    Requirements:
    [CONS]
    1- User must provide Invoice amount to create an invoice

    [CONS + STATIC + INIT.]
    2- There must be auto increment invoice number for each Invoice(starts with 10000)
         obj1.invNumber => 10000  , obj2.invNumber => 10001 ...

    [CONS + DATE]
    3- There must be date string for each Invoice and should automatically assign to TODAY date

    [CONS + RANDOM]
    4- There must be invoice reference which randomly auto generated as 5 digits number per Invoice

    [INIT + STATIC + ENC]
    5- Company name must same for all Invoices: EuroTech Study

    [STATIC COUNT]
    6- Total generated invoice number should exist under class.

    [CONS + SCANNER]
    7- Whenever an object created, invoiceDescription field should provide by user input on console for each Invoice
     */


    double amount;
    int invNumber = 10000;
    static int count;
    private String invoiceDate;
    int invReference;
    private static String companyName = "EuroTech Study";
    String invDescription;

    public Invoice(double amount) {
        this.amount = amount;
        this.invNumber += count;
//        this.invNumber = invNumber + count;
        count++;

        this.invoiceDate= generateTodayTimeStamp();
        this.invReference = generateInvReferenceNumber();
        this.invDescription = generateInvoiceDescription();
    }

    //Function
    public String generateTodayTimeStamp(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public int generateInvReferenceNumber(){
        Random random = new Random();
        // 10000 - 100000
        return random.nextInt(100000-10000) + 10000;
    }

    public String generateInvoiceDescription(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Invoice Description: ");
        return scanner.nextLine();
    }


    // GETTER
    public String getInvoiceDate() {
        return invoiceDate;
    }

    public static String getCompanyName() {
        return companyName;
    }
}
