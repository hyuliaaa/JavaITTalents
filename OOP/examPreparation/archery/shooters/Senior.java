package shooters;

import bows.AluminumBow;
import bows.Bow;
import bows.CarbonBow;
import bows.SeniorBow;

import java.util.Random;

public class Senior extends Archer{


    public Senior(String name, Gender gender, int age, SeniorBow bow) {
        super(name, gender, age, bow);
        experience = 3;
    }

    @Override
    public boolean validExperience() {
        return experience>=3 && experience <=10;
    }

    @Override
    public void shoot() {
        int totalScore = 0;
        for(int i = 0; i < arrowNumber();i++){
            Random r = new Random();
            if(r.nextInt(100)+1 > 5) {
                int result = r.nextInt(5) + 6;
                if(result==10){
                    tens++;
                }
                if(result!=10){
                    if(getBow() instanceof CarbonBow){
                        if(result + ((CarbonBow) getBow()).getScope() + ((CarbonBow) getBow()).getStabilization() <=10){
                            result +=((CarbonBow) getBow()).getScope() + ((CarbonBow) getBow()).getStabilization();
                        }
                    }

                    if(getBow() instanceof AluminumBow){
                        if(result+((AluminumBow) getBow()).getScope()<=10){
                            result += ((AluminumBow) getBow()).getScope();
                        }
                    }
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
        return 60;
    }

    @Override
    public String getType() {
        return "Senior";
    }
}
