package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class compareTwoJpg {

    public static void main(String[] args) throws IOException {


        File f1 = new File("Cat03.jpg");
        File f2 = new File("CatCopy.jpg");

        FileInputStream fis1 = new FileInputStream(f1);
        FileInputStream fis2 = new FileInputStream(f2);

        boolean areSame = true;
        while (true){
            int fa1 = fis1.read();
            int fa2 = fis2.read();
            if(fa1 == -1 && fa2 == -1){
                System.out.println("end of files");
                break;
            }
            if(fa1!=fa2)
            {
                System.out.println("Files are different!");
                areSame = false;
                break;
            }


        }
        if(areSame){
            System.out.println("Equal!");
        }
    }
}
