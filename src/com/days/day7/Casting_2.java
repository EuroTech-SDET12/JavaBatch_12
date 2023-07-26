package com.days.day7;

public class Casting_2 {
    public static void main(String[] args) {
        // double - float - long - int - short - byte
        // larger to smaller
        int n = (int) 68.78;//double -->int  larger to smaller  --->explicitly
        short s = (short) n;// int ---> short --->larger to smaller ---->explicitly

        byte b = 68;
        double num = b;// byte --->double  smalller to larger --> implicitly

        System.out.println(124.68);
        System.out.println((int)124.68);

        //10 implictly and 10 explictly casting samples


    }
}
