import java.util.Scanner;

public class Task3 {

    //prime number check
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n,2));

    }

    static boolean isPrime(int n, int i){
        if(n == i){
            return true;
        }
        if(n%i == 0){
            return false;
        }


        return isPrime(n,i+1);

    }
}
