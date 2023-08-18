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


        number = 12;
        switch (number) {
            default:
                System.out.println(number + " is greater then 10 so we couldnt check it.");
                break;
            case 10:
            case 8:
            case 4:
            case 2:
                System.out.println(number + " is an even  number.");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println(number + " is an odd number.");
        }
        if (number == 2 || number == 4 || number == 6 || number == 8 || number == 10) {
            System.out.println(number + " is an even  number.");
        } else if (number == 1 || number == 3 || number == 5 || number == 7 || number == 9) {
            System.out.println(number + " is an odd number.");
        } else {
            System.out.println(number + " is greater then 10 so we couldnt check it.");
        }

    }
}
