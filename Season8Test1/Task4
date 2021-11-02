import java.util.Arrays;

public class Task4 {

    //sudoku check : each row and column must have different elements from 1-9
    //every submatrix 3x3 must have different numbers

    public static void  main(String[] args){
        int[][]matrix={
                {5,3,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {9,6,1,5,3,7,2,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9},
        };
        
        System.out.println(correctSudoku(matrix));


    }

    static boolean correctSudoku(int[][] matrix){
            if(containsNumber(matrix)){
                return false;
            }

            for(int i = 0; i<matrix.length;i++){
                if(numberRepetitionRow(matrix,i)){
                    return false;
                }
            }

            for(int i =0; i <matrix[0].length;i++){
                if(numberRepetitionColumn(matrix,i)){
                    return false;
                }
            }

            for(int i =0; i <matrix.length;i=i+3){
                for(int j =0; j <matrix[i].length;j=j+3){
                    if(submatrixRepetition(matrix,i,j)){
                        return false;
                    }
                }
            }

            return true;


    }

   static boolean containsNumber(int[][]matrix){
        for(int i =0; i <matrix.length;i++){
            for(int j =0; j <matrix[i].length;j++){
                if(matrix[i][j]<=0 || matrix[i][j]>=10){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean numberRepetitionRow(int[][]matrix, int row){
        for(int i = 0; i<matrix[row].length;i++){
            for(int j = i+1; j <matrix[row].length;j++){
                if(matrix[row][i]==matrix[row][j]){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean numberRepetitionColumn(int[][] matrix,int column){
        for(int i =0; i <matrix.length;i++){
            for(int j=i+1; j <matrix.length;j++){
                if(matrix[i][column]==matrix[j][column]){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean submatrixRepetition(int[][] matrix, int row, int col){
        int[] arr = new int[10];
        for(int i =0; i < 3;i++){
            for(int j =0; j <3;j++){
                arr[matrix[i+row][j+col]]++;
            }
        }

        for(int i= 0; i <arr.length;i++){
            if(arr[i]>1){
                return true;
            }
        }
        return false;


    }

}
