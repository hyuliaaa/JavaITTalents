public class sortMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {6,5,3},
                {1,2,5},

        };

        sortMatrix(matrix);
        printMatrix(matrix);

    }

    static void printMatrix(int[][] matrix){
        for(int i =0; i <matrix.length;i++){
            for(int j =0; j <matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void bubbleSort(int[] arr){
        for(int i =0; i <arr.length; i++){
            boolean hasSwap  = false;
            for(int j =0; j <arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = tmp;
                    hasSwap =true;
                }
            }
            if(!hasSwap){
                break;
            }

        }
    }

    static void sortMatrix(int[][] matrix){
        int[] arr = new int[matrix.length*matrix[0].length];
        int k = 0;
        for(int i =0; i <matrix.length;i++){
            for(int j =0; j<matrix[i].length;j++){
                arr[k] = matrix[i][j];
                k++;
            }
        }

        bubbleSort(arr);
        int h = 0;
        for(int i = 0 ; i <matrix.length;i++){
            for(int j= 0; j<matrix[i].length;j++){
                matrix[i][j] = arr[h];
                h++;
            }
        }
    }
}
