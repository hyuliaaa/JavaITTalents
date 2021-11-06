import java.util.Scanner;

public class Task14 {

    static int factorial(int n){
        int prod = 1;
        for(int i = 1; i <=n; i++){
            prod = prod * i;
        }
        return prod;
    }

    static int factRec(int n){
        if(n == 1){
            return 1;
        }
        return n * factRec(n-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter a positive number > 0");
            n= sc.nextInt();
        } while (n < 1);
        System.out.println(factorial(n));
        System.out.println(factRec(n));
    }
}
