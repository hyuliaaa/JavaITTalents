import java.util.Locale;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String word1 = null;
        String word2 = null;

        do{
            System.out.println("Enter a word with length between [10-20] characters: ");
            word1 = sc.next();
        } while(word1.length() >=10 && word1.length()<=20);

        do{
            System.out.println("Enter a word with length between [10-20] characters: ");
            word2 = sc.next();
        } while(word2.length() >=10 && word2.length()<=20);


        String substr1 = word1.substring(0,5); //first 5 characters
        String substr2 = word2.substring(0,5);

        word1 = word1.replace(substr1,substr2);
        word2 = word2.replace(substr2,substr1);

        if(word1.length() > word2.length()){
            System.out.print(word1.length() + " " + word1);
        }
        else{
            System.out.print(word2.length() + " " + word2);
        }


    }

}
