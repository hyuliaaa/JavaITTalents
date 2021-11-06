import java.util.Scanner;

public class task3 {

    static void evenPrint(int n){
        if(n == 2){
            System.out.print(n + " ");
            return;
        }

        if(n % 2 == 0){
            evenPrint(n-2);
            System.out.print(n + " ");
        }
        else {
            evenPrint(n-1);
        }

    }

    static void oddPrint(int n){
        if(n == 1){
            System.out.print(n +" ");
            return;
        }

        if(n % 2 == 1){
            oddPrint(n-2);
            System.out.print(n +" ");
        }
        else{
            oddPrint(n-1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int n = sc.nextInt();
        oddPrint(n);

    }
}
