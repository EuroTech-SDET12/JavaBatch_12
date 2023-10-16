package com.days.day50;

public class Rectangle extends Shape {
    int width;
    int length;

    Rectangle(String name) {
        super(name);
    }

    public Rectangle(String name, int length, int width) {
        super(name);
        this.width = length;
        this.length = width;
    }

    @Override
    public void calculateArea() {
        area = width * length;
        System.out.println("area of the rectangle :  " + area);
    }
}
