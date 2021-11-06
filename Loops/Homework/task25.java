import java.util.Scanner;

public class task25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        long product = 1;
        int counter = 1;

        do {
            product = product * counter;
            counter++;
        } while (counter <= number);

        System.out.println(product);

    }
}
