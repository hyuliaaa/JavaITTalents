import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.next();
        System.out.println("Enter second string: ");
        String str2 = sc.next();

        int ind = -1; //  index where the character is in the other string
        int position = -1; // position in the first string where the character is found
        boolean commonSymbol = false;
        for (int i = 0; i < str1.length(); i++) {
            ind = str2.indexOf(str1.charAt(i));
            if (ind > -1) {
                commonSymbol = true;
                position = i;
                break;
            }
        }

        if(!commonSymbol){
            System.out.println("Strings don't have a common character!");
            return;
        }

        for(int i = 0; i <str2.length(); i++){

            if(i == ind){
                System.out.println(str1);
                continue;
            }

            for (int j = 0 ; j < position; j++){
                System.out.print(" ");
            }

            System.out.println(str2.charAt(i));

        }

    }
}
