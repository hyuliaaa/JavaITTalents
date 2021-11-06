import java.util.Scanner;

public class task16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lower bound[10..5555]: ");
        int n = sc.nextInt();

        while (n < 10 || n > 5555) {
            System.out.println("You number is out of bounds.Try entering a number between [10..5555]");
            n = sc.nextInt();
        }

        System.out.println("Enter upper bound[10..5555]:  ");
        int m = sc.nextInt();
        if (m < 10 || m > 5555) {
            System.out.println("You number is out of bounds.Try entering a number between [10..5555]");
            m = sc.nextInt();
        }

        for (int i = m; i >= n; i--) {
            if (i % 50 == 0) {
                if(i == 50)
                {
                    System.out.print(i);
                    break;
                }
                System.out.print(i + ", ");
            }
        }


    }
}
