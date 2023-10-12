package com.days.day48;

public class FinalVariable {

   public final double PI_NUMBER= 3.141592653589793;

   final String WHO_IS_RIGHT;  // opt-1:  = "MY WIFE";

    public FinalVariable() {
        // opt-2:    WHO_IS_RIGHT = "MY WIFE";
    }

    { // INSTANCE BLOCK
        WHO_IS_RIGHT = "MY WIFE";   // opt-3:
    }

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        System.out.println("TEST!!");
        final int myLuckNumber;
        myLuckNumber = 11;  // initialize
//        myLuckNumber = 22; // assign a value again !!
        System.out.println("myLuckNumber = " + myLuckNumber);
    }

    public void setPi(){
   //     this.piNumber = 3.14;
    }
}
