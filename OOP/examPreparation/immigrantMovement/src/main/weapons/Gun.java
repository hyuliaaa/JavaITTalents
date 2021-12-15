package main.weapons;

public class Gun extends Weapon implements RadicalWeapon{
    public Gun(double price) {
        super(price);
    }

    @Override
    public String getType() {
        return "Gun";
    }
}
