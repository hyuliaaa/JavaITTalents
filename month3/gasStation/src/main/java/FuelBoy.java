public class FuelBoy extends Thread{


    GasStation columnArea;

    FuelBoy(String name, GasStation columnArea){
        setName(name);
        this.columnArea = columnArea;

    }

    @Override
    public void run() {
        while (true){
            columnArea.getCar();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
