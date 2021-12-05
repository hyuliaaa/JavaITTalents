public class Demo {
    public static void main(String[] args) {

        CarShop shop = new CarShop(3);
        Car c1 = new Car("BMW",true,"black");
        c1.setPrice(12000);
        Car c2 = new Car("Audi",true,"black");
        c2.setPrice(10000);
        Car c3 = new Car("Mercedes",true,"black");
        c3.setPrice(15000);

        shop.addCar(c1);
        shop.addCar(c2);
        shop.addCar(c3);
        System.out.println();
     //   shop.showAllCarsInTheShop();
        System.out.println(shop.getNextCar());




          Person p = new Person("Ilian",24335,true);
          p.setMoney(15000);
          shop.sellNextCar(p);
          shop.showAllCarsInTheShop();
          shop.removeCar(c2);
        System.out.println();
        System.out.println();
          shop.showAllCarsInTheShop();
          System.out.println(p.getMoney());

//
//        p.buyCar(c1);
//
    }
}
