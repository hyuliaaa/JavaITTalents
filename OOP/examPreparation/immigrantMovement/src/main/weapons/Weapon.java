package main.weapons;

public abstract class Weapon implements IWeapon {
    private String type;
    private double price;

    public Weapon(double price){
        this.price = price;
        type = getType();
    }

    public  abstract String getType();

    public  double getPrice(){
        return price;
    }
}
