import java.util.Scanner;

public class Task2 {

    //multiplication of two numbers using only addition
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(mupltiply(n,m));

    }

    static int mupltiply(int a, int b){
        if(b==1){
            return a;
        }

        return a + mupltiply(a,b-1);
    }
}
