package com.days.day23;

public class Test_MobilePhone {

    public static void main(String[] args) {


        MobilePhone iphone = new MobilePhone();
        MobilePhone.phoneCount++;
//        MobilePhone.ramSize++; ramSize is instance field,
//        belongs to object, so call with object!!!!!!!!!!
        iphone.model = "11proMax";
        iphone.ramSize = 12;
        iphone.memory = 64;
        iphone.isResistanceToWater=true;

        System.out.println(iphone);
        System.out.println("iphone.model = " + iphone.model);

        System.out.println("|||||||||||||||||||||||||||||||||||||");

        MobilePhone samsung = new MobilePhone();
        MobilePhone.phoneCount++;
        samsung.model= "GalaxyS20";
        samsung.ramSize=8;
        samsung.memory = 128;
        samsung.isResistanceToWater= false;

        System.out.println(samsung);
        System.out.println("samsung.model = " + samsung.model);

        System.out.println("MobilePhone.phoneCount = " + MobilePhone.phoneCount);

    }
}
