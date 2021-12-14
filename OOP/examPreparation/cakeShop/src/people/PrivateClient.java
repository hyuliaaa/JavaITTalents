package people;

import main.CakeShop;

import java.util.ArrayList;
import java.util.Random;

public class PrivateClient extends Client  {

    ArrayList<Integer> vouchers;

    public PrivateClient(String name, CakeShop shop) {
        super(name,shop);
        int arraySize =new Random().nextInt(4)+1;
        vouchers = new ArrayList<>();
        for(int i =0; i < arraySize;i++){
             vouchers.add(new Random().nextInt(21)+10); // 10 -30
        }

    }



    @Override
    public int getNumberOfCakes() {
        return new Random().nextInt(3)+1;
    }

    @Override
    public double moneyAfterDiscount(double money) {
        int sum = 0;

        for (Integer voucher : vouchers) {
            sum+=voucher;
        }
        if(sum<=money) {
            return money - sum;
        }
        else {
            return 0;
        }
    }


    @Override
    public int giveTipPercentage() {
        return 2;
    }



}
