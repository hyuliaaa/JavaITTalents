package shooters;

import bows.Bow;
import bows.WoodenBow;

import java.util.Random;

public class Junior extends Archer{
    public Junior(String name, Gender gender, int age, WoodenBow bow) {
        super(name,gender,age,bow);
        experience = 1;
    }

    @Override
    public boolean validExperience() {
        return experience>=1 && experience <=3;
    }

    @Override
    public void shoot() {
        int totalScore = 0;
        for(int i = 0; i <arrowNumber();i++){
            Random r = new Random();
            if(r.nextInt(100)+1 > 10) {
                int result = r.nextInt(10) + 1;
                if(result==10){
                    tens++;
                }
                totalScore +=result;
            }
            else {
                misses++;
            }
        }
        this.setPoints(totalScore);

    }

    @Override
    public int arrowNumber() {
        return 30;
    }

    @Override
    public String getType() {
        return "Junior";
    }
}
