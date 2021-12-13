package main.clients;

import main.Restaurant;
import main.Waiter;
import main.menu.IMenuItem;
import main.menu.Meal;
import main.menu.MenuItem;

import java.nio.file.WatchKey;
import java.util.ArrayList;
import java.util.Random;

public abstract class Client {
    private String name;
    private double money;
    protected Restaurant restaurant;
    private Waiter waiter;
    private double bill;

    Client(String name, double money, Restaurant restaurant){
        this.name = name;
        this.money = money;
        this.restaurant = restaurant;
    }

    protected abstract IMenuItem pickItem();

    public void makeOrder(){
        waiter = restaurant.getRandomWaiter();
        ArrayList<IMenuItem> orderedItems = new ArrayList<>();
        double accumulatedPriceOfOrderedItems = 0;
        System.out.println(name + " ORDERS NOW: ");
        while (true){
            IMenuItem item = pickItem();

            if(item!=null) {
                System.out.println("\t GIMME " + item.getName());
                if (accumulatedPriceOfOrderedItems + item.getPrice() < money * 0.9){
                    accumulatedPriceOfOrderedItems+=item.getPrice();
                    restaurant.removeFromMenu(item);
                    orderedItems.add(item);
                }
                else {
                    break;
                }

            }
            else {
                break;
            }

        }

        waiter.acceptOrder(this,orderedItems);
    }

    public void askForBill(){
        this.bill = waiter.makeBill(this);
        System.out.println("Total cost of orders " + bill);
    }

    public void payBill(){
        this.money -= bill;
        this.restaurant.payMoney(bill);

        if(new Random().nextInt(11)<=8){
            double tipChance = new Random().nextInt(6) + 5;
            double tip = bill*(tipChance/100);
            waiter.recieveTip(tip);
            this.money -=tip;

        }
    }
}
