import java.util.Scanner;

public class task17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number in interval [3..20]: ");
        int b = sc.nextInt();
        while (b < 3 || b > 20) {
            System.out.println("The number you have entered is out of bounds.Try entering a new number between[3..20].");
            b = sc.nextInt();
        }
        char c = sc.next().charAt(0);

        for (int i = 1; i <= b; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 1; i <= b - 2; i++) {
            System.out.print("*");
            for (int j = 1; j <= b - 2; j++) {
                System.out.print(c);
            }
            System.out.print("*");
            System.out.println();
        }


        for (int i = 1; i <= b; i++) {
            System.out.print("*");
        }
    }
}
