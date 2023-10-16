package com.days.day50;

public abstract class Shape {
    String color;
    double area;
    String name;

    Shape(String name) {
        this.name=name;
    }


    // Circle, Rectangle classes inherit Shape class
    // non abstract(concrete) methods    draw, paint(color)
    // abstract, calculation of the area   calculateArea();

    //circle area calculation  ===>    Math.PI*radius*radius     define radius in the circle class as a field
    //rectangle area ====>length *width   define length, width in the rectangle class as a field

    public void draw() {
        System.out.println("We are drawing shape :" + name);
    }

    public void paint(String color) {
        this.color = color;
        System.out.println("Color of the " + name + " is " + color);
    }

    public abstract void calculateArea();

}
