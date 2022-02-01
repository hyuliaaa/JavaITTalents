import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class GasStation {

    private ArrayList<Column> columns;


    GasStation() {
        columns = new ArrayList<>(5);
        for(int i = 0 ; i <5; i++){
                columns.add(new Column());

        }

    }

    private int getColumnNumberWithACar(){
        int counter = 0;
        for (Column column : columns) {
            if(column.getQueueSize()!=0){
                counter++;
            }
        }
        return counter;
    }

    private Column getRandomColumnWithCars(){
        int actualNumbersOfColumnsWithCars = getColumnNumberWithACar();
        int randColNum = new Random().nextInt(actualNumbersOfColumnsWithCars);
        return columns.get(randColNum);
    }

    private Column getRandomColumn(){
        int randCol = new Random().nextInt(4)+1;
        return columns.get(randCol);
    }

    public synchronized void addCar(Car c){
        while (areAllColumnsFull()){
            try {
                System.out.println("All columns full, car gen wait..");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Column column = getRandomColumn();
        column.addCarToColumn(c);
        notifyAll();
        System.out.println("Added car to gas station");


    }


    public boolean areAllColumnsEmpty(){
        for (Column column : columns) {
            if(column.getQueueSize() !=0){
                return false;
            }
        }
        return true;
    }

    public boolean areAllColumnsFull(){
        for (Column column : columns) {
            if(column.getQueueSize() !=5){
                return false;
            }
        }
        return true;
    }

    public synchronized void getCar(){
        while (areAllColumnsEmpty()){
            try {
                System.out.println("No cars, fuel boy waits...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Column column = getRandomColumn();
        Car car = column.removeCar();
        System.out.println("Removing Car");
        fuelCar(car);
        notifyAll();
    }


    public  void fuelCar(Car c){
        int randFuelLittres = new Random().nextInt(31)+10;
        c.setFuelType();
        System.out.println("Fueling car with " + randFuelLittres + "littres of " +c.getFuelType());
        c.addFuel(randFuelLittres);

    }



}
