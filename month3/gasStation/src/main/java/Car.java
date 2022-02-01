import java.util.Random;

public class Car {

    public enum FuelType{
        DIZEL(2),BENZIN(2.4),GAZ(1.4);

        double price;
        FuelType(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    FuelType fuelType;

    public FuelType getFuelType() {
        return fuelType;
    }



    public void setFuelType() {
        int rand = new Random().nextInt(100);
        if(rand <33){
            this.fuelType = FuelType.DIZEL;
        }
        else if (rand <66){
            this.fuelType = FuelType.BENZIN;
        }
        else {
            this.fuelType = FuelType.GAZ;
        }



    }

    private int fuelLittres;
    public void addFuel(int randFuelLittres) {
        this.fuelLittres = randFuelLittres;
    }
}
