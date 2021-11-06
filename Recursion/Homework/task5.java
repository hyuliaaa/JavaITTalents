import java.util.Scanner;

public class task5 {

    static int evenSum(int n){
        if (n==2){
            return 2;
        }

        if(n % 2 == 0){
            return n + evenSum(n-2);
        }
        else {
            return evenSum(n-1);
        }

    }

    static int oddSum(int n){
        if (n==2){
            return 2;
        }

        if(n % 2 == 1){
            return n + oddSum(n-2);
        }
        else {
            return oddSum(n-1);
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input range: ");
        int n = sc.nextInt();
        System.out.println(evenSum(n));
    }
}
