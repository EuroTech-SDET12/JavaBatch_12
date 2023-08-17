package com.days.day12;

public class Switch_2 {
    public static void main(String[] args) {
        int dayNumber = 3;
        String day = "";
        // monday tuesday wednesday thursday friday saturday sunday
        switch (dayNumber) {
            case 1:
                day = "Monday";
//                System.out.println("Monday");
                break;
            case 2:
//                System.out.println("Tuesday");
                day = "Tuesday";
                break;
            case 3:
//                System.out.println("Wednesday");
                day = "Wednesday";
                break;
            case 4:
//                System.out.println("Thursday");
                day = "Thursday";
                break;
            case 5:
//                System.out.println("Friday");
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
//                System.out.println("Saturday");
                break;
            case 7:
                day = "Sunday";
//                System.out.println("Sunday");
                break;
            default:
                day = "couldnt found";
//                System.out.println("invalid value.");
        }
        System.out.println("day = " + day);
        long l = 12345;
//        switch (l){Incompatible types. 'long', required: 'char, byte, short, int,
//
//        }
        int number = 10;
//        if (number ) { required type boolean provided integer value
//            System.out.println("ten");
//        }
        System.out.println(number > 0);//true
        if (number > 0) {
            System.out.println("positive number");
        }
        if (number % 2 == 1) {// generates boolean value
            System.out.println("number is an odd number.");
        }
        //IMPORTANT!!!!!! IF STATEMENT EXPRESIONS MUST BE BOOLEAN VALUES

//                if (++number ) { VALUE IS not boolean so will give error!!!!!
//            System.out.println("ten");
//        }

        number = 1;
        if (--number == 0) {
            System.out.println("number is zero!!!!");
        }
//        if (--number + 10) {
//
//        }
        //what kind of operators generate boolean values.

        day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("first day of the week.");
                break;
            case "Tuesday":
                System.out.println("Second day of the week");
                break;
            case "Wednesday":
                System.out.println("third day of the week.");

        }


    }
}
