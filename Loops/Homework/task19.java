import java.util.Scanner;

public class task19 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        while (num < 10 || num > 99)
        {
            System.out.println("The number you have entered is out of bounds. Try entering a number between[10..99]");
            num = sc.nextInt();
        }
        double prevNum=num;

        while(prevNum!=1)
        {
            if(prevNum % 2 == 1)
            {
                prevNum = (3 * prevNum) +1;
                System.out.print((int) prevNum + " ");
            }
            else
            {
                prevNum = 0.5 * prevNum;
                System.out.print((int)prevNum + " ");
            }

        }
    }
}
