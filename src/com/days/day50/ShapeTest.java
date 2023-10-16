package com.days.day50;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle",5);
//        circle.name = "Circle";
        circle.draw();
        Rectangle rectangle = new Rectangle("Rectangle",10,5);
//        rectangle.name = "Rectangle";
        rectangle.draw();
//        circle.radius = 5;
        circle.calculateArea();
//        rectangle.width = 10;
//        rectangle.length = 5;
        rectangle.calculateArea();
        circle.paint("Blue");
        rectangle.paint("Brown");

        Rectangle rectangle2=new Rectangle("rectangle2",10,20);
        rectangle2.calculateArea();
    }
}
