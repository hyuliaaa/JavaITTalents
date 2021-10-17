import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;




public class MyFirst {

    static void print(int[] arr, int len){
        if(len == 1){
            System.out.print(arr[0]);
            return;
        }
        System.out.print(arr[len-1]+ " ");
        print(arr,len-1);
    }

    static void print1(int[] arr, int n, int i){
        if(i == n){
            return;
        }
        System.out.print(arr[i] + " ");
        print1(arr,n,i+1);
    }

    public static void main(String[] args) {

        int[] arr= {1,2,3,4};
        print1(arr,arr.length,0);


    }

}
