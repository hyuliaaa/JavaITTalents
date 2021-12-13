package main.menu;
public abstract class Meal extends MenuItem{
    protected int quantity;

    Meal(String name, double price, int quantity) {
        super(name, price);
        this.quantity = validateQuantity(quantity);
    }

    @Override
    public MenuKind getKind() {
        return MenuKind.MEAL;
    }

    protected abstract int validateQuantity(int quantity);
}
