package main.clients;

import main.Restaurant;
import main.menu.IMenuItem;
import main.menu.MenuItem;

public class Thug extends Client{
    public Thug(String name, Restaurant restaurant) {
        super(name, 50, restaurant);
    }

    @Override
    protected IMenuItem pickItem() {

        return restaurant.getMenu().pickRandomThugItem();
    }
}
