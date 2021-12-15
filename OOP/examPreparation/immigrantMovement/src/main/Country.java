package main;

import main.immigrants.Immigrant;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Country {
    private String name;
    private TreeSet<City> cities;
    private ArrayList<Immigrant> immigrants;

    Country(String name){
        cities = new TreeSet<>();
        immigrants = new ArrayList<>();
        this.name = name;
        for (int i =0; i < 5;i++){
            cities.add(new City("City" + i,this));
        }
    }


    public TreeSet<City> getCities() {
        return cities;
    }

    public void addImmigrant(Immigrant immigrant) {
        immigrant.setCounty(this);
        ArrayList<City> cityArrayList = new ArrayList<>(cities);
        int chanceChanceOfEnteringCity = new Random().nextInt(5);
        switch (chanceChanceOfEnteringCity) {
            case 0 -> cityArrayList.get(0).addImmigrant(immigrant);
            case 1 -> cityArrayList.get(1).addImmigrant(immigrant);
            case 2 -> cityArrayList.get(2).addImmigrant(immigrant);
            case 3 -> cityArrayList.get(3).addImmigrant(immigrant);
            case 4 -> cityArrayList.get(4).addImmigrant(immigrant);
        }

    }

    public ArrayList<Immigrant> getImmigrants() {
        return immigrants;
    }

    public void printCitiesWithImmigrants(){
        System.out.println("======CITIES WITH IMMIGRANTS=========");
        for (City city : cities) {
            city.printImmigrantsInCity();
        }
    }


    public void addValidImmigrant(Immigrant immigrant) {
        immigrants.add(immigrant);
    }
}
