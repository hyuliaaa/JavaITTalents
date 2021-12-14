package cakes;

import java.util.Random;

public class SpecialCake extends Cake{

   // private final String[] cakeTypes = {"Anniversary","Firm", "Reclam"};
    private String eventName;

    public SpecialCake(String name, int price, int pieces, String eventName) {
        super(name, price, pieces);
        kind = getKind();
        type = getType();
        this.eventName = eventName;
    }

    @Override
    protected String getRandomType() {
        String[] cakeTypes = {"Anniversary","Firm", "Reclam"};
        return cakeTypes[new Random().nextInt(cakeTypes.length)];
    }


    @Override
    public String getKind() {
        return "SpecialCake";
    }


    @Override
    public int compareTo(Cake o) {
        return this.getPrice()-o.getPrice();
    }
}

