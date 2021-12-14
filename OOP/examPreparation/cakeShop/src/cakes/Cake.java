package cakes;

public abstract class Cake implements Comparable<Cake> {
    private String name;
    private String description;
    private int price;
    private int pieces;
    protected String kind;
    protected String type;


    Cake(String name,int price, int pieces){
        this.price = price;
        this.name = name;
        this.pieces = pieces;
        this.kind = getKind();
        this.type = getRandomType();
    }

    Cake(String name){
        this.name = name;
        description ="";
        price = 0;
        pieces = 0;
        this.kind = getKind();
        this.type = getRandomType();
    }

    protected abstract String getRandomType();
    public abstract String getKind();
    public  String getType(){return type;}



    public int getPrice() {
        return price;
    }

    public int getPieces() {
        return pieces;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", pieces=" + pieces +
                '}';
    }
}
