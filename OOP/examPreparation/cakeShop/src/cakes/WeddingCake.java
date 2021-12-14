package cakes;

import java.util.Random;

public class WeddingCake extends Cake {

    //private final String[] cakeTypes= {"Big","Small","Medium"};
    private int layer;

    public WeddingCake(String name, int price, int pieces, int layer) {
        super(name, price, pieces);
        kind = getKind();
        type = getType();
        this.layer = layer;
    }

    @Override
    protected String getRandomType() {
        String[] cakeTypes = {"Big","Small","Medium"};
        return cakeTypes[new Random().nextInt(cakeTypes.length)];
    }


    @Override
    public String getKind() {
        return "WeddingCake";
    }


    @Override
    public int compareTo(Cake o) {
        return this.getPieces()-o.getPieces();
    }
}
