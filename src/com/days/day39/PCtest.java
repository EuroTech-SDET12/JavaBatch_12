package com.days.day39;

public class PCtest {

    public static void main(String[] args) {

        PC pc1 = new PC("IBM");
        pc1.setPrice(1000);
        pc1.label = 'B';


        PC pc2 = new PC("VPN", -111);
        pc2.setPrice(222);
        pc2.setOS("Windows");
        System.out.println("pc2.getOS() = " + pc2.getOS());
    }
}
