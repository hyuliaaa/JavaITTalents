package bows;

public abstract class Bow {
    private String manufacturer;
    protected double weight;
    protected int power;

    public Bow(double weight, int power){
        this.weight = weight;
        if(checkPower(power)) {
            this.power = power;
        }
    }

    abstract boolean checkPower(int power);
}
