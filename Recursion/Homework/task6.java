import java.util.Scanner;

public class task6 {



    static int reverse(int n, int i){
        if(n==0){
            return i;
        }
        return reverse(n/10,(i*10)+n%10);
    }
    public static void main(String[] args) {
        //reverse of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int num =sc.nextInt();
        System.out.println(reverse(num,0));





    }
}
