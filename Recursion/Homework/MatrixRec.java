public class MatrixRec {

    static int matrixSum(int[][] matrix, int i, int j, int sum) {

        if (i == matrix.length) {
            return sum;
        }
        sum += rowSum(matrix, i, j, 0);
        return matrixSum(matrix, i + 1, j, sum);
    }

    static int rowSum(int[][] matrix, int i, int j, int sum) {
        if (j == matrix[i].length) {
            return sum;
        }

        sum += matrix[i][j];
        return rowSum(matrix, i, j + 1, sum);

    }

    static boolean isFound(int[][] matrix, int i, int j, int x) {

        if (i == matrix.length) {
            return false;
        }

        if (isFoundAtRow(matrix, i, j, x)) {
            return true;
        }
        return isFound(matrix, i + 1, j, x);
    }

    static boolean isFoundAtRow(int[][] matrix, int i, int j, int x) {
        if (j == matrix[i].length) {
            return false;
        }

        if (x == matrix[i][j]) {
            return true;
        }

        return isFoundAtRow(matrix, i, j + 1, x);

    }

    public static void mostFrequentElement(int[][] matrix) {
        int mostFrequentElement = matrix[0][0];
        int counter = 0;
        int maxCounter = 0;
        int h = 0;
        for (int k = 0; k < matrix[0].length; k++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[h][k] == matrix[i][j]) {
                        counter++;
                    }
                }
            }
            if (maxCounter < counter) {
                maxCounter = counter;
                mostFrequentElement = matrix[h][k];
            }
            counter = 0;
            h++;
            if (h == matrix.length) {
                break;
            }
            k = -1;
        }


        System.out.println(mostFrequentElement + " occurs " + maxCounter + " times.");


    }


    public static void main(String[] args) {

        int[][] matrix = {
                {2, 2, 3},
                {2, 1, 1},

        };

        System.out.println(matrixSum(matrix, 0, 0, 0));

        System.out.println(isFound(matrix, 0, 0, 1));

    }
}
