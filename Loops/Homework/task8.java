import java.util.Scanner;

public class task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int m = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(m);
            }
            System.out.println();
            m += 2;
        }


    }
}
