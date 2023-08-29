package com.days.day18;

public class Loops {
    public static void main(String[] args) {
        {
            System.out.println("executed once!!!");
        }


        for (int i = 0; i < 3; i++) {// i=0 i=1 i=2  --> 3 times
            System.out.println("executed multiple times!!!!");
        }

        int num = 0;
        while (num < 3) {
            System.out.println(num);
            num++;
        }

        num = 0;

        do {
            System.out.println("num = " + num);
        } while (num > 0);// condition is false but will print value of the num once

        num = 0;
        do {
            System.out.println(num);
            num++;
        } while (num < 3);

        //print alphhabet
        int value = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            value = ch;
            System.out.println("ch = " + ch+" = "+value);
        }

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            value = ch;
            System.out.println("ch = " + ch+" = "+value);
        }
        System.out.println("===========");
        for (char ch = 65; ch <= 'z'; ch++) {// from 65 to 122
            value = ch;
            System.out.println("ch = " + ch+" = "+value);
        }


    }
}
