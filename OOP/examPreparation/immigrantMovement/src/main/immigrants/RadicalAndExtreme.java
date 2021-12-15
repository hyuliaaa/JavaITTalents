package main.immigrants;

import main.weapons.IWeapon;
import main.weapons.Weapon;

import java.util.ArrayList;

public abstract class RadicalAndExtreme extends Immigrant {
    protected ArrayList<IWeapon> weapons;

    public RadicalAndExtreme(String name, double money) {
        super(name, money);
        weapons = new ArrayList<>();
    }




    public void buyWeapon(Weapon weapon){
        if(this.money >weapon.getPrice()){
            this.money -= weapon.getPrice();
            System.out.println(this.getName() +" buys!!!");
            weapons.add(weapon);
        }
        else {
            System.out.println("Immigrant "+this.getName()+" doesn't have enough money to buy this weapon");
            getCurrentCity().getImmigrants().remove(this);
            getCurrentCountry().getImmigrants().remove(this);
        }
    }

    public ArrayList<IWeapon> getWeapons() {
        return weapons;
    }
    public boolean hasBomb(){
        for (IWeapon weapon : weapons) {
            if(weapon.getType().equals("Bomb")){
                return true;
            }
        }
        return false;
    }
}
