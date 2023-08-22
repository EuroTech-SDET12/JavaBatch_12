package com.days.day14;

public class ForLoops {
    public static void main(String[] args) {
        String name = "Faruk";
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);

        int number = 0;
        System.out.println(number);//0
        ++number;//1
        System.out.println(number);//1
        number++;//2
        System.out.println(number);//2
        number++;//3
        System.out.println(number);//3
        number++;//4
        System.out.println(number);//4
        number++;//5
        System.out.println(number);//5

//              1         2      3
        for (int i = 0; i < 3; i++) {// 0 1 2
            //4
            System.out.println("name = " + name);
        }
        System.out.println("out of the for loop!!!!");
//        System.out.println(i);not reachable  , we can use this variable only inside the for block
        //run
        //part 1 --->create and initialise the variable i=0
        //part 2 --->check the condition whether i<3 or not  , 0<3--->true
        //block executed(part 4) print name
        //part 3 will be executed -->increment ---> i++ --->value of the i is 1
        //part 2---->check the condition 1<3 --->true
        //block executed(part 4) print name
        //part 3 will be executed -->increment ---> i++ --->value of the i is 2
        //part 2---->check the condition 2<3 --->true
        //block executed(part 4) print name
        //part 3 will be executed -->increment ---> i++ --->value of the i is 3
        //part 2---->check the condition 3<3 --->false
        int n;
        for (n = 1; n <= 3; n++) {//  1 2 3
            System.out.println("n = " + n);// n = 1   n = 2  n = 3
        }
        System.out.println("out for loop!!!!");
        System.out.println("n = " + n);// I can reach n  because I declared it before for loop

        System.out.println("=========================");

        // 20 till 30not include 30

        for (int l = 20; l < 30; l++) {//22 24 26 28 30
            System.out.println("l = " + l);//  20 22 24 26 28
            l++;//21 23 25 27 29
        }
        //b=b+2  b+=2
        for (int b = 0; b < 10; b += 2) {
            System.out.println("b = " + b);//0 2 4 6 8
        }
        // 0 5 10 15 20 25 30 35 40 45 50
        int b;
        for (b = 0; b <= 50; b += 5) {
            System.out.println("b = " + b);
        }
        for ( b = 0; b < 10; b++) {
            System.out.println("b = " + b);
        }


    }
}
