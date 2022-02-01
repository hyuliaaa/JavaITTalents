public class CarGenerator extends Thread{

    public GasStation gasStation;
    @Override
    public void run() {
        while (true){
            Car c = new Car();
            gasStation.addCar(c);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
