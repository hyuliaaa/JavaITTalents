package people;


import orders.Order;

import java.util.HashSet;

public class Deliverer extends Person {

   private double tips;
   private HashSet<Order> orders;

   public Deliverer(String name) {
      super(name);
      orders = new HashSet<>();
   }

   public void acceptOrder(Order order) {
      orders.add(order);
   }

   public void acceptTip(double tip) {
      this.tips+=tip;
   }

   public double getTips() {
      return tips;
   }

   public int getOrdersSize(){
      return orders.size();
   }

   @Override
   public String toString() {
      return "Deliverer{" + "name " + getName() +
              ", tips=" + tips +
              '}';
   }
}
