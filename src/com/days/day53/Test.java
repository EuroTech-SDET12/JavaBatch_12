package com.days.day53;

public class Test {

    public static void main(String[] args) {

        int num1= 7;
        int num2= 3;
        try {
            if(num1 * num2 == 21){
                throw new MyLovelyException();
            }else{
                System.out.println("TEST PASS!!");
            }
        } catch (MyLovelyException e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException();
        }

    }
}
