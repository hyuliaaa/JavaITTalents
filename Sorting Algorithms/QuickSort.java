public class QuickSort {

    public static void main(String[] args) {
        int[] arr= {7,3,5,6,2,4};

        quickSort(arr,0,arr.length-1);
        print(arr);

    }


    static void print(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    static void quickSort(int[] arr,int start, int end){

        if(start>=end){
            return;
        }
        int p = partition(arr,start,end);
        quickSort(arr,start,p-1);
        quickSort(arr,p+1,end);
    }

    static int partition(int[] arr,int start,int end){
        int pivot = end;
        int startIdx = start;
        for(int i =0; i <end;i++){
            if(arr[i]< arr[pivot]){
                int tmp = arr[startIdx];
                arr[startIdx]=arr[i];
                arr[i]= tmp;
                startIdx++;
            }
        }

        int tmp = arr[startIdx];
        arr[startIdx]= arr[pivot];
        arr[pivot]=tmp;


        return startIdx;
    }
}
