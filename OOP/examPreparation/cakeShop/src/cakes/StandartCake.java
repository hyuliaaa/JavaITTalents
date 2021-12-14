package cakes;

import java.util.Random;

public class StandartCake extends Cake{


   // private final String[] cakeTypes= {"Biscuit","Ecler","Fruity", "Choco"};
    private boolean hasSyrop;

    public StandartCake(String name, int price, int pieces, boolean hasSyrop) {
        super(name, price, pieces);
        this.hasSyrop = hasSyrop;
        kind = getKind();
        type = getType();
    }


    @Override
    protected String getRandomType() {
        String[] cakeTypes = {"Biscuit","Ecler","Fruity", "Choco"};
        return cakeTypes[new Random().nextInt(cakeTypes.length)];
    }

    @Override
    public String getKind() {
        return "StandartCake";
    }


    @Override
    public int compareTo(Cake o) {
        return this.getPrice()-o.getPrice();
    }
}
