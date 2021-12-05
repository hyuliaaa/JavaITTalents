public class CarShop {
    Car[] cars;
    int carNumber;
    int idx = 0;

    public CarShop(int capacity){
        cars = new Car[capacity];
    }

    public void addCar(Car car){
        if(carNumber > cars.length){
            System.out.println("Our car shop is full, you cannot add a new car!");
            return;
        }
        cars[carNumber] = car;
        carNumber++;
    }

    public Car getNextCar(){
        if(cars[idx]!=null)
            return cars[idx++];
        return null;
    }

    public void sellNextCar(Person buyer){
        Car c = getNextCar();
        if(buyer.getMoney() >= c.getPrice()) {
            buyer.buyCar(c);
        }

    }

    public boolean removeCar(Car c){
        for(int i =0; i <carNumber;i++){
            if(cars[i].getModel().equals(c.getModel())){
                cars[i]=null;
                return true;
            }
        }
        return false;
    }

    public void showAllCarsInTheShop(){
        for(int  i = 0; i <carNumber;i++){
            if(cars[i]!=null) {
                System.out.println("======================");
                System.out.println(cars[i].getModel());
                System.out.println(cars[i].getPrice());
            }
        }
    }

}
