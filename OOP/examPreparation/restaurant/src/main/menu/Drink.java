package main.menu;

public abstract class Drink extends MenuItem {
    Drink(String name, double price) {
        super(name, price);

    }

    @Override
    public MenuKind getKind() {
        return MenuKind.DRINK;
    }
}
