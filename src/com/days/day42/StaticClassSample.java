package com.days.day42;

// Helper Class / Outer Class
public class StaticClassSample {

    int number;
    static int staticNumber;

    // Static NESTED CLASS
    public static class StaticNested {

        public void staticNested() {
            // System.out.println("number = " + number); !! NON-static field!!!
            // Only static members of Outer class are directly
            // accessible in static nested class!!
            System.out.println("staticNumber = " + staticNumber);
        }
    }


    // Non-static NESTED CLASS / Inner class
    public class NonStaticNested {

        public void innerTest() {
            System.out.println("number = " + number);
            System.out.println("staticNumber = " + staticNumber);
        }
    }

}
