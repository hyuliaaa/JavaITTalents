import java.util.Scanner;

public class task24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between[10..30000]:");
        int number = sc.nextInt();
        while (number < 10 || number > 30000) {
            System.out.println("The number you have entered is out of bounds! Try entering a number between[10..30000]");
            number = sc.nextInt();
        }


        int reversedNumber = 0;
        int copyNumber = number;
        do {
            int lastDigit = number % 10;
            reversedNumber *= 10;
            reversedNumber += lastDigit;
            number /= 10;
        } while (number != 0);

        number = copyNumber;

        //second way to solve the task
//        int digitCount=0;
//        do{
//            number = number /10;
//            digitCount++;
//        } while (number!=0);
//        number=copyNumber;
//
//
//
//
//        do {
//            int lastDigit = copyNumber % 10;
//            reversedNumber = reversedNumber+lastDigit * (int)Math.pow(10,--digitCount);
//            copyNumber/=10;
//
//        } while (copyNumber !=0);


        if (number == reversedNumber) {
            System.out.println("The number you have entered is a palindrome");
        }
        else {
            System.out.println("The number you have entered is NOT a palindrome");
        }
    }
}
