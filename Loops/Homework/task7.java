import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int i = 3;
        int counter = 0;

        while (true) {
            if (i % 3 == 0) {
                System.out.print(i);
                counter++;
                if (counter == n) {
                    break;
                }
                System.out.print(',');
            }
            i++;
        }

    }

}
