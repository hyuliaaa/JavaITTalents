import java.util.Scanner;

public class task18 {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = sc.nextInt();
        while (firstNum<1 || firstNum > 9)
        {
            System.out.println("The number you have entered is out of bounds. Try entering a number between[1..9]");
            firstNum = sc.nextInt();
        }

        System.out.println("Enter second number: ");
        int secondNum = sc.nextInt();
        while (secondNum<1 || secondNum > 9)
        {
            System.out.println("The number you have entered is out of bounds.Try entering a number between[1..9]");
            secondNum = sc.nextInt();
        }

        for(int i = 1; i<=firstNum; i++)
        {
            for(int j=1; j<=secondNum; j++ )
            {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
