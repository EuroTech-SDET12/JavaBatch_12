package com.days.day54;

import java.util.Stack;

public class StackSample {

    public static void main(String[] args) {

        Stack<String> stackObj = new Stack<>();

        stackObj.add("R");
        stackObj.add("a");
        stackObj.add("b");
        stackObj.add("b");
        stackObj.add("i");
        System.out.println("stackObj = " + stackObj);

        System.out.println("stackObj.push(\"t\") = " + stackObj.push("t"));
        System.out.println("stackObj = " + stackObj);

        System.out.println("stackObj.pop() = " + stackObj.pop());
        System.out.println("stackObj = " + stackObj);

        System.out.println("stackObj.peek() = " + stackObj.peek());
        System.out.println("stackObj = " + stackObj);
    }
}
