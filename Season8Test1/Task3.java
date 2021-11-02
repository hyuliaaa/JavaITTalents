public class Task3 {
    public static void main(String[] args){
        int[] arr = {1,2,3,6,9,11};
        System.out.println(product(arr,0,3));
    }

    static int product(int[]arr, int i, int x){
        if(i==arr.length){
            return 1;
        }

        if(arr[i]>x){
            if(arr[i]%2==1){
                return arr[i]*product(arr,i+1,x);
            }
            else {
                return product(arr,i+1,x);
            }
        }
        else {
            return product(arr,i+1,x);
        }
    }
}
