package com.days.day39;

public class Access {

    public int number;
    private String name;

    public void test(){
        System.out.println("Test");
    }

    private void test2(){
        System.out.println("Test");
    }

    public static void main(String[] args) {

        Access obj1 = new Access();
        obj1.number=2;
        System.out.println("obj1.number = " + obj1.number);
        obj1.test();

        obj1.name = "Test object";
        System.out.println("obj1.name = " + obj1.name);

        obj1.test2();
    }
}
