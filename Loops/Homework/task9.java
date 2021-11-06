import java.util.Scanner;

public class task9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int sum = 0;
        int sqrOfNumber;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.print("Skip 3, ");
                continue;
            }
            sqrOfNumber = i * i;
            System.out.print(sqrOfNumber);

            sum = sum + sqrOfNumber;
            if (sum >= 200) {
                break;
            }
            else {
                System.out.print(", ");
            }


        }
    }

}
