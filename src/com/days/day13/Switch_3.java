package com.days.day13;

public class Switch_3 {
    public static void main(String[] args) {
        int number = 10;
        int var = 30;
//        switch (expression){
//        switch (number + 10) {
        switch (number) {
            case 5:
                //statement , code
//            case var: will give error Constant expression required
                break;// optional
            case 30:
                //statement
                break;
            default://optional
//                statement
        }

        String day = "Saturday";
        boolean isWeekday = true;
        boolean isWeekend = true;
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                isWeekend = false;
                System.out.println(day + " is one of the Weekdays.");
                break;
            case "Saturday":
            case "Sunday":
                isWeekday = false;
                System.out.println("Happy weekend!!!!");
        }
        System.out.println("out of the switch block.");
        System.out.println("isWeekend = " + isWeekend);
        System.out.println("isWeekday = " + isWeekday);


    }
}
