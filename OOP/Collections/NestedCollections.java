package main;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class NestedCollections {

    public static void main(String[] args) {

        //neighbourhood -> population
        TreeMap<String, Integer> sofia = new TreeMap();
        sofia.put("Mladost", 200000);
        sofia.put("Drujba", 200000);
        sofia.put("Kokalyane", 6);
        sofia.put("Lagera", 5);

        //city name -> ( neighbourhood -> population )
        TreeMap<String, TreeMap<String, Integer>> map = new TreeMap();
        map.put("Sofia", sofia);

        map.put("Plovdiv", new TreeMap<>());
        map.get("Plovdiv").put("Kiuchuka", 2);
        map.get("Plovdiv").put("Trakia", 10);


        for(Map.Entry<String,TreeMap<String,Integer>> e : map.entrySet()){
            System.out.println(e.getKey());
            for(Map.Entry<String,Integer> e1 : e.getValue().entrySet()){
                System.out.println(e1.getKey()+ " "+ e1.getValue());
            }
        }



        for(Iterator<Map.Entry<String, TreeMap<String, Integer>>> it = map.entrySet().iterator(); it.hasNext();){
            Map.Entry<String, TreeMap<String, Integer>> e = it.next();
            System.out.println("City: " + e.getKey());
            for(Iterator<Map.Entry<String, Integer>> it1 = e.getValue().entrySet().iterator(); it1.hasNext();){
                Map.Entry<String, Integer> e1 = it1.next();
                System.out.println("\t"+e1.getKey() + " - " + e1.getValue());
            }
        }



        TreeMap<String, ArrayList<Integer>> dnevnik = new TreeMap<>();
        dnevnik.put("Ivancho", new ArrayList<>());
        dnevnik.get("Ivancho").add(4);
        dnevnik.put("Mariika", new ArrayList<>());
        dnevnik.get("Mariika").add(3);
        dnevnik.put("Simeoncho", new ArrayList<>());
        dnevnik.put("Shushanka", new ArrayList<>());
        dnevnik.get("Shushanka").add(6);
        dnevnik.get("Ivancho").size();

        int count = 0;

        for(ArrayList<Integer> arr : dnevnik.values()){
            count+= arr.size();
        }







    }
}
