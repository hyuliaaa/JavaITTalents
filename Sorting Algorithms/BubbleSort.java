public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {8, 4, 6, 1, 3};
        bubbleSort(arr);
        print(arr);

    }

    static void print(int[] arr){
        for(int i =0; i <arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void bubbleSort(int[] arr){

        for(int i =0; i <arr.length;i++){
            boolean hasSwap = false;
            for(int j = 0 ; j <arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = tmp;
                    hasSwap = true;
                }
            }
            if(!hasSwap){
                break;
            }
        }
    }
}
