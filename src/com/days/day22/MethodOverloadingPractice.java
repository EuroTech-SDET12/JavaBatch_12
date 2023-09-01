package com.days.day22;

public class MethodOverloadingPractice {

    public static void main(String[] args) {
        sum(1, 1.5);
        sum(1.2,1.4);
        sum(1,2);
    }
    public static void sum (int a , double b){
        System.out.println(a+b);
    }

    public static void sum (double c , double d){
        System.out.println(c+d);
    }

    public static void sum (int e , int f){
        System.out.println(e+f);
    }
//    public static void sum (int x , int y){
//        System.out.println(x+y);
//    }


}
