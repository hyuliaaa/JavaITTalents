package main.menu;

public class MainCourse extends Meal implements IThugItem{
    MainCourse(String name, int quantity) {
        super(name,9, quantity);
    }

    @Override
    protected int validateQuantity(int quantity) {
        return (quantity>=400 && quantity <=800) ?  quantity: 450;
    }


    @Override
    public MenuItemType getType() {
        return MenuItemType.MAIN;
    }
}
