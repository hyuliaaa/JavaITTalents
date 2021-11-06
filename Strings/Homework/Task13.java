import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter number of elements for the first array(>=1):");
             n = sc.nextInt();
        } while (n<1);

        System.out.println("Enter elements of the first array");
        int[] arr = createArray(n,sc);


        int m;
        do {
            System.out.println("Enter number of elements for the second array ");
            m = sc.nextInt();
        } while (m < 1);
        System.out.println("Enter elements of the second array");
        int[] arr2 = createArray(m,sc);

        int[] arr3 = merge(arr,arr2);
        printArray(arr3);



    }

    static int[] merge(int[] arr1, int[] arr2){
        int[] thirdArr = new int[arr1.length+arr2.length];

        int j = 0;
        for(int i =0; i <thirdArr.length; i++){
            if(i < arr1.length){
                thirdArr[i] = arr1[i];
            }
            else {
                thirdArr[i] = arr2[j];
                j++;
            }
        }
        return thirdArr;
    }

    static int[] createArray(int n, Scanner sc){
        int[] arr = new int[n];
        for(int i = 0 ; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr){
        for(int i =0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
