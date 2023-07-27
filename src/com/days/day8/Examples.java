package com.days.day8;

public class Examples {
    public static void main(String[] args) {
        //double float long int short byte
        short var1 = 55;
        int var2 = var1;
        System.out.println("var2 = " + var2);
        byte var3 = (byte) var2;
        double var4 = 87.43;
        var2 = (int) var4;
        System.out.println("var2 = " + var2);
        //byte -->1 byte 256
        byte var6 = (byte) 280;// if the value is over then 256 module 256
        System.out.println("var6 = " + var6);//24 --> 280-256
        var6 = (byte) 200;//value is over then 127
        System.out.println("var6 = " + var6);//256-200 -56
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        short var8 = (short) 40000;//65534-40000=-25536   2 bytes can keep max 65534
        System.out.println("var8 = " + var8);
        System.out.println(32767 * 2);
        short var9 = (short) 65540;// 65540-65534
        System.out.println("var9 = " + var9);

        //short + byte ---> int
        //double + int ---> double
        System.out.println(10 / 4);//int / int --> int
        System.out.println((double) 10 / 4);// double / int--->double
        System.out.println(10 / (double) 4);// int  / double ---->double
        System.out.println((double) (10 / 4));//int / int --> convert to double  2.0

    }
}
