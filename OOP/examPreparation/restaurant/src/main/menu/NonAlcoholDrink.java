package main.menu;

public class NonAlcoholDrink extends Drink implements IVeganItem{
    NonAlcoholDrink(String name) {
        super(name, 2);
        type = MenuItemType.NON_ALCOHOL_DRINK;
    }

    @Override
    public MenuItemType getType() {
        return MenuItemType.NON_ALCOHOL_DRINK;
    }
}
