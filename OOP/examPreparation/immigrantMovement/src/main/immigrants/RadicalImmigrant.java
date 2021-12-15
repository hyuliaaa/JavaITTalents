package main.immigrants;

import main.weapons.IWeapon;

import java.util.ArrayList;
import java.util.Random;

public class RadicalImmigrant extends RadicalAndExtreme {
    public RadicalImmigrant(String name,double money) {
        super(name,money);
        weapons = new ArrayList<>(5);
    }

    @Override
    public boolean validatePassport() {
        return new Random().nextInt(100) < 35;
    }

    public int shoot(){
        int rand = new Random().nextInt(100);
        int totalbullets = 0;
        int totalVictims = 0;
        for (IWeapon weapon : weapons) {
            int bullets =new Random().nextInt(100);
            int victims = (getRandomVictimPersentage()/100)*bullets;
            totalVictims += victims;
            totalbullets += bullets;

        }

        this.getCurrentCity().decreasePopulation(totalVictims);
        return totalbullets;
    }

    private int getRandomVictimPersentage(){
        return new Random().nextInt(61) + 10;
    }


}
