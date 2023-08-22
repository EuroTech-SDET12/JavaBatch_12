package com.days.day15;

public class ForLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // 0 1 2 3 4
            System.out.println("Hello for loops!!!");
        }
        for (int i = 0; i < 3; i++) { // 0 1 2
            System.out.println("Hello ");
            System.out.print("Ali");
            //Hello
            //AliHello
            //AliHello
            //Ali
        }
        System.out.println();
        for (int i = 0; i < 3; i++) { // 0 1 2
            System.out.print("Hello ");
            System.out.println("Ali");
            //Hello Ali
            //Hello Ali
            //Hello Ali

        }
        for (int i = 0; i < 3; i++) { // 0 1 2
            System.out.print("Hello ");
            System.out.print("Ali\n");
            System.out.println();
            //Hello Ali
            //Hello Ali
            //Hello Ali
        }
//Hello Ali
//Hello Ali
//Hello Ali

        // get sum of the numbers between 1-10
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int sum = a;
        sum = sum + b;//3
        sum = sum + c;//3+3
        sum = sum + 4;
        sum = sum + 5;
        sum = 0;
        for (int i = 1; i < 10; i++) {// 2 3 4 5 6 7 8 9 10
            sum = sum + i;
//                = 0 + 1  --->            sum=1  --->first iteration
//                  = 1 + 2 --->           sum=3   --->second iteration
//                  = 3 + 3   ---->          sum=6
//                    = 6 + 4   ---->         sum=10
//                    = 10 + 5  ---->         sum=15
//                    = 15 + 6  ---->         sum=21
//                    = 21 + 7  ---->         sum=28
//                    = 28 + 8  ---->         sum=36
//                    = 36 + 9  ---->         sum=45
            System.out.println("sum = " + sum);
        }
        System.out.println("sum = " + sum);


        for (int i = 1; i < 10; i++) {
            int result = i;//if we create a variable inside a block then we cant use/reach it out of the block
        }

//        result not reachable
        System.out.println("===================");

        // get sum of the even and odd numbers seperately between 1-20
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
               // System.out.println("even " + i);
                evenSum += i;// evenSum = evenSum + i;
            } else { //i%2!=0   or i%2==1
               // System.out.println("odd " + i);
                oddSum += i;//  oddSum = oddSum + i;
            }
        }
        System.out.println("evenSum = " + evenSum);
        System.out.println("oddSum = " + oddSum);


    }
}
