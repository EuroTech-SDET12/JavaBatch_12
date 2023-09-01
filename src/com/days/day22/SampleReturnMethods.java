package com.days.day22;

public class SampleReturnMethods {

    public static void main(String[] args) {
        // test1

        String expected= "£68"; // it should come from db

        String actualPrice = getElementText("PRICE");

        //
        if (expected.equals(actualPrice)){   //expected==(actualPrice)
            System.out.println("TEST PASSED!!!");
        }

    }


    public static String getElementText(String element){

        // sadasdasdasdasdasfdfsdfsf
      //  System.out.println("£68");
        return "£68";
    }
}
