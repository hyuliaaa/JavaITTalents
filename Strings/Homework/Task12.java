import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int[] arr = createArray(n);
        printArray(arr);

    }
    static int[] createArray(int n){
        int[] arr = new int[n];

        for(int i =0; i <arr.length; i++){
            arr[i] = i+1;
        }
        return arr;
    }

    static void printArray(int[] arr){
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
