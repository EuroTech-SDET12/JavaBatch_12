package com.days.day47.ProtectedData;

public class ProtectedSample {

    public int publicNum = 111;
    private int privateNum = 222;
    int defaultNum = 333;
    protected int protectedNum = 444;


    public void publicMethod(){
        System.out.println("public Method");
    }

    private void privateMethod(){
        System.out.println("private Method");
    }

    void defaultMethod(){
        System.out.println("default Method");
    }

    protected void protectedMethod(){
        System.out.println("protected Method");
    }
}
