import java.util.Scanner;

public class task4 {

    static int findSum(int n){
         if (n == 1){
             return 1;
         }

         return n + findSum(n-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input upper limit to find sum :");
        int n = sc.nextInt();
        System.out.println("Sum of all natural numbers between 1 and " + n +" is: ");
        System.out.println(findSum(n));

    }
}
