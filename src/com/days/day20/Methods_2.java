package com.days.day20;

public class Methods_2 {
    public static void main(String[] args) {
        // addition--> method --> 2 parameter int ,  int  print sum of the values
        // substraction--> method --> 2 parameter int ,  int  print result
        // multiplication--> method --> 2 parameter int ,  int  print result
        // division-> method --> 2 parameter int ,  int  print result
        int a, b = 20;
        a = 10;
        addition(a, b);
        addition(20, 30);
        substraction(20, 40);//20
        substraction(120, 40);//80
        multiplication(a, b);
        multiplication(5, 20);
        division(20, 5);
        division(100, 20);
        //fourOperation()----> 3 parameter 1 String operation, int a, int b
        //switch statement
//        fourOperation("add",10,20);print--->30  addition(10, 20);
//        fourOperation("multiply",5,20);print--->100 multiplication(5, 20);
//        fourOperation("divide",500,20);print--->25  division(500, 20);
//        fourOperation("substract",100,20);print--->80 substraction(100, 20);

        fourOperation("add", 10, 20);
        fourOperation("multiply",5,20);
        fourOperation("divide",500,20);
        fourOperation("substract",100,20);
        fourOperation("SQRT",100,20);
    }

    static void fourOperation(String operation, int var1, int var2) {
        switch (operation) {
            case "add":
                addition(var1, var2);
                break;
            case "multiply":
                multiplication(var1, var2);
                break;
            case "divide":
                division(var1, var2);
                break;
            case "substract":
                substraction(var1, var2);
                break;
            default:
                System.out.println("Operator couldnt be found!!!!!");
        }
    }

    static void division(int a, int b) {
        double result = a / b;
        System.out.println("result = " + result);
    }

    static void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("result = " + result);
    }

    static void substraction(int a, int b) {
        int sum = a > b ? a - b : b - a;
//        if (a > b) {
//            sum = a - b;
//        } else {
//            sum = b - a;
//        }
        System.out.println("sum = " + sum);
    }

    static void addition(int a, int b) {
        int sum = a + b;
        System.out.println("sum = " + sum);
    }
}
