import java.util.Scanner;

public class Task1 {

   // fibonnaci
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));

    }

    static int fib (int n){
        if (n == 1){
            return 1;
        }
        if(n==0){
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }
}
