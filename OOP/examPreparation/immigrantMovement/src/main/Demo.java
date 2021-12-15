package main;

import main.immigrants.ExtremistImigrant;
import main.immigrants.Immigrant;
import main.immigrants.NormalImmigrant;
import main.immigrants.RadicalImmigrant;
import main.police.FBI;
import main.police.Police;
import main.police.PoliceMen;
import main.weapons.Bomb;
import main.weapons.Gun;
import main.weapons.MachineGun;
import main.weapons.Weapon;

import java.nio.file.Watchable;
import java.util.ArrayList;
import java.util.Random;

public class Demo {
    static int generateMoney(){ return new Random().nextInt(501);}
    private static final String[] names = {"Alex","Moni", "Niki","Doni"};
    private static int end = 1;
    static String generateName() {
        return names[new Random().nextInt(names.length)] + end++;
    }

    public static void main(String[] args) {
        Country bulgaria = new Country("Bulgaria");

        ArrayList<Immigrant> immigrants = new ArrayList<>();
        Immigrant immigrant;
        for(int i =0; i <100;i++){
            int chance = new Random().nextInt(100);
            if(chance< 25){
                immigrant = new RadicalImmigrant(generateName(),generateMoney());
            }
            if(chance < 60){
                immigrant = new ExtremistImigrant(generateName(),generateMoney());
            }
            else {
                immigrant = new NormalImmigrant(generateName(),generateMoney());
            }
            immigrants.add(immigrant);
            bulgaria.addImmigrant(immigrant);
        }

        ArrayList<Weapon> weapons = new ArrayList<>();
        Weapon weapon;
        for(int i = 0; i <200; i++){
            int chance = new Random().nextInt(100);
            if(chance <33){
                weapon = new Gun(50);
            }
            if(chance < 66){
                weapon = new MachineGun(250);
            }
            else {
                weapon = new Bomb(450);
            }
            weapons.add(weapon);
        }

        bulgaria.printCitiesWithImmigrants();

        int size = bulgaria.getImmigrants().size();
        for(int i = 0; i <size;i++){
            System.out.println((bulgaria.getImmigrants().get(i)));

        }


        System.out.println(size);
        for(int i = 0; i < size;i++) {
            for (int j = 0; j < 5; j++) {
                Weapon w = getRandomWeapon(weapons);
                if(w !=null) {
                    bulgaria.getImmigrants().get(i).buyWeapon(w);
                    weapons.remove(w);
                }else {
                    System.out.println("No weapons left");
                    break;
                }


            }

        }







    }

    static Weapon getRandomWeapon(ArrayList<Weapon> weapons){

        return weapons.get(new Random().nextInt(weapons.size()));
    }
}
