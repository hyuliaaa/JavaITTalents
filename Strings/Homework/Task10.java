import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a string: ");
        String str = sc.next();
        StringBuilder newStr = new StringBuilder();

        for(int i =0; i <str.length(); i++){

            char symbol = (char)(str.charAt(i) + 5);
            newStr.append(symbol);

        }

        System.out.println(newStr);

    }
}
