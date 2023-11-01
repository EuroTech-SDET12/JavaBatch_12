package com.days.day61;

public class MultiThread {
    public static void main(String[] args) throws InterruptedException {
        Print print = new Print("First Thread!!!");
//        print.run();
        print.start();
        Print print1 = new Print("Second Thread!");
        print1.start();
        Print print2 = new Print("Third thread!!");
        print2.start();
    }
}
