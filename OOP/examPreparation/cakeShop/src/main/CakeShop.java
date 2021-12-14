package main;

import cakes.*;
import people.Deliverer;

import java.sql.Types;
import java.util.*;

public class CakeShop {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Deliverer> deliverers;
    private TreeMap<String,TreeMap<String, TreeSet<Cake>>> catalogue;
    private double money;
    private HashMap<String,Integer> soldCakes;



    CakeShop(String name, String address, String phone, int deliveryGuys){
        this.name = name;
        this.address = address;
        this.phone = phone;
        deliverers = new ArrayList<>(deliveryGuys);
        for(int i =0; i <deliveryGuys;i++){
            Deliverer d = new Deliverer("Deliverer" + (i++));
            deliverers.add(d);
        }
        money = 0.0;
        catalogue = new TreeMap<>();
        soldCakes = new HashMap<>();
    }

    public TreeMap<String, TreeMap<String, TreeSet<Cake>>> getCatalogue() {
        return catalogue;
    }

    public void addDeliverer(Deliverer d){
        deliverers.add(d);
    }
    public Deliverer getRandomDeliveryGuy(){
        return deliverers.get(new Random().nextInt(deliverers.size()));
    }
    public Cake getRandomCake(){
        if(catalogue.size() == 0){
            return null;
        }
        Cake cake;
            int type = new Random().nextInt(5);
            if(type ==1){
                cake = new SpecialCake("Specialna",0,0,"");
            }
            else if(type == 2){
                cake = new WeddingCake("Svatbena",0,0,0);
            }
            else if(type == 3){
                cake = new StandartCake("Standartna",0,0,false);
            }
            else {
                cake = new ChildCake("Childen",0,0,"");
            }

        if(catalogue.containsKey(cake.getKind()) && catalogue.get(cake.getKind()).containsKey(cake.getType())){
            Cake newCake = catalogue.get(cake.getKind()).get(cake.getType()).pollFirst();
            if(newCake!=null){
                if(!soldCakes.containsKey(newCake.getKind())) {
                    soldCakes.put(newCake.getKind(), 0);
                }
                soldCakes.put(newCake.getKind(), soldCakes.get(newCake.getKind())+1);
            }
            return newCake;

        }
        return null;
    }

    public void addCake(Cake c){
       if(!catalogue.containsKey(c.getKind())){
           catalogue.put(c.getKind(),new TreeMap<>());
       }


       if (!(catalogue.get(c.getKind()).containsKey(c.getType()))) {
               catalogue.get(c.getKind()).put(c.getType(), new TreeSet<>());


       }

       catalogue.get(c.getKind()).get(c.getType()).add(c);

    }


    public void acceptMoney(double moneyAfterDiscount) {
        money+=moneyAfterDiscount;
    }

    public void printCakeAvailability(){
        System.out.println("Available cakes: ");
        for (Map.Entry<String, TreeMap<String, TreeSet<Cake>>> e : catalogue.entrySet()) {
            System.out.println(e.getKey() + ":");
            for (Map.Entry<String, TreeSet<Cake>> e1 : e.getValue().entrySet()) {
                System.out.println("\t"+e1.getKey() + ":");
                for (Cake c : e1.getValue()) {
                    System.out.println("\t\t"+c);
                }
            }
        }
    }

    public double getMoney() {
        return money;
    }

    public void printAllMoney(){
        System.out.print("MONEY: ");
        System.out.println(getMoney());
    }


    public void printDeliverers(){
        System.out.println("=========Ordered deliverers=======");
        deliverers.sort(Comparator.comparingDouble(Deliverer::getTips).reversed());
        for (Deliverer deliverer : deliverers) {
            System.out.println(deliverer);
        }
    }

    public void mostSoldCake(){
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>();
        list.addAll(this.soldCakes.entrySet());
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());
        System.out.println("Most sold = " + list.get(0).getKey() + " (" +list.get(0).getValue()+ " )");
    }

    public void delivererWithMostOrders(){
        System.out.println("======DELIVERER WITH MOST ORDERS=======");
       Deliverer d = null;
       int maxOrderSize = 0;
        for (Deliverer deliverer : deliverers) {
            if (deliverer.getOrdersSize() >= maxOrderSize) {
                maxOrderSize = deliverer.getOrdersSize();
                d = deliverer;
            }
        }
        System.out.println(d);

    }


}
