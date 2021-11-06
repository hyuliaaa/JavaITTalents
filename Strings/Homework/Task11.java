import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {1,4,6,8,9};

        printArray(arr);

    }

    static void printArray(int[] arr){
        for(int i =0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
