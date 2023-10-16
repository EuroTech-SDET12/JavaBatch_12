package com.days.day50;

public class Circle extends Shape {
    int radius;

    Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI + radius * radius;
        System.out.println("area  of the circle is : " + area);
    }
}
