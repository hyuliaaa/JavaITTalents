import java.util.Scanner;

public class task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        while (n < 1) {
            System.out.println("You have to enter number greater than 1. Try entering a new one:");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
