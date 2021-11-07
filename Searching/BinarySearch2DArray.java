public class BinarySearch2dArray {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        System.out.println(binarySearch(matrix,11,0,(matrix.length*matrix[0].length)-1));
    }

    static boolean binarySearch(int[][]matrix,int x, int start, int end){
        if(start>end){
            return false;
        }
        int middle = (start+end)/2;
        int row = middle/matrix.length;
        int column = middle%matrix.length;
        if(matrix[row][column]==x){
            return true;
        }

        if(x > matrix[row][column]){
          return   binarySearch(matrix,x,middle+1,end);
        }
        else{
            return binarySearch(matrix,x,start,middle-1);
        }
    }


}
