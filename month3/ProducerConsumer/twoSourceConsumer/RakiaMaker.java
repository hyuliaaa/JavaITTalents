package threads.waitNotify;

public class RakiaMaker extends Thread{

    private Wagon wagon;
    private Winery winery;

    public RakiaMaker(String name, Wagon wagon, Winery winery){
        setName(name);
        this.wagon = wagon;
        this.winery = winery;
    }

    @Override
    public void run() {
        while (true){
            wagon.getGrapes();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("tired of this");
            }
            winery.putRakia();
        }
    }
}
