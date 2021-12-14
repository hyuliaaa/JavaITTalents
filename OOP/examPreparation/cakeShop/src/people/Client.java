package people;

import cakes.Cake;
import main.CakeShop;
import orders.Order;

import javax.print.attribute.standard.OrientationRequested;
import java.util.ArrayList;

public abstract class Client extends Person{

    CakeShop cakeShop;
    double moneySpent;
    Client(String name, CakeShop shop) {
        super(name);
        this.cakeShop = shop;

    }

    public double getMoneySpent() {
        return moneySpent;
    }

    public void makeOrder(){
        ArrayList<Cake> orderedCakes = new ArrayList<>();
        Deliverer d = cakeShop.getRandomDeliveryGuy();
        for(int i = 0; i <getNumberOfCakes();i++){
                Cake cake = cakeShop.getRandomCake();
                if(cake!=null) {
                    orderedCakes.add(cake);
                }
        }
        Order order = new Order(this,"Dunav",orderedCakes);
        d.acceptOrder(order);

        double moneyToPay = moneyAfterDiscount(order.getPrice());
        cakeShop.acceptMoney(moneyToPay);
        double tip = moneyToPay * (giveTipPercentage()/100.0);
        d.acceptTip(tip);
        moneySpent = moneyToPay + tip;
    }
    public abstract int getNumberOfCakes();
    public abstract double moneyAfterDiscount(double money);
    public abstract int giveTipPercentage();

    @Override
    public String toString() {
        return "Client{ name = " + getName() +
                " moneySpent=" + moneySpent +
                '}';
    }
}
