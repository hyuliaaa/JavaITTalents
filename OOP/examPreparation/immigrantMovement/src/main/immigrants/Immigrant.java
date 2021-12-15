package main.immigrants;

import main.City;
import main.Country;
import main.weapons.Bomb;
import main.weapons.IWeapon;
import main.weapons.Weapon;

import java.util.ArrayList;
import java.util.Random;

public abstract class Immigrant  {
    private String name;
    protected Passport passport;
    protected double money;
    private City currentCity;
    private Country currentCountry;
    protected ArrayList<Immigrant> relatives;
    private boolean hasPassport;

    public Immigrant(String name, double money) {
        this.name = name;
        hasPassport = validatePassport();
        this.money = money;
        relatives = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public City getCurrentCity() {
        return currentCity;
    }

    public Country getCurrentCountry() {
        return currentCountry;
    }

    public abstract void buyWeapon(Weapon weapon);

    public boolean HasPassport() {
        return hasPassport;
    }

    public abstract boolean hasBomb();

    public abstract boolean validatePassport();

    public void immigrate(){
        ArrayList<City> cityArrayList = new ArrayList<>(this.getCurrentCountry().getCities());
        this.currentCity = cityArrayList.get(new Random().nextInt(cityArrayList.size()));
    }

    @Override
    public String toString() {
        return "Immigrant{" +
                "name='" + name + '\'' +
                ", hasPasport=" + hasPassport +
                ", money=" + money +
                '}';
    }

    public  void setCounty(Country country){
        this.currentCountry = country;
    }


    public void setCurrentCity(City currentCity) {
        this.currentCity = currentCity;
    }
}
