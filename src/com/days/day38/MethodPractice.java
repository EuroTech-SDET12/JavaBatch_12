package com.days.day38;

public class MethodPractice {

    public static void main(String[] args) {
//        method1();
        practice();
    }


    public static void practice(){
        practice(100);
        practice("Micheal");
    }
    public static void practice(int number){
        System.out.println("number = " + number);
    }
    public static void practice(String name){
        System.out.println("name = " + name);
    }

























    //////////////////////////////
    public static void method1(){
        method2();
        method3();
        System.out.println("method 1 ");
    }

    public static void method2(){
        System.out.println("method 2 ");
    }

    public static void method3(){
        System.out.println("method 3 ");
    }
}
