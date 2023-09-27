package com.days.day37;

public class Circle {

    // DATA FIELDS
    double radius;

    // Constructors
    public Circle() {
        System.out.println("!!CIRCLE OBJECT CONST!!!");
    }

    // Methods
    public void getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area = " + area);
    }

    public void getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Circle Perimeter = " + perimeter);
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }
}
