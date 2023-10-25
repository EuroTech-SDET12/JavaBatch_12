package com.days.day56;

public enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;


    public static void printDay(Days day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Happy week days!!!!!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Happy weekend!!!!");
        }
    }

}

class EnumTest {
    public static void main(String[] args) {
        System.out.println("Days.WEDNESDAY = " + Days.WEDNESDAY);
        Days day = Days.WEDNESDAY;
        System.out.println("day = " + day);
        String dayString = day.toString();
        System.out.println("dayString = " + dayString);
        Days.printDay(day);
        printValueOfday(day);
//        printValueOfday("January");

    }

    static void printValueOfday(Days day) {
        System.out.println("day = " + day);
    }
//    static void printValueOfday(String day) {
//        System.out.println("day = " + day);
//    }
}
