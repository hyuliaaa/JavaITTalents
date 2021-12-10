package main;

import java.util.*;

public class IteratorExamples {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();
        set.add("ani");
        set.add("hashani");
        set.add("banani");

        for(Iterator<String> it = set.iterator(); it.hasNext();  ){
            String element = it.next();
            System.out.println(element);
        }

        System.out.println();
        for(String s : set){
            System.out.println(s);
        }


        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("helena", 5);
        map.put("zelena", 6);
        map.put("alena", 8);




        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " - " + e.getValue());
        }


        int[] arr = {3,5,2,35,3};

        for(int x : arr){
            System.out.println(x);
        }








    }

}
