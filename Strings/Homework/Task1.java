import java.util.Scanner;

public class Task1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings with maximum length 40: ");
        String str1 = null;
        String str2 = null;

        do{
            System.out.println("Enter first string: ");
            str1 = sc.next();

        }while (str1.length() > 40);


        do{
            System.out.println("Enter second string: ");
            str2 = sc.next();

        }while (str2.length() > 40);

        String upperString1 = toUpperCase(str1);
        String lowerString1 = toLowerCase(str1);
        System.out.println(upperString1 + " " + lowerString1);

        String upperString2 = toUpperCase(str2);
        String lowerString2 = toLowerCase(str2);
        System.out.println(upperString2 + " " + lowerString2);


    }

    static String toLowerCase(String obj){
        return obj.toLowerCase();
    }

    static String toUpperCase(String obj){
        return obj.toUpperCase();
    }



}
