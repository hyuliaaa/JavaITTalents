import java.util.Scanner;

public class task22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between [1..999]");
        int num = sc.nextInt();
        while (num < 1 || num > 999) {
            System.out.println("The number you have entered is out of bounds. Try entering a number between[1..999].");
            num = sc.nextInt();
        }

        int counter = 0;
        num++;
        while (counter < 10) {
            if ((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0)) {
                if (counter == 9) {
                    System.out.print(++counter + ":" + num);
                }
                else {
                    System.out.print(++counter + ":" + num + ", ");
                }

            }
            num++;
        }
    }
}
