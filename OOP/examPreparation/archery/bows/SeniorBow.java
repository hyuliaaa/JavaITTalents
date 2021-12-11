package bows;

public abstract class SeniorBow extends Bow{

    protected int scope = 1;
    public SeniorBow(double weight, int power) {
        super(weight, power);
    }

    public int getScope() {
        return scope;
    }
}
