import java.util.Scanner;

public class task2 {

    static void print(int n){
        if(n == 1){
            System.out.print(n +" ");
            return;
        }

        print(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int n = sc.nextInt();
        print(n);

    }
}
