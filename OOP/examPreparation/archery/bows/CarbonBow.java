package bows;

public class CarbonBow extends SeniorBow{

    int scope = 2;
    int stabilization = 1;
    public CarbonBow(double weight, int power) {
        super(weight, power);
    }

    @Override
    boolean checkPower(int power) {
        return power >=28 && power<=48;
    }

    @Override
    public int getScope() {
        return scope;
    }

    public int getStabilization() {
        return stabilization;
    }
}
