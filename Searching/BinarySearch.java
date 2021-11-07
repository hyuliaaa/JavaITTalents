public class BinarySearch {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        System.out.println(binarySearch(arr,0,arr.length,2));
    }

    static int binarySearch(int[] arr, int start, int end,int x){
        if(start > end){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]>x){
            return binarySearch(arr,0,mid-1,x);
        }
        else
        {
            return binarySearch(arr,mid +1,end,x);
        }
    }
}
