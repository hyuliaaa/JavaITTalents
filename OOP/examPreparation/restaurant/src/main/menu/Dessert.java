package main.menu;

public class Dessert extends Meal{
    Dessert(String name, int quantity) {
        super(name,4, quantity);
        type = MenuItemType.DESSERT;
    }

    @Override
    protected int validateQuantity(int quantity) {
        return quantity >=200 && quantity <=300 ? quantity : 250;
    }

    @Override
    public MenuItemType getType() {
        return MenuItemType.DESSERT;
    }
}
