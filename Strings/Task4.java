import java.util.Locale;
import java.util.Scanner;

public class Task4 {

    //number of occurrences of every English letter
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] arr = countLetter(str);
        for(int i =0; i <arr.length; i++){
            if(arr[i]!=0){
                System.out.println((char)(i + 97)+ " is occurring " + arr[i]);
            }
        }
    }

    static int[] countLetter(String str){
        int[] arr = new int[26];
        str = str.toLowerCase();
        for(int i = 0; i <str.length(); i++){
            arr[str.charAt(i)- 'a'] +=1; //str.charAt(i) - 97
        }

        return arr;
    }
}
