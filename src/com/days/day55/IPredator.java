package com.days.day55;

public interface IPredator {

//    IPredator() { constructor is not allowed in interfaces
//
//    }

    String forest = "Amazon";
//   public static final String forest = "Amazon";
//    Modifier 'public' is redundant for interface members
//    Modifier 'static' is redundant for interface fields
//    Modifier 'final' is redundant for interface fields

    void hunt();

    void hunt(String animal);

    //    public abstract void hunt();
//    Modifier 'public' and 'abstract' is redundant for interface members
    static void observing() {
        System.out.println("Predators observing around to hunt.");
    }

}
