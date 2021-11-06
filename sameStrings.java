import java.util.Locale;
import java.util.Scanner;

public class Task10 {

    //check if two strings have the same letters

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int[] arr = new int[26];
        for(int i =0; i <s1.length();i++){
            if(arr[s1.charAt(i)-'a']==0) {
                arr[s1.charAt(i) - 'a'] += 1;
            }
        }



        int[] arr2 = new int[26];
        for(int i = 0; i<s2.length();i++){
            if(arr2[s1.charAt(i)-'a']==0) {
                arr2[s1.charAt(i) - 'a'] += 1;
            }

        }

        boolean areSame = true;
        for(int i =0,j=0; i <arr.length;i++,j++){
            if(arr[i]!=0 && arr2[j]==0){
                System.out.println((char)(i+'a'));
                areSame = false;

            }
        }

        if(areSame){
            System.out.println("they contain same letters");
        }



    }
}
