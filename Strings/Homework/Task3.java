import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.next();
        System.out.println("Enter second string: ");
        String str2 = sc.next();

        int minLength = 0;
        if(str1.length() ==str2.length() ){
            System.out.println("Both strings have equal length!");
            minLength = str1.length();
        }
        else if(str1.length() < str2.length()){
            System.out.println("First string is smaller than second string!");
            minLength = str1.length();
        }
        else{
            System.out.println("First string is greater than second string!");
            minLength = str2.length();
        }

        for(int i = 0 ; i <minLength; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                System.out.println((i+1) + " " + str1.charAt(i)+ "-" + str2.charAt(i));
            }
        }

    }
}
