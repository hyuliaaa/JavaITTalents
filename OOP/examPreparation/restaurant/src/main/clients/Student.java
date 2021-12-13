package main.clients;

import main.Restaurant;
import main.menu.IMenuItem;
import main.menu.MenuItem;

public class Student extends Client{
    public Student(String name, Restaurant restaurant) {
        super(name, 10,restaurant);
    }

    @Override
    protected IMenuItem pickItem() {
       return restaurant.getMenu().pickRandomItem();
    }
}
