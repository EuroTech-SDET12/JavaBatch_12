package com.days.day28;

public class StringMethods {
    public static void main(String[] args) {
        //equals()  Compares this string to the specified object
        String name = "Ali";
        String firstName = new String("veli");
        String var1 = "David";
        String var2 = new String("Ali");
//        ==  compare references
        System.out.println("name.equals(firstName) = " + name.equals(firstName));
        System.out.println("name.equals(var2) = " + name.equals(var2));
        System.out.println("name.equals(\"ali\") = " + name.equals("ali"));//case sensitivty , first letter a, A
        System.out.println("name.equals(\"Ali\") = " + name.equals("Ali"));
        System.out.println("firstName.equals(var1) = " + firstName.equals(var1));
//        equalsIgnoreCase()
        System.out.println("name.equalsIgnoreCase(\"aLI\") = " + name.equalsIgnoreCase("aLI"));
//Compares this String to another String, ignoring case considerations
        System.out.println("name.equalsIgnoreCase(var2) = " + name.equalsIgnoreCase(var2));
// substring()   Returns a string that is a substring of this string
        var1 = "Hello Java!!!";
        //      0123456789012
        System.out.println("var1.substring(0,5) = " + var1.substring(0, 5));
//        Java
        System.out.println("var1.substring(6,10) = " + var1.substring(6, 10));
        String substring = var1.substring(6, 10);
        System.out.println("substring = " + substring);
        System.out.println("var1.substring(6) = " + var1.substring(6));
        //toLowerCase()   Converts all of the characters in this String to lower case
        var1 = "HELLO JAVA!!!";
        System.out.println("var1.toLowerCase() = " + var1.toLowerCase());

        //toUpperCase()  Converts all of the characters in this String to upper case
        var1 = "hello java!!!";
        //    012345
        System.out.println("var1.toUpperCase() = " + var1.toUpperCase());
        System.out.println("var1 = " + var1);
        //HELLO  ???????
        System.out.println("var1.substring(0,5).toUpperCase() = " + var1.substring(0, 5).toUpperCase());
        String hi = "Hello";//   lo
        //           01234
        //         hello java!   !!
        //         David         id

        System.out.println("hi.substring(0,2) = " + hi.substring(0, 2));
        System.out.println("hi.substring(3) = " + hi.substring(3));
        System.out.println("hi.length() = " + hi.length());
        hi = "Hello Java";
        hi = "David";
        System.out.println("hi.substring(hi.length()-2) = " + hi.substring(hi.length() - 2));
        System.out.println("hi.substring(hi.length()-3) = " + hi.substring(hi.length() - 3));


        print2Letters("Hello");
        print2Letters("David");
        print2Letters("Hello Java");
        print2Letters("Hi");
        print2Letters("a");

        //contains()  Returns true if and only if this string contains the specified sequence of char values.
        var1 = "Hello Java";
        System.out.println("var1.contains(\"lo\") = " + var1.contains("lo"));
        System.out.println("var1.contains(hi) = " + var1.contains("hi"));
        System.out.println("var1.contains(hi) = " + var1.contains("o"));
        var1 = "Hello Java";
        //java
        System.out.println("var1.toLowerCase().contains(\"java\") = " + var1.toLowerCase().contains("java"));
//indexOf()   Returns the index within this string of the first occurrence of the specified substring.
        var1 = "one two one";
        //      01234567890
        String str = "Hello Veli Hello";
        System.out.println(str.indexOf("Hello"));
//        Returns the index within this string of the last occurrence of the specified substring
//        System.out.println( var1.lastIndexOf("Hi"));
//        int firstHiIndex = var1.indexOf("Hi");
//        System.out.println( firstHiIndex);
//        System.out.println( var1.indexOf("Hi", firstHiIndex));
        //startswith() Tests if this string starts with the specified prefix.
        System.out.println("str.startsWith(\"He\") = " + str.startsWith("He"));
        //endWith()Tests if this string ends with the specified suffix
        System.out.println("str.endsWith(\"He\") = " + str.endsWith("He"));


        //concat
        var1 = "Hello";
        var2 = "Java";
        System.out.println(var1 + var2);
        System.out.println(var1.concat(var2));
        System.out.println(var1.concat(" " + var2));
        System.out.println(var1.concat(" ".concat(var2)));

        //trim  Returns a string whose value is this string, with all leading and trailing space removed,
        var1 = " Helloo  ";
        System.out.println(var1.trim());
        var1 = " Helloo";
        System.out.println(var1.trim());
        var1 = " Hello Java Hello  ";
        System.out.println(var1.trim());

        //replace()
        System.out.println(var1.replace("Java", "Messi"));
        System.out.println("var1 = " + var1);
        System.out.println("var1.replace(\"Hello\",\"Hi\") = " + var1.replace("Hello", "Hi"));


    }

    public static void print2Letters(String hi) {
        if (hi.length() >= 2) {
            System.out.println("hi.substring(0,2) = " + hi.substring(0, 2));
            System.out.println("hi.substring(hi.length()-2) = " + hi.substring(hi.length() - 2));
        } else {
            System.out.println("hi = " + hi);
        }
    }


}
