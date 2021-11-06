import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String line = sc.nextLine();
        String[] words = line.split(" ");

        int longestWord = 0;
        for(int i = 0 ; i <words.length; i++){
            if(words[i].length() > longestWord){
                longestWord = words[i].length();
            }
        }
        System.out.println(words.length + " words, the longest word is with " +longestWord + " symbols." );
    }
}
