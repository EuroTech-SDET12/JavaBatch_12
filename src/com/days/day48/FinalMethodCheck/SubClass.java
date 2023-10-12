package com.days.day48.FinalMethodCheck;

public class SubClass extends FinalMethod {
    @Override
    public void drawing(String shape) {
        shape += " CHILD";
        super.drawing(shape);
    }

    // this is not overriding, different signature
        public void driveTheCar(int name) {
        System.out.println("CHILD IS DRIVING THe CAR HO HO HOO!!");
    }

//    @Override
//    public void driveTheCar() {
//        System.out.println("CHILD IS DRIVING THe CAR HO HO HOO!!");
//    }

    public static void main(String[] args) {

        SubClass obj1 = new SubClass();

        obj1.drawing("CIRCLE");
        obj1.driveTheCar();
    }
}
