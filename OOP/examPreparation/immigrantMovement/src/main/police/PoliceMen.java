package main.police;

import main.City;
import main.Country;
import main.immigrants.Immigrant;
import main.immigrants.NormalImmigrant;
import main.immigrants.RadicalImmigrant;

import java.util.Random;

public class PoliceMen extends Police{
    public PoliceMen(String name, Country workCountry, City workCity) {
        super(name, workCountry, workCity);
    }


    public boolean catchImmigrant(Immigrant immigrant) {
        if(immigrant.hasBomb()){
            System.out.println("Immigrant ran away!");
            return false;
        }
        int chance = new Random().nextInt(100);
        if(chance <getChanceOfCatching()){
            System.out.println("Immigrant "+ immigrant.getName()+" is caught");
            return true;
        }
        else {
            System.out.println("Immigrant "+ immigrant.getName() +" ran away!");
            return false;
        }

    }


    @Override
    public int getChanceOfCatching() {
        return 50;
    }


    @Override
    public boolean check(Immigrant immigrant) {
        if(immigrant instanceof NormalImmigrant){
            return true;
        }
        else if (immigrant instanceof RadicalImmigrant){
            if(immigrant.HasPassport()){
                return true;
            }
            else {
                if(catchImmigrant(immigrant)){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        else {
            if(catchImmigrant(immigrant)) {
                return false;
            }
            else {
                return true;
            }
        }
    }
}
