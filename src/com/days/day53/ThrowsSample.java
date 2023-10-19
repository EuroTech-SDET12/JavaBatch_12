package com.days.day53;

public class ThrowsSample {


    public static void main(String[] args) throws InterruptedException  {
        System.out.println("HI");
        pauseCode(2);
        System.out.println("HELLO");
    }



    public static void pauseCode(int seconds) throws InterruptedException {
//        try {
//            Thread.sleep(1000*seconds);
//        }catch (InterruptedException e){
//        }
        Thread.sleep(1000*seconds);
    }

    public static void test() throws InterruptedException{
        pauseCode(2);
    }
}
