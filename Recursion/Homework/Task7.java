import java.util.Scanner;

public class Task7 {

    static int digitSum(int n){
        if(n == 0){
            return 0;
        }

        return (n%10) + digitSum(n/10);
    }

    static int digitS(int n, int sum){

        if(n==0){
            return sum;
        }
        return digitS(n/10,sum+(n %10));
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(digitSum(n));
        System.out.println(digitS(n,0));
    }

}
