package com.days.day27;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date.getDate() = " + date.getDate());
        System.out.println("date.getTime() = " + date.getTime());
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate.getMonth() = " + localDate.getMonth());
        System.out.println("localDate.getYear() = " + localDate.getYear());
        System.out.println("localDate = " + localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM-yy HH:mm:ss");
        System.out.println("localDateTime = " + localDateTime.format(dateTimeFormatter));
    }
}
