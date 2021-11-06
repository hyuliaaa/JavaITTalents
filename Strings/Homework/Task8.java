import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word= sc.next();

        boolean isPalindrome = true;

        for(int i= 0; i <word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length()-1 - i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }





    }
}
