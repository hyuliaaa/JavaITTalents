package main;

import main.clients.Client;
import main.menu.IMenuItem;
import main.menu.Menu;
import main.menu.MenuItem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class Restaurant {
    private String name;
    private String address;
    private double money;
    private Menu menu;
    private TreeSet<Waiter> waiters;
    private ArrayList<Client> clients;

    public Restaurant(String name, String address){
        this.name = name;
        this.address = address;
        money = 1000;
        menu = new Menu();
        waiters = new TreeSet<>();
        clients = new ArrayList<>();
        for(int i = 0 ; i <5;i++){
            this.waiters.add(new Waiter("Waiter" + i));
        }
    }

    public Waiter getRandomWaiter(){
        ArrayList<Waiter> waiterList = new ArrayList<>(waiters);
        return waiterList.get(new Random().nextInt(waiterList.size()));
    }


    public void removeFromMenu(IMenuItem item) {
        menu.remove(item);
    }

    public Menu getMenu() {
        return menu;
    }


    public void payMoney(double bill) {
        money+=bill;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void startWork(){
        for(int i = 0; i <clients.size();i++){
            clients.get(i).makeOrder();
            clients.get(i).askForBill();
            clients.get(i).payBill();
        }
    }

    public void printMoney() {
        System.out.println(money);
    }

    public void printWaiterWithMostTips() {
        System.out.println(waiters.first());
    }

    public void printWaiters() {
        System.out.println("========Ordered waiters=====");
        ArrayList<Waiter> waiterList = new ArrayList<>(waiters);
        waiterList.sort(Comparator.comparingDouble(Waiter::getTips).reversed());
        for (Waiter waiter : waiterList) {
            System.out.println(waiter);
        }
    }


}

