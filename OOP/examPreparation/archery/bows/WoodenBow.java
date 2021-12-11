package bows;

public class WoodenBow extends Bow{

    public WoodenBow(double weight, int power) {
        super(weight, power);

    }

    @Override
    boolean checkPower(int power) {
        return power >=20 && power <=30;
    }
}
