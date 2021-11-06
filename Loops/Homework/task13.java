import java.util.Scanner;

public class task13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between [2..27]:");
        int num = sc.nextInt();

        while (num < 2 || num > 27) {
            System.out.println("The number you have entered is out of bounds.Try entering a number between [2..27]:");
            num = sc.nextInt();
        }

        for (int i = 100; i < 1000; i++) {
            int firstDigit = (i / 100) % 10;
            int secondDigit = (i / 10) % 10;
            int lastDigit = i % 10;

            if (firstDigit + secondDigit + lastDigit == num) {
                System.out.print(i + " ");
            }
        }



    }


}
