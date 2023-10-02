package com.days.day41;

public class Encapsulation {
    private int var1 = 10;
    private String var2;

    public void setVar2(String str) {
//        var2 = str;
        this.var2 = str;
    }

    public String getVar2() {
        return var2;
    }

    public void printVal() {
        System.out.println("var1 = " + var1);
    }

    //    we need a getter method for var1
    public int getVar1() {
        return var1;
    }
    //setter method to assign val to var2


}
