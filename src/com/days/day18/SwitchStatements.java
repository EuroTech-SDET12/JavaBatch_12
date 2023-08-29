package com.days.day18;

public class SwitchStatements {
    public static void main(String[] args) {
        int number = 90;
        switch (number) {
            case 10:
                System.out.println("number 10");
                break;
            case 20:
                System.out.println("number 20");
                break;
            case 30:
                System.out.println("number 30");
                break;
            default:
                System.out.println("not equal any number!!!!");
        }
        System.out.println("out of switch!!!!");

        String month = "Helloooooo";
        String season;
        switch (month) {
            case "March":
//            case "March":Duplicate label 'March'
            case "April":
            case "May":
                System.out.println("spring!!!!");
                season = "Spring";
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                season = "Summer";
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                season = "Autumn";
                break;
            case "December":
            case "January":
            case "February":
                System.out.println("Winter!!!");
                season = "Winter";
                break;
            default:
                season="Month didnt match!!!!";
        }
        System.out.println("Season = " + season);


    }
}
