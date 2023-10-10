package com.days.day46.ShapeSample;

public class Circle extends Shape{

    @Override // this annotation is not mandatory!!
    public void draw(String shape) {
        System.out.println("Circle DRAW METHOD!!");
        super.draw(shape);
    }
}
