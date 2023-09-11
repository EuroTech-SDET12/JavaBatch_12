package com.days.day28;

public class StringPool {
    public static void main(String[] args) {
        //day   -->literal
        //today -->by new keyword
        String day;
        day = "Monday";
        String today;
        today = new String("Monday");
        System.out.println("day = " + day);
        System.out.println("today = " + today);
        System.out.println("day==today = " + (day == today));
        String firstDay = "Monday";
        System.out.println("day==firstDay = " + (day == firstDay));
        String var1 = new String("Monday");
        System.out.println("var1==today = " + var1 == today);
        String var2 = "Monday";
        System.out.println("var2==day = " + (var2 == day));

        var2="Tuesday";
        System.out.println("var2 = " + var2);
        var2="Friday";
        System.out.println("var2 = " + var2);
        System.out.println("var2.toUpperCase() = " + var2.toUpperCase());
        System.out.println("var2 = " + var2);

    }
}
