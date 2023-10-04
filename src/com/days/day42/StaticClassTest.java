package com.days.day42;

public class StaticClassTest {

    public static void main(String[] args) {
        // OuterClass.NestedClass
        StaticClassSample.StaticNested obj1 = new StaticClassSample.StaticNested();

        // Create an object from outer class
        // then call inner const from the outer object
        StaticClassSample outer = new StaticClassSample();
        StaticClassSample.NonStaticNested obj2 = outer.new NonStaticNested();
    }
}
