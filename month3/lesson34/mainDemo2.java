package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {

        File f = new File("war_peace.txt");
        int commas = 0;

        try(Scanner sc = new Scanner(f)) {

            while (sc.hasNextLine()){
                String line = sc.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if(line.charAt(i) == ','){
                        commas++;
                    }
                }

            }
            System.out.println(commas);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        //package manager
    }
}
