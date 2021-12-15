package main.immigrants;

import main.City;
import main.Country;

public class Passport {
    private String name;
    private int age;
    private Country birthCountry;
    private City birthCity;


    public Passport(String name, int age, Country birthCountry, City birthCity) {
        this.name = name;
        this.age = age;
        this.birthCountry = birthCountry;
        this.birthCity = birthCity;
    }
}
