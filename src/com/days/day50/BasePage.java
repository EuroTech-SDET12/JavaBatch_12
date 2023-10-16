package com.days.day50;

public abstract class BasePage {

    public void navigate(String page) {
        System.out.println("You are now being navigated to " + page);
    }

    public void print(String name) {
        System.out.println(name);
    }


}
