package per.owisho.learn.algorithm.book.introduction.to.algorithms.chap22;

/**
 * 矩阵转置
 * TODO 补充非方形矩阵的转置
 */
public class MatrixTranspose {

    public static void main(String[] args) {
        int[][] orgMatrix = new int[5][5];
        orgMatrix[0] = new int[]{1,2,3,4,5};
        orgMatrix[1] = new int[]{1,2,3,4,5};
        orgMatrix[2] = new int[]{1,2,3,4,5};
        orgMatrix[3] = new int[]{1,2,3,4,5};
        orgMatrix[4] = new int[]{1,2,3,4,5};
        printMatrix(orgMatrix);
        squarematrixTranspose(orgMatrix);
        printMatrix(orgMatrix);
    }

    public static void printMatrix(int[][] matrix){

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    /**
     * 方形矩阵
     * @param matrix
     * @return
     */
    public static void squarematrixTranspose(int [][] matrix){
        for(int i=0;i<matrix.length-1;i++){
            for(int j=i+1;j<matrix.length;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

}
