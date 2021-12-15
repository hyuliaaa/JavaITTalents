package main.weapons;

public class Bomb extends Weapon implements IWeapon{
    public Bomb(double price) {
        super(price);
    }

    @Override
    public String getType() {
        return "Bomb";
    }
}
