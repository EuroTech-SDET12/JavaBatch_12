package com.days.day48.HidingPractice;

public class Sub extends Super{

    int index = 22;

    @Override
    public void displayIndex() {
//        super.displayIndex();
        System.out.println("index= " + this.index);
    }

    public void displayParentIndex(){
        System.out.println("index= " + super.index);
    }

    public static void testStatic(){
        System.out.println("CHILD Static Test method!!");
    }


    public static void main(String[] args) {
        Sub obj1 = new Sub();
      //  Super.testStatic();
        Sub.testStatic();

        obj1.testStatic();





//        System.out.println("obj1.index = " + obj1.index);
//        obj1.displayIndex();
//        obj1.displayParentIndex();


    }
}
