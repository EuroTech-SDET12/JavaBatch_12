package com.days.day41;

public class Builder {
    public static void main(String[] args) {
        String name = "Ronaldo";

        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name = " + name);//immutable


//        StringBuilder
//        StringBuffer

//        StringBuilder class is mutable
        StringBuilder builder = new StringBuilder("Hello Java!!!");
        StringBuilder builder1 = new StringBuilder(name);
        System.out.println("builder = " + builder);
        System.out.println(builder.append(" Hello Selenium!!!"));
        System.out.println("builder = " + builder);//StringBuilder class is mutable
//        builder = new StringBuilder("Hello");
        System.out.println("builder.reverse() = " + builder.reverse());
        System.out.println("builder = " + builder);
        builder.reverse();
        System.out.println("builder = " + builder);
//        Hello Java!!! Hello Selenium!!!
//          0123456789012
        builder.deleteCharAt(12);
        builder.deleteCharAt(builder.length() - 1);
        System.out.println("builder = " + builder);
        System.out.println("builder.indexOf(\"Java\") = " + builder.indexOf("Java"));
        builder.insert(0, "Hi");
        System.out.println("builder = " + builder);
        builder.replace(2, 7, "");
        System.out.println("builder = " + builder);

        String var1 = new String("Hello Java!!!");
        System.out.println("var1 = " + var1);
        System.out.println(var1.replace("Java", "Selenium"));
        System.out.println("var1 = " + var1);

        StringBuilder builder5 = new StringBuilder("Hello Java!!!");
        //                                          01234567890
        System.out.println( builder5.replace(6,10,"Selenium"));
        System.out.println("builder5 = " + builder5);


    }
}
