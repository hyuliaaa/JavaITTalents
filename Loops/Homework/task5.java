import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for lower bound:");
        int lowerBound = sc.nextInt();
        System.out.println("Enter value for upper bound:");
        int upperBound = sc.nextInt();

        if(lowerBound > upperBound){
            int temp= lowerBound;
            lowerBound = upperBound;
            upperBound = temp;
        }

        for (int i = lowerBound; i <= upperBound; i++) {
            System.out.print(i + " ");
        }
    }
}
