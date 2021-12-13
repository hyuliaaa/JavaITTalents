package main;

import main.clients.Client;
import main.clients.Student;
import main.clients.Thug;
import main.clients.Vegan;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {

        //1. Създава ресторант с име „При Пешо Таланта“ и 5 сервитьора, работещи в
        //него. Началната сума, налична в ресторанта е 1000 лева. При създаването
        //си ресторантът съдържа 10 порции от всеки вид ястие и 20 броя от всеки
        //вид напитка.
        Restaurant restaurant = new Restaurant("Pesho IT", "Lyulin");


        //2. Създава 15 клиента, като на произволен принцип трябва да бъдат
        //студенти, мутри или вегани. Вероятността да се създаде веган трябва да е
        //20%, студент – 30% , а мутра – 50%.

        Client client;
        for(int i =0; i <15 ;i++){
            int chance = new Random().nextInt(100);
            if(chance < 20){
                client = new Vegan("Vegan" + i,restaurant);
            }
            else if(chance < 30){
                client = new Student("Studentche" + i,restaurant);
            }
            else {
                client = new Thug("Mutrichko" + i, restaurant);
            }
            restaurant.addClient(client);
        }

        restaurant.startWork();
        restaurant.printMoney();
        restaurant.printWaiterWithMostTips();
        restaurant.printWaiters();
        restaurant.getMenu().printMenu();
    }
}
