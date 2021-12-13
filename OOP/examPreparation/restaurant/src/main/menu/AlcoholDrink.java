package main.menu;

public class AlcoholDrink extends Drink implements IThugItem{
    AlcoholDrink(String name) {
        super(name, 4);
        type = MenuItemType.ALCOHOL_DRINK;
    }



    @Override
    public MenuItemType getType() {
        return MenuItemType.ALCOHOL_DRINK;
    }
}
