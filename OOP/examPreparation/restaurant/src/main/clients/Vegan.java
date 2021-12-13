package main.clients;

import main.Restaurant;
import main.menu.IMenuItem;
import main.menu.MenuItem;

public class Vegan extends Client{
    public Vegan(String name, Restaurant restaurant) {
        super(name, 30,restaurant);
    }

    @Override
    protected IMenuItem pickItem() {

        return restaurant.getMenu().pickRandomVeganItem();
    }
}
