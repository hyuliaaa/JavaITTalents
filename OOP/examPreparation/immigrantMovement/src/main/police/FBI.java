package main.police;

import main.City;
import main.Country;
import main.immigrants.*;

import java.util.Random;

public class FBI extends Police{
    public FBI(String name, Country workCountry, City workCity) {
        super(name, workCountry, workCity);
    }




    public boolean catchImmigrant(Immigrant immigrant) {
        int chance = new Random().nextInt(100);
        if(chance <getChanceOfCatching()){
            System.out.println("Immigrant "+ immigrant.getName()+" is caught");
            return true;
        }
        else {
            System.out.println("Immigrant "+ immigrant.getName()+" ran away!");
            return false;
        }

    }

    @Override
    public int getChanceOfCatching() {
        return 90;
    }




    @Override
    public boolean check(Immigrant immigrant) { //todo ask how to ogranichish tipa
        if(immigrant instanceof NormalImmigrant){
            return false;
        }
        if (immigrant instanceof RadicalImmigrant){
            if(immigrant.HasPassport()){
                return true;
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
