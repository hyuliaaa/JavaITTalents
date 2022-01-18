package main;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) throws IOException {



        /*
            Да се прочете Война и Мир - 1,2,3,4 том
                -> да се преброят запетайките
                -> да се изведе най-дългата дума от книгата
                -> да се каже кое е повече - "война" или "мир"
                -> да се направи списък с всички думи, групирани по дължина.
                Всяка група да се запише сортирана по азбучен ред в отделен файл
                    -> файл с еднобуквени, файл с двубуквени и т.н до файл с тези с най-голяма дълж.
                -> да се направи списък с всички думи, подредени по тяхното срещане в книгата, като
                срещу всяка дума има броя срещания

                -> да се направи метод, който приема Path и int.
                    -> Path = пътя до файла, който да се прочете
                    -> int = броя нишки, които да се използват
                 Методът прочита файлът от пътя и брои запетайките с толкова паралелни нишки,
                 колкото са подадени. Накрая методът изписва броя запетайки, както и броят
                 милисекунди, отнели за операцията.
                 Всеки да каже с колко нишки е най-бързо на неговият компютър



         */



        /*

            File -> java object that CAN BE associated to a physical file
                -> name, extension, path
                    -> absolute, relative path
                -> file and directory -> TWO DIFFERENT TYPES

            Stream
                -> Output, Input. Sequential, Unidirectional
                -> byte, character, buffered, object, Scanner, PrintStream
                -> handling IOExceptions
                -> use Try with resources, always close the streams
                -> use APPEND flag to add to files

            Files utility class with static methods for general operations
                -> Path object

         */

        File original = new File("war_peace.txt");
        Files.lines(original.toPath())
                .forEach(line -> System.out.println(line));

//        File copy = new File("war_copy.txt");
//
//        Files.copy(original.toPath(), copy.toPath());
//
//        System.out.println("End");

//        Path myNewSource = Path.of("krasi.txt");
//        if(!Files.exists(myNewSource)){
//            Files.createFile(myNewSource);
//
//            Files.writeString(myNewSource, "Observe the magic!");
//
//            F
//        }



    }
}
