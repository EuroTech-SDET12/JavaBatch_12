package com.days.day47;

public class DefaultSample {
    public int publicNum = 111;
    private int privateNum = 222;
    int defaultNum = 333;


    public void publicMethod(){
        System.out.println("public Method");
    }

    private void privateMethod(){
        System.out.println("private Method");
    }

    void defaultMethod(){
        System.out.println("default Method");
    }

}
