package com.days.day8;

public class Assignment {
    public static void main(String[] args) {
        //=
        int var;
        var = 10;
        //without initialisation we cant use a variable
        //+=

        System.out.println("var = " + var);
        int var2 = var;
        var2 = 10;
        var2 = var;
        var = var + 50;//10 + 50
        System.out.println("var = " + var);//60
        var += 50;//var = var + 50 60 + 50
        System.out.println("var = " + var);//110

        var = 20;
        var += 40;// var = var + 40 ===>  20 + 40 ---> 60
        System.out.println("var = " + var);//60

        var = var - 30;//60 - 30 => 30
        System.out.println("var = " + var);// 30
        var = 80;
        var -= 30;// var = var - 30  ==> 80 - 30 ===> 50
        System.out.println("var = " + var);

        var = 20;
        var = var * 4;
        System.out.println("var = " + var);//80
        var *= 4;//var = var * 4---> 80 * 4 ---> 320
        System.out.println("var = " + var);

        //  /=
        var = 500;
        var = var / 5;// 500/5
        System.out.println("var = " + var);//100
        var /= 4;// var = 100/ 4 ---> 25
        System.out.println("var = " + var);

        // %=
        var = 10;
        System.out.println(var % 4);
        var = var % 4;
        System.out.println("var = " + var);
        var = 10;
        var %= 4;
        System.out.println("var = " + var);


    }
}
