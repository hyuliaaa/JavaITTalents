import java.util.Scanner;

public class task14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between [10...200]:");
        int num = sc.nextInt();

        while (num < 10 || num > 200) {
            System.out.println("The number you have entered is out of bounds. Try entering a number between [10..200]");
            num = sc.nextInt();
        }


        for (int i = num - 1; i >= 10; i--) {

            if (i % 7 == 0) {
                if(i == 14)
                {
                    System.out.print(i);
                    break;
                }
                System.out.print(i + ", ");
            }
        }
    }

}

