package com.days.day8;

public class Relational {
    public static void main(String[] args) {
        // ==
        int var = 15;//  = -->for assignment
        int var2 = 25;
        System.out.println("var==var2 = " + (var == var2));// var value equals var2 value
        //                     String + int
        //                        String       == var2
        System.out.println(var == var2);
        int var3 = 25;
        System.out.println(var2 == var3);
        System.out.println(25 == 35);
        System.out.println(35 == 35);
        System.out.println(var3 == 35);
        System.out.println(35 == var3);
        double var4 = 67.86;
        System.out.println(var4 == var3);
        boolean var5 = true;
        // System.out.println(var5 == var4); boolean , double can not be applied
        boolean var6 = false;
        System.out.println(var5 == var6);//boolean , boolean
        String str = "Hello";
//        System.out.println(str == var4); can not be applied String double,int byte,short,long,float
        //ASCII
        int valueA = 'A';
        System.out.println("valueA = " + valueA);
        int valueB = 'B';
        System.out.println("valueB = " + valueB);
        int valuea = 'a';
        System.out.println("valuea = " + valuea);
        System.out.println('A' == 'B');
        System.out.println('A' == 65);
        str = "Hello";
        String str2 = "Hi";
        System.out.println(str == str2);// we compare the address of the Strings
        //we will not use == to compare value of the Strings , we will use equals method.
        String str3 = "Hi";
        System.out.println(str2 == str3);//true


        // != is not

        var = 10;
        var2 = 20;
        System.out.println(var != var2);//var is not equals var2  ---> true
        System.out.println(var != 50);
        System.out.println(var != 10);//false
        System.out.println(var > var2);//false
        System.out.println(var2 > var);
        // > and <
        boolean isGreaterThen100 = var > 100;//10>100-->false--->assign to variable
        System.out.println("isGreaterThen100 = " + isGreaterThen100);
        isGreaterThen100 = 150 > 100;
        System.out.println("isGreaterThen100 = " + isGreaterThen100);
        var = 20;
        var2 = 50;
        System.out.println(var < var2);

        //  >=  greater then or equals to
        var = 50;
        var2 = 20;
        System.out.println(var >= var2);
        //create a boolean variable isNumberPositive
        //create an int variable
        boolean isNumberPositive = var >= 0;
        System.out.println("var = " + var);
        System.out.println("isNumberPositive = " + isNumberPositive);
        // 50 is a positive value.
        var = 40;
        var2 = 20;
        System.out.println(var + " is a positive value.");
        //                 40 is a positive value.
        // 40 is greater then 20
        System.out.println(var + " is greater then "+var2);


    }
}
