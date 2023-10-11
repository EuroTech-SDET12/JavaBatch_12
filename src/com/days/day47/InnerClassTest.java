package com.days.day47;

public class InnerClassTest {

    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass();
        OuterClass.Inner1 obj2 = obj1.new Inner1();

        OuterClass.Inner2 obj3 = new OuterClass.Inner2();
       // OuterClass.Inner3 obj4 = obj1.new Inner3();

        OuterClass.Inner4 obj5 = obj1.new Inner4();
    }
}
