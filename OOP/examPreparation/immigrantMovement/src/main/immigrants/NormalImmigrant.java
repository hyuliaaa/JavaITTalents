package main.immigrants;

import main.weapons.Weapon;

import java.util.ArrayList;

public class NormalImmigrant extends Immigrant {


    public NormalImmigrant(String name, double money) {
        super(name,money);
        relatives = new ArrayList<>(10);

    }

    @Override
    public void buyWeapon(Weapon weapon) {
        System.out.println("Normal immigrant "+ this.getName()+" cannot buy weapons!");
    }

    @Override
    public boolean hasBomb() {
        return false;
    }

    @Override
    public boolean validatePassport() {
        return true;
    }
}
