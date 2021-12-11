import bows.CarbonBow;
import shooters.Archer;
import shooters.Junior;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Club {
    private String name;
    private String address;
    private String coach;
    ArrayList<Archer> archers = new ArrayList<>();
    //Type archer ->(Name -> points)
    TreeMap<String,TreeMap<String,Integer>> dictionary = new TreeMap<>();

    Club(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void addArcher(Archer a){
        archers.add(a);
    }

    public void printArchers(){
        archers.sort(Comparator.comparing(Archer::getName));

        for (Archer archer : archers) {
            System.out.println(archer.getName());

        }
    }

    private void fillDictionary(){
        for(Archer a : archers){
            if(!dictionary.containsKey(a.getType())){
                dictionary.put(a.getType(),new TreeMap<>());
            }
            dictionary.get(a.getType()).put(a.getName(),a.getPoints());
        }
    }

    public void printCategoryAndPoints(){
        fillDictionary();
        for(Map.Entry<String, TreeMap<String,Integer >> e : dictionary.entrySet()){
            System.out.println(e.getKey());
            for(Map.Entry<String,Integer> e1 : e.getValue().entrySet()){
                System.out.println("\t" + e1.getKey() + " -> " + e1.getValue());
            }
        }
    }
    public void printWinnerInEveryCategory(){
        fillDictionary();
        for(Map.Entry<String,TreeMap<String,Integer>> e : dictionary.entrySet()){
            System.out.println(e.getKey());
            int maxPoints = 0;
            String name = null;
            for(Map.Entry<String,Integer> e1: e.getValue().entrySet()){
                if(e1.getValue()>maxPoints){
                    maxPoints = e1.getValue();
                    name = e1.getKey();
                }
            }
            System.out.println("\t" + name + " -> " + maxPoints);

        }
    }

    public void averageResultForEveryCategory(){
        fillDictionary();
        for(Map.Entry<String,TreeMap<String,Integer>> e: dictionary.entrySet()){
            System.out.print(e.getKey() + ": ");
            double result = 0;

            for(Map.Entry<String,Integer> e1: e.getValue().entrySet()){
                result+=e1.getValue();

            }
            System.out.println(result/e.getValue().size());
        }
    }

    private void shootArchers(){
        for (Archer archer : archers) {
            archer.shoot();
        }
    }

    private void womenOrderedByPercentSharpness(){
        ArrayList<Archer> women = new ArrayList<>();
        for (Archer archer : archers) {
            if (archer.getGender() == Archer.Gender.FEMALE) {
                women.add(archer);
            }
        }
        women.sort(Comparator.comparingInt(Archer::getPoints).reversed());
        TreeMap<String,TreeMap<String,Integer>> dict = new TreeMap<>();

        for(Archer a : women){
            if(!dict.containsKey(a.getType())){
                dict.put(a.getType(),new TreeMap<>());
            }
            dict.get(a.getType()).put(a.getName(),a.getPoints());
        }

        for(Map.Entry<String,TreeMap<String,Integer>> e : dict.entrySet()){
            System.out.println(e.getKey());
            int maxPoints = 0;
            String name = null;
            for(Map.Entry<String,Integer> e1: e.getValue().entrySet()){
                if(e1.getValue()>maxPoints){
                    maxPoints = e1.getValue();
                    name = e1.getKey();
                }
            }
            for(Map.Entry<String,Integer> e1 : e.getValue().entrySet()){
                System.out.println("\t" + e1.getKey() + " -> " +((double)e1.getValue()/maxPoints)*100 +"%");
            }

        }




    }

    public void startTournament(){
        System.out.println("==================START TOURNAMENT==============");
        printArchers();
        System.out.println("==================SHOOT==============");
        shootArchers();
        System.out.println("==================STATISTICS==============");
        printCategoryAndPoints();
        System.out.println("================================");
        printWinnerInEveryCategory();
        System.out.println("================================");
        averageResultForEveryCategory();
        System.out.println("==================SHARPEST CONTESTANT==============");
        printSharpestContestant();
        System.out.println("==================CONTESTANT WITH MOST MISSES==============");
        contestantWithMostMisses();
        System.out.println("=============Woman=======================");
        womenOrderedByPercentSharpness();
        System.out.println("==================MEN WITH CARBON BOWS==============");
        printMenWithCarbonBows();

    }

    private void printMenWithCarbonBows(){
        ArrayList<Archer> men = new ArrayList<>();
        for (Archer archer : archers) {
            if (archer.getGender() == Archer.Gender.MALE && archer.getBow() instanceof CarbonBow){
                men.add(archer);
            }
        }

        men.sort(Comparator.comparingInt(Archer::getExperience).reversed());
        for(Archer archer :men){
            System.out.println(archer.getName()+"("+archer.getExperience()+ ")" +"-> " + archer.getPoints());
        }


    }

    private void contestantWithMostMisses(){
//        0(nlog)
//        archers.sort(Comparator.comparingInt(Archer::getMisses).reversed());
//        System.out.println(archers.get(0).getName() + "("+archers.get(0).getMisses()+")");

        //linear time
        Archer a = archers.get(0);
        for(int i = 1; i <archers.size();i++) {
            if(a.getMisses()<archers.get(i).getMisses()){
                a = archers.get(i);
            }
        }
        System.out.println(a.getName() + "("+a.getMisses()+")");

    }


    private void printSharpestContestant(){
        Archer a = archers.get(0);
        for(int i = 1; i <archers.size();i++) {
            if(a.getTens()<archers.get(i).getTens()){
                a = archers.get(i);
            }
        }

        System.out.println(a.getType());
        System.out.println(a.getName());
        System.out.println(((double)a.getTens() / a.arrowNumber())*100 + "%");

    }


    public int archersSize(){
        return archers.size();
    }
}
