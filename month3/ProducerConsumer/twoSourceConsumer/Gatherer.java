package threads.waitNotify;

import java.util.Random;

public class Gatherer extends Thread{

    private Wagon wagon;

    public Gatherer(String name, Wagon wagon){
        setName(name);
        this.wagon = wagon;
    }

    @Override
    public void run() {
        while (true){
            if(isInterrupted()){
                break;
            }
            int kg = new Random().nextInt(3)+1;
            try {
                Thread.sleep(kg*1000);
            } catch (InterruptedException e) {
                System.out.println("oops");
                break;
            }
            wagon.putGrapes(kg);
        }
    }
}
