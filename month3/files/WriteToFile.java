package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) throws IOException {


        File f = new File("hyulia.txt");

        //writing bytes to a text file
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(97);
        fos.write(98);
        fos.write(99);

        FileInputStream fis = new FileInputStream(f);

        //reading bytes from a text file, and showing them to the console
        int a = fis.read();
        while (a!=-1) {
            System.out.println(a);
            a = fis.read();
        }
    }
}
