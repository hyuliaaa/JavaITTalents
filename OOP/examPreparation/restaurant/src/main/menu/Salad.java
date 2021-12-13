package main.menu;

public class Salad extends Meal implements IVeganItem{
    Salad(String name, int quantity) {
        super(name, 5,quantity);
        type = MenuItemType.SALAD;


    }

    protected int validateQuantity(int quantity){
        return quantity>=300 && quantity <=600 ? quantity : 300;
    }

    @Override
    public MenuItemType getType() {
        return MenuItemType.SALAD;
    }




}
