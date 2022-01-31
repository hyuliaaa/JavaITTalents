package threads.waitNotify;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        Wagon wagon = new Wagon();
        Winery winery = new Winery();

        ArrayList<Gatherer> gatherers = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            gatherers.add(new Gatherer("Gatherer " + (i+1), wagon));
        }
        gatherers.forEach(b -> b.start());

        for (int i = 0; i < 2; i++) {
            new RakiaMaker("RakiaMaker " + (i+1), wagon, winery).start();
        }
        new DrunkenMaster("DrunkenMaster", winery).start();

        Thread.sleep(1000*60*2);//2 minutes
        System.out.println("***************************STIGA BRAHTE*****************************");
        gatherers.forEach(b -> b.interrupt());
    }
}
