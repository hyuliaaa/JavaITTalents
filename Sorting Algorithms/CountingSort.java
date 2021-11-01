public class CountingSort {

    public static void main(String[] args){
        int[] arr = {3,1,2,6,7,5};
        countingSort(arr);
        print(arr);
    }

    static void print(int[] arr) {
        for(int i =0; i <arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    static void countingSort(int[] arr){

        int maxElement = arr[0];
        for(int i =0; i <arr.length; i++){
            if(maxElement < arr[i]){
                maxElement = arr[i];
            }
        }

        int[] arr1 = new int[maxElement+1];

        for(int i =0; i <arr.length;i++){
            arr1[arr[i]]+=1;
        }

        int k = 0;
        for(int i = 0; i <arr1.length;i++){
            for(int j = 0 ; j <arr1[i]; j++){
                arr[k] = i;
                k++;
            }
        }
    }
}
