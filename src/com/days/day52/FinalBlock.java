package com.days.day52;

public class FinalBlock {

    public static void main(String[] args) {
        System.out.println("START");

        int[]arry= {12,13};
        System.out.println("arry[3] = " + arry[3]);

        try {
            System.out.println("--- TRY BLOCK ---");
//            String value = "TEST";
            String value = null;
            System.out.println("value.length() = " + value.length());

        } catch (ArithmeticException e) {
            System.out.println("--- CATCH BLOCK ---");
            System.out.println("Arithmetic Exception exist!!");
            System.out.println("TEST FAILED!!!");
        } catch (NullPointerException e) {
            System.out.println("--- CATCH BLOCK ---");
            System.out.println("NullPointer Exception exist!!");
            System.out.println("TEST FAILED!!!");
        }finally {
            System.out.println("--- FINALLY BLOCK ---");
            System.out.println("CLOSE DB CONNECTION");
        }

        System.out.println("END of MAIN METHOD");
    }
}
