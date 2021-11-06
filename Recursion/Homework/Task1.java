import java.util.Scanner;

public class task1 {

    static int findPower(int n, int power){
        if (power == 0){
            return 1;
        }

        return n * findPower(n,power-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input any number: ");
        int num = sc.nextInt();
        System.out.println("Input power: ");
        int power = sc.nextInt();

        System.out.println("Output: " + findPower(num,power));
    }

}
