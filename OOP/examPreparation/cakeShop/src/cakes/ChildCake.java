package cakes;

import java.util.Random;

public class ChildCake extends Cake{

   // private String[] cakeTypes = {"Birthday","Baptism","FirstSteps"};
    private String childName;

    public ChildCake(String name, int price, int pieces, String childName) {
        super(name, price, pieces);
        this.childName = childName;

    }


    @Override
    public String getKind() {
        return "ChildCake";
    }

    protected String getRandomType(){
        String[] cakeTypes = {"Birthday","Baptism","FirstSteps"};
        return cakeTypes[new Random().nextInt(cakeTypes.length)];
    }


    @Override
    public int compareTo(Cake o) {
        return this.getPieces()-o.getPieces();
    }
}
