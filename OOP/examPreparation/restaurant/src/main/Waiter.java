package main;

import main.clients.Client;
import main.menu.IMenuItem;
import main.menu.MenuItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Waiter implements Comparable<Waiter> {
    private String name;
    private double tips;
    private HashMap<Client,ArrayList<IMenuItem>> orders;

    Waiter(String name){
        this.name = name;
        tips = 0;
        orders = new HashMap<>();

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Waiter waiter = (Waiter) o;
        return Double.compare(waiter.tips, tips) == 0 && Objects.equals(name, waiter.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tips);
    }

    public void acceptOrder(Client client, ArrayList<IMenuItem> orderedItems) {
        orders.put(client,orderedItems);
    }

    public double makeBill(Client client) {

       // return orders.get(client)
        //              .stream().map(item ->item.getPrice())
        //              .reduce(0,(next,total)->next+total);

        if(orders.containsKey(client)){
            double total = 0;
            for(IMenuItem item : orders.get(client)){
                total +=item.getPrice();
            }
            return total;
        }
        return 0;
    }

    public void recieveTip(double tip) {
        this.tips+=tip;
    }

    @Override
    public int compareTo(Waiter other) {
        if(this.tips == other.tips){
            return 1;
        }
        return Double.compare(other.tips,this.tips);
    }

    @Override
    public String toString() {
        return "Waiter{" +
                 name + " - " + tips + "}";
    }

    public double getTips() {
        return tips;
    }
}
