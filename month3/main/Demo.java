package main;

import java.io.*;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws IOException {

        File mule = new File("krasi.txt");
//
//        Scanner sc = new Scanner(mule);
//        System.out.println(sc.nextLine());

        PrintStream ps = new PrintStream(mule);
        ps.println("Zemi oshte kokain");
        ps.println("Zemi i oshte malko");


//        FileOutputStream fos = new FileOutputStream(mule, true);
//        String stoka = "1 kilo kokain";
//        for (int i = 0; i < stoka.length(); i++) {
//            fos.write(stoka.charAt(i));
//        }

//        FileWriter writer = new FileWriter(mule);
//        writer.write("kak e havata");
//        writer.flush();
//        File original = new File("buhal.jpg");
//        File copy = new File("copyBuhal.jpg");
//        if(!copy.exists()){
//            copy.createNewFile();
//        }
//
//        FileInputStream fis = new FileInputStream(original);
//        FileOutputStream fos = new FileOutputStream(copy, true);
//
//        int b = fis.read();
//        while (b!= -1){
//            fos.write(b);
//            b = fis.read();
//        }
//
//        System.out.println("End");
    }
}
