package orders;

import cakes.Cake;
import people.Client;

import java.util.ArrayList;

public class Order {
    private Client client;
    private double price;
    private String deliveryAddress;
    private ArrayList<Cake> cakes;
    private String DataAntTimeOfDelivery;

    public Order(Client client, String deliveryAddress, ArrayList<Cake> cakes) {
        this.client = client;
        this.deliveryAddress = deliveryAddress;
        this.cakes = cakes;
        price = 0.0;
        DataAntTimeOfDelivery = "now";
    }

    public void setOrderPrice(){
        double accumulatedPrice = 0;
        //     cakes.stream().map(c->c.getPrice()).reduce(0,(acc,next) ->acc+next);
        for (Cake cake : cakes) {
            accumulatedPrice+=cake.getPrice();
        }
        this.price = accumulatedPrice;
    }

    public double getPrice() {
        setOrderPrice();
        return price;
    }
}
