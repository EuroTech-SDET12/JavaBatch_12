package com.days.day29;


import java.awt.*;

public class Test {

    int number = 4;
    boolean test = true;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("GC IS ON THE WAY!!!");
        super.finalize();
    }

    public static void main(String[] args) {
        System.out.println("Beginning OF MAIN METHOD");
        Test test1 = new Test();
        Test test2 = new Test();
        Test test3 = new Test();
//        test3 = null;
//        test2 = test1;
        ////////////////////////////////////
        new Window(null);
        new Window(null);
        new Window(null);
        Window window4 = new Window(null);

        // There are 4 window objects, 3 of them did not assign to ref variable!!
        System.out.println("Before GC window number = " + Window.getWindows().length);
        System.gc();
        System.out.println("After GC window number = " + Window.getWindows().length);
        System.out.println("END OF MAIN METHOD");
    }

}

