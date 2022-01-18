package main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//automatically allows us to read/write data character by character
//FileReader & FileWriter are characters streams
public class CharacterStreams {

    public static void main(String[] args) throws IOException {

        File f = new File("demo.txt");
        if(f.createNewFile()){
            System.out.println("File successfully created!");
        }
        else {
            System.out.println("Already exists!");
        }
        FileWriter writer = new FileWriter(f);
        writer.write("Hel");
        writer.flush();

//        char[] arr = new char[20];
        FileReader reader = new FileReader(f);
//        reader.read(arr);
//        System.out.println(arr);

        int a = reader.read();
        char c = (char)a;
        System.out.println(c);
        while (true){
            a = reader.read();
            if(a==-1){
                break;
            }
            c = (char)a;
            System.out.println(c);
        }




    }
}
