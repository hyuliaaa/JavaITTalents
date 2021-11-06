import java.util.Locale;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for(int i= 0; i < words.length; i++){
            words[i]= words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        }

        for (int i = 0; i <words.length; i++){
            System.out.print(words[i] + " ");
        }


    }
}
