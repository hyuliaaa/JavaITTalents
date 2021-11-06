import java.util.Locale;

public class Task10 {

    //find occurrence of each letter in the string, also print the most occurring letter

    public static void main(String[] args){

        String str = "banana nirvana";
        str = str.toLowerCase();
        int[] arr = new int[26];
        for(int i =0; i < str.length();i++){
            if(str.charAt(i)-'a'>=0  && str.charAt(i)-'a'<26) { //skips white space if any
                arr[str.charAt(i) - 'a'] += 1;
            }
        }

        int maxOccurrence = 0;
        char letter='\0';
        for(int i =0; i <arr.length;i++){
            System.out.println((char)(i+'a')+ " occurs: " + arr[i]);
            if(arr[i]>maxOccurrence){
                maxOccurrence = arr[i];
                letter = (char)(i+'a');
            }
        }

        System.out.println("Max occurring letter " + letter + ": "+ maxOccurrence);



    }
}
