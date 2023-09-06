package com.days.day25;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DatePractice {


    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        System.out.println("date = " + date);

        String dateStr = "28/12/2023";  //" dd/MM/yyyy"

       // Date gateOutput = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);


        String dateInString = "28/12/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
        LocalDate dateTime = LocalDate.parse(dateInString, formatter);

        String dateInString2 = "11/12/2023";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
        LocalDate dateTime2 = LocalDate.parse(dateInString2, formatter2);

        System.out.println("dateTime = " + dateTime);
        System.out.println("dateTime + 10 = " + (dateTime.getMonth()));
        System.out.println("dateTime.getYear() = " + dateTime.getYear());
        System.out.println("dateTime.getDayOfWeek() = " + dateTime.getDayOfWeek());

        System.out.println("dateTime.compareTo(dateTime2) = " + dateTime.compareTo(dateTime2));


//        ----------------------

        System.out.println("LocalDate.now().plusDays(30) = " + LocalDate.now().plusDays(100));

    }
}
