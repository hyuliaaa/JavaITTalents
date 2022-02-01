import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Column {

    private BlockingQueue<Car> queue;


    Column(){
        queue = new ArrayBlockingQueue<>(10);
    }





    public void addCarToColumn(Car c){
        try {
            queue.put(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Car removeCar(){
        Car c = new Car();
        try {
            queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return c;
    }


    public int getQueueSize() {
        return queue.size();
    }
}
