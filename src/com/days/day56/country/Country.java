package com.days.day56.country;

public enum Country {

    TURKEY(85), GERMANY(80), UK(70), INDIA(1500), SPAIN(50), NIGERIA(100);
    int population;

    Country(int population) {
        this.population = population;
    }
}
