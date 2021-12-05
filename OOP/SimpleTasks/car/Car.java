public class Car {
    private String model;
    private int maxSpeed;
    private int currentSpeed;
    private int currentGear;
    private double price;
    private String color;
    private boolean isSportsCar;
    Person owner;

    Car(String model, boolean isSportsCar, String color){
        this.model = model;
        this.isSportsCar = isSportsCar;
        this.color = color;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void accelerate(){
        currentSpeed++;
    }

    public void changeGearUp(){
        if(currentGear<6){
            currentGear++;
        }
    }

    public void changeGearDown(){
        if(currentGear>1){
            currentGear--;
        }
    }
    public void changeGear(int nextGear){
        if(nextGear >=1 && nextGear <=6){
            currentGear=nextGear;
        }
    }

    public void changeColor(String newColor){
        color=newColor;
    }

    public boolean isMoreExpensive(Car car){
        return this.price > car.price;
    }

    public double calculateCarPriceForScrap(double metalPrice){
        double coeff = 0.2;
        if(color.equals("black") || color.equals("white")){
            coeff += 0.05;
        }
        if(isSportsCar){
            coeff += 0.05;
        }
        return metalPrice*coeff;
    }

    public void changeOwner(Person newOwner){
        owner = newOwner;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
