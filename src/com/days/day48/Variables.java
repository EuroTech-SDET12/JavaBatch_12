package com.days.day48;

public class Variables {

    public int num2 =20; // INSTANCE VARIABLE!!
    static int num3=30; // CLASS/STATIC VARIABLE!!

    public Variables() {
        int num4 = 40; // LOCAL VARIABLE!!
//        static int num8=11;
    }

    public static void test(){
         int num1 = 10; // LOCAL VARIABLE!!
//        static int num8=11;
    }

    public void test2(){
        int num7 ; // LOCAL VARIABLE!!
     //   System.out.println(num7);
//        static int num8=11;
    }

    { // instance block/ will be run after each object creation!!
      int num5 = 50; // LOCAL VARIABLE!!
    }

    static { // static block/ will be run only once when first-time loads the class!!
      int num6 = 60; // LOCAL VARIABLE!!
    }

    public static void main(String[] args) {
        test();
        Variables obj1 = new Variables();
        System.out.println("obj1 = " + obj1);
        obj1 = new Variables();
        // then obj1 previous object values and instance variables will be destroy!!
        System.out.println("obj1 = " + obj1);
        obj1 = null;
        System.out.println("obj1 = " + obj1);
        System.gc();
        System.out.println("End of main method");
    }
}
