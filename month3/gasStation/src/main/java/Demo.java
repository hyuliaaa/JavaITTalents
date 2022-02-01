public class Demo {

    public static void main(String[] args) {


        GasStation omw = new GasStation();
        CarGenerator carGenerator = new CarGenerator();
        FuelBoy f = new FuelBoy("Teri",omw);
        f.start();
        carGenerator.gasStation = omw;
        carGenerator.start();





    }
}
