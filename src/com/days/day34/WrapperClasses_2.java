package com.days.day34;

public class WrapperClasses_2 {
    public static void main(String[] args) {
        double var = 24.96;
        Double var2 = Double.valueOf(var);
        Double var3 = var;
        System.out.println("var3 = " + var3);
        System.out.println("var = " + var);
        System.out.println(var2 instanceof Double);
//        System.out.println(var2 instanceof Integer);
        double var5 = var3;
        Integer number = Integer.valueOf(60);
        int number5 = number;
        System.out.println("number5 = " + number5);
        System.out.println("number = " + number);

        String str = "87";
        int age = Integer.parseInt(str);
        System.out.println("age = " + age);
        int integer1 = Integer.valueOf(str);
        System.out.println("integer = " + integer1);
        int number10 = 100;
        String str5 = "" + number10;
        String str6 = String.valueOf(number10);
        System.out.println("str6 = " + str6);

    }
}
