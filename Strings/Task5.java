import java.util.Scanner;

public class Task5 {

    //check for anagram
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(isAnagram(s1,s2));

    }

    static boolean isAnagram(String s1, String s2){
        int[] arr = new int[26];

        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i =0; i <s1.length(); i++){
            arr[s1.charAt(i)-'a']+=1;
        }

        for(int i= 0; i <s2.length(); i++){
            arr[s2.charAt(i)-'a']-=1;

        }

        for(int i =0; i <arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;

    }
}
