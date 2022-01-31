package threads.waitNotify;

public class DrunkenMaster extends Thread{

    private Winery winery;

    public DrunkenMaster(String name, Winery winery){
        setName(name);
        this.winery = winery;
    }

    @Override
    public void run() {
        while (true){
            winery.drinkRakia();
        }
    }
}
