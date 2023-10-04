package com.days.day42;

public class StaticFields {


   public int value; //instance field
   public static int count;

    public StaticFields() {
//        static int number = 11;
    }


    public void test(){
//        static int number = 22;
    }


    public static void main(String[] args) {
//        static int number = 33;
    }

    {
        // THIS IS A BLOCK!!!
//        static int number = 44;
    }

    static {
        // THIS IS A STATIC BLOCK!!!
//        static int number = 55;
    }
}
