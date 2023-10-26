package com.days.day57;

import java.util.function.Consumer;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = (name) -> System.out.println("Hello " + name);
        printer.print("Benzema");
        printer.print("Harry");
        printer.print("Marry");

        Consumer consumer = (n) -> System.out.println(Math.pow((Integer) n, 2));
        consumer.accept(10);

    }
}
