package people;

import main.CakeShop;

import java.util.Random;

public class CorporateClient extends Client{
    public CorporateClient(String name, CakeShop shop) {
        super(name,shop );
    }



    @Override
    public int getNumberOfCakes() {
        return new Random().nextInt(3)+3; //3 - 5
    }

    @Override
    public double moneyAfterDiscount(double money) {
        return money*0.9;
    }



    @Override
    public int giveTipPercentage() {
        return 5;
    }
}
