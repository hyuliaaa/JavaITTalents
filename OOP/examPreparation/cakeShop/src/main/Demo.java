package main;

import cakes.*;
import people.Client;
import people.CorporateClient;
import people.Deliverer;
import people.PrivateClient;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Demo {

    private static int delN = 1;
    private static String[] names = {"Krasi", "Pepi", "Moni", "Radi", "Aleks", "Stefi", "Niki","Magi", "Denis"};
    private static String getDelivererName(){
        return "deliverer" + delN++;
    }
    private static String[] eventNames={"FirstYear","Graduation", "Anniversary"};
    private static String[] childNames = {"Memo", "Roni", "Leo", "Nick", "Jie"};

    private static String generateNames(){
        return names[new Random().nextInt(names.length)] + delN++;
    }

    public static int generatePrice(){
        return new Random().nextInt(100)+ 30;
    }

    public static int generatePieces(){
        return new Random().nextInt(20)+ 1;
    }

    public static int generateLayers(){return new Random().nextInt(16);}

    public static String generateEventNames(){return eventNames[new Random().nextInt(eventNames.length)];}

    public static String generateChildNames(){return childNames[new Random().nextInt(childNames.length)];}

    public static void main(String[] args) {

        //1. Да се създаде сладкарница „Сладки таланти“ с пет доставчика с произволни имена.
        CakeShop c = new CakeShop("Sweet Talents", "Center", "0956373684",5);
//        Deliverer d;
//        for(int i = 0; i <5;i++){
//            d= new Deliverer(getDelivererName());
//            c.addDeliverer(d);
//        }

//        2. Да се създадат 30 торти с произволни типове и видове, като е възможно от един тип и
//        от един вид да има повече от една торти. Всяка торта има 25% процента шанс да бъде
//        от един от четирите описани вида.
        Cake cake;
        for(int i = 0; i < 30;i++){
            int chance = new Random().nextInt(100);
            if(chance<25){
                cake = new StandartCake("Standartna",generatePrice(),generatePieces(),new Random().nextBoolean());
            }
            else if(chance < 50){
                cake = new WeddingCake("Svatbena", generatePrice(),generatePieces(),generateLayers());
            }
            else if(chance < 75){
                cake = new SpecialCake("Special",generatePrice(),generatePieces(),generateEventNames());
            }
            else {
                cake = new ChildCake("Children", generatePrice(),generatePieces(),generateChildNames());
            }

            c.addCake(cake);
        }


        c.printCakeAvailability();
        // Да се създадат десет клиента – пет корпоративни и пет частни с произволни имена и
        //съответните им отстъпки и ваучери
        ArrayList<Client> clients = new ArrayList<>();
        Client client;
        for(int i = 0; i <5;i++){
            client = new CorporateClient(generateNames(),c);
            clients.add(client);
            client = new PrivateClient(generateNames(),c);
            clients.add(client);
        }

        //4. Всеки клиент да направи поръчка на торти и те да му бъдат доставени.
        for (Client client1 : clients) {
            client1.makeOrder();
        }
        c.printCakeAvailability();
        c.printAllMoney();
        c.printDeliverers();
        c.mostSoldCake();
        c.delivererWithMostOrders();

        System.out.println("====HARCHILOTO=====");
        clients.sort(Comparator.comparingDouble(Client::getMoneySpent).reversed());
        System.out.println(clients.get(0));


    }
}
