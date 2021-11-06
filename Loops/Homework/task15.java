import java.util.Scanner;

public class task15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int sum = 0;
        int i = 1;

        do {
            sum = sum + i;
            i++;
        } while (i <= num);

        System.out.println("Sum is: " + sum);

    }

}
