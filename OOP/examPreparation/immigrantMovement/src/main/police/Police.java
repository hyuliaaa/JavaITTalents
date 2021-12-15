package main.police;

import main.City;
import main.Country;
import main.immigrants.Immigrant;

public abstract class Police {
    private String name;
    private Country workCountry;
    private City workCity;

    public Police(String name, Country workCountry, City workCity) {
        this.name = name;
        this.workCountry = workCountry;
        this.workCity = workCity;
    }


    public abstract boolean catchImmigrant(Immigrant immigrant);
    public abstract int getChanceOfCatching();

    public abstract boolean check(Immigrant immigrant);
}
