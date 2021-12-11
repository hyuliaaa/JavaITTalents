package shooters;

import bows.Bow;
import bows.CarbonBow;

import java.util.Random;

public class Veteran extends Archer{
    public Veteran(String name, Gender gender, int age, CarbonBow bow) {
        super(name, gender, age, bow);
        experience = 10;
    }

    @Override
    public boolean validExperience() {
        return experience>=10;
    }

    @Override
    public void shoot() {
        int totalScore = 0;
        for(int i = 0; i <arrowNumber();i++){
            Random r = new Random();
                int result = r.nextInt(5 ) + 6;
                if(result==10){
                    tens++;
                }
                if(result!=10){
                    if(this.getBow() instanceof CarbonBow){
                        if(result + ((CarbonBow) getBow()).getScope() + ((CarbonBow) getBow()).getStabilization() <=10){
                            result +=((CarbonBow) getBow()).getScope() + ((CarbonBow) getBow()).getStabilization();
                        }
                    }
                }

                totalScore +=result;

        }
        this.setPoints(totalScore);
    }

    @Override
    public int arrowNumber() {
        return 60;
    }

    @Override
    public String getType() {
        return "Veteran";
    }
}
