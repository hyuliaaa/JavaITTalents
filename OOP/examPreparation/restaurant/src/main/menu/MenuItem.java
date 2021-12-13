package main.menu;

public abstract class MenuItem implements IMenuItem{
    private String name;
    private double price;
    protected MenuItemType type;

    MenuItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }


}
