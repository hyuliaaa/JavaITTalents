package bows;

public class AluminumBow extends SeniorBow{

    public AluminumBow(double weight, int power) {
        super(weight, power);
        scope = 1;
    }

    @Override
    boolean checkPower(int power) {
        return power >=25 && power <=45;
    }
}
