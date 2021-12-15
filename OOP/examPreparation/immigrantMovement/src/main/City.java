package main;

import main.immigrants.Immigrant;
import main.police.FBI;
import main.police.Police;
import main.police.PoliceMen;

import java.util.ArrayList;
import java.util.Random;

public class City implements Comparable<City>{
    private String name;
    private ArrayList <Police> policeMen;
    private int population;
    private ArrayList<Immigrant> immigrants;
    private Country country;

    public City(String name, Country country) {
        this.name = name;
        this.country = country;
        this.policeMen = new ArrayList<>(generatePoliceMen());
        this.population = generatePopulation();
        immigrants = new ArrayList<>();

    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    private int generatePopulation(){
        return new Random().nextInt(501) + 500;// (10 000 - 100 000)
    }

    private ArrayList<Police> generatePoliceMen(){
            ArrayList<Police> list = new ArrayList<>();
            int policeNumber = new Random().nextInt(20) + 10;
            for (int i = 0 ; i < policeNumber; i++){
                if(new Random().nextBoolean()){
                    list.add(new PoliceMen("PoliceMan" +1,country,this));
                }
                else {
                    list.add(new FBI("FBI" + 1,country,this));
                }

            }
            return list;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(City other) {
        return this.getName().compareTo(other.getName());
    }

    public void addImmigrant(Immigrant immigrant){
        immigrant.setCurrentCity(this);
        Police police = getRandomPolice();
        if(police.check(immigrant)){
            System.out.println(immigrant.getName() + " enters the city");
            immigrants.add(immigrant);
            country.addValidImmigrant(immigrant);
        }else {
            System.out.println("This immigrant "+immigrant.getName()+" doesn't enter the city!");
        }

    }

    private Police getRandomPolice() {
        return policeMen.get(new Random().nextInt(policeMen.size()));
    }

    public ArrayList<Immigrant> getImmigrants() {
        return immigrants;
    }

    public void decreasePopulation(int value){
        population-=value;
    }

    public void printImmigrantsInCity(){
        System.out.println("========="+ this.name+"===========");
        for (Immigrant immigrant : immigrants) {
            System.out.println(immigrant);
        }
    }
}
