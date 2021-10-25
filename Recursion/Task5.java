import java.util.Scanner;

public class Task5 {

    //palindrome
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseNumber(123,0));
    }


    //number = number*10 + remainder

    static int reverseNumber(int n, int r){
        if(n == 0){
            return r;
        }
        return  reverseNumber(n/10,(r*10)+ (n%10));
    }
}
