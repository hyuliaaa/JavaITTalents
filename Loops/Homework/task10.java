import java.util.Scanner;

public class task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num == 1) {
            System.out.println("1 is not a prime number!");
            return;
        }

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                isPrime = false;
                break;
            }


        }

        if (isPrime) {
            System.out.println("The number you have entered is prime!");
        }
        else {
            System.out.println("The number you have entered is NOT prime!");
        }

    }

}
