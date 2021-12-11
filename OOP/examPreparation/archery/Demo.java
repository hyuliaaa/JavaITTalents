import bows.*;
import shooters.Archer;
import shooters.Junior;
import shooters.Senior;
import shooters.Veteran;

import java.util.Random;

public class Demo {

    static int count = 1;
    private static final String[] names = {"Krasi", "Pepi", "Moni", "Radi", "Aleks", "Stefi", "Niki"};
    private static String generateName(){
        int number = new Random().nextInt(1000);

        return names[new Random().nextInt(names.length)] + count++;
    }
    private static Archer.Gender generateGender(){
        return new Random().nextBoolean() ? Archer.Gender.FEMALE : Archer.Gender.MALE;
    }
    private static int getRandomAge(){
        //12-52
        return new Random().nextInt(41) + 12;
    }
    private static SeniorBow getRandomSeniorBow(){
        return new Random().nextBoolean() ? new AluminumBow(2.5, 30) : new CarbonBow(5.0,40);
    }

    public static void main(String[] args) {
        Club c = new Club("IT Archer", "Mladost");
        Archer a = new Junior("Elena", Archer.Gender.FEMALE, 25, new WoodenBow(2.3, 25));
        Archer a1 = new Senior("Alena", Archer.Gender.FEMALE, 25, new AluminumBow(2.3, 30));
        Archer a2 = new Junior("Magdalena", Archer.Gender.FEMALE, 25, new WoodenBow(2.3, 25));
        Archer a3 = new Junior("Qnislava", Archer.Gender.FEMALE, 25, new WoodenBow(2.3, 25));

        c.addArcher(a);
        c.addArcher(a1);
        c.addArcher(a2);
        c.addArcher(a3);
        a.shoot();
        a2.shoot();
        a3.shoot();
        a1.shoot();
        c.printArchers();

        Archer archer;
        Random r = new Random();
        for(int i = 0; i < 40;i++){
            int chance = r.nextInt(100);
            if(chance < 33){
                archer = new Junior(generateName(),generateGender(),getRandomAge(),new WoodenBow(2.3,25));
            }
            else if(chance < 66){
                archer = new Senior(generateName(),generateGender(),getRandomAge(),getRandomSeniorBow());
            }
            else {
                archer = new Veteran(generateName(),generateGender(),getRandomAge(),new CarbonBow(5.0,40));
            }

            c.addArcher(archer);

        }

        c.startTournament();
        System.out.println(c.archersSize());
    }


}
