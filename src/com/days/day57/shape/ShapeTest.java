package com.days.day57.shape;

public class ShapeTest {
    public static void main(String[] args) {
        //create a method drawShape() as a parameter  use parent class reference type

        Shape shape = new Circle();
        shape.draw();
        drawShape(shape);
        shape = new Rectangle();
        shape.draw();
        drawShape(shape);
        shape = new Triangle();
        shape.draw();
        drawShape(shape);

        Shape shape1 = new Shape() {
            @Override
            public void draw() {
                System.out.println("Anonymous shape.");
            }
        };
        shape1.draw();
        Shape shape2 = () -> {
            System.out.println("Draw a picture");
            System.out.println("Paint it.");
        };
        shape2.draw();
        shape2.draw();
        Shape shape3 = () -> System.out.println("Draw a picture");
        shape3.draw();

    }

    public static void drawShape(Shape shape) {
        shape.draw();
    }


}
