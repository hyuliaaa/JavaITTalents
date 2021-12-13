package main.menu;

public interface IMenuItem {



    public enum MenuItemType{
        SALAD, MAIN, DESSERT,ALCOHOL_DRINK, NON_ALCOHOL_DRINK;
    }

    public enum MenuKind{
        DRINK, MEAL;
    }

     MenuKind getKind();
     MenuItemType getType();
     double getPrice();
     String getName();

}
