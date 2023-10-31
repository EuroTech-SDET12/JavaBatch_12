package com.days.day61;

public class Print extends Thread {
    String str;

    Print(String str) {
        this.str = str;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(str + " " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("After Java Lessons .");
        System.out.println("Bye Bye JAVA LESONNSSSSS!::))))");
    }
}
