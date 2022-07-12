package MATRIX;

public class searchElementInASortedMatrix {

    // grepper search an element in a sorted matrix java
    public static boolean searchElementInMatrix(int[][] matrix, int key) {
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == key)
                return true;
            else if (matrix[i][j] > key)
                j--;
            else
                i++;
        }
        return false;
    }
    // end grepper

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 3, 6, 9, 12 },
                { 21, 42, 63, 84 },
                { 27, 54, 81, 108 }
        }, key = 42;
        System.out.println(searchElementInMatrix(matrix, key));
    }
}
