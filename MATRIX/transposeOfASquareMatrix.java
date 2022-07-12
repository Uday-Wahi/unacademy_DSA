package MATRIX;

public class transposeOfASquareMatrix {

    // grepper print a matrix java
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }
    // end grepper

    // grepper transpose of a matrix java
    public static int[][] transposeSquareMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        return matrix;
    }
    // end grepper

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        printMatrix(matrix);
        printMatrix(transposeSquareMatrix(matrix));
    }
}