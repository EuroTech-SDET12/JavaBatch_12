package com.days.day56.garage;


import java.util.ArrayList;

public class Brands {
    enum CarBrands {
        HONDA(8000), TOYOTA(7000), BMW(10000), OPEL(6000), FERRARI(30000);
        double price;

        CarBrands(double price) {
            this.price = price;
        }

    }

    public static void main(String[] args) {

        System.out.println("CarBrands.HONDA = " + CarBrands.HONDA);
        CarBrands car = CarBrands.HONDA;
        System.out.println("car.price = " + car.price);

    }
}

class Garage {
    ArrayList<Brands.CarBrands> brands;

    Garage(ArrayList<Brands.CarBrands> brands) {
        this.brands = brands;
    }




}

class GarageTest {
    public static void main(String[] args) {
        Brands.CarBrands honda = Brands.CarBrands.HONDA;
        Brands.CarBrands bmw = Brands.CarBrands.BMW;
        ArrayList<Brands.CarBrands> myCarList = new ArrayList<>();
        myCarList.add(honda);
        myCarList.add(bmw);

        Garage myGarage = new Garage(myCarList);

    }
}
