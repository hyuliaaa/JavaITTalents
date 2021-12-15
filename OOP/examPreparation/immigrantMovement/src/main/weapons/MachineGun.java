package main.weapons;

public class MachineGun extends Weapon implements RadicalWeapon{
    public MachineGun(double price) {
        super(price);
    }

    @Override
    public String getType() {
        return "Machine Gun";
    }
}
