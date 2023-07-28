package com.days.day9;

public class Review_Week2 {


    public static void main(String[] args) {

        double value1= 2.4;

        double value2= 2;  //    imp casting - auto casting !! int -> double  // widening
        System.out.println("value2 = " + value2);

        int value3 = (int)2.999; // double -> int  exp casting // data lost!! // narrowing!!
        System.out.println("value3 = " + value3); // 2 !!! not 3!!


        /////////////

        int a = 1;
        double b = 1.0;

        System.out.println(a == b);  // int == double !!!  first will convert a data type to double temporarily

        System.out.println("a = " + a);


        System.out.println(" //////////////////////////////// \n");

        System.out.println(1 != 2); // true
        System.out.println(1 == 2);  // false


        System.out.println(" //////////////////////////////// \n");

        boolean haveAkey = true;  // Outer Garden door
        boolean haveBkey = false; // inner door

        // exp to enter house

        boolean enterHouse = haveAkey & haveBkey; // it will check both key unnecessary!!
        enterHouse = haveAkey && haveBkey; // this is correct one!!!


        /////////////////////////////

       boolean haveCkey = true ; //backyard door!!
    enterHouse = (haveAkey && haveBkey) || haveCkey ;

        System.out.println(" //////////////////////////////// \n");
    }
}
