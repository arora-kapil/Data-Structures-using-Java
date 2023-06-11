
public class matrixRotation {

}

class Solution {

    public static void transpose(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < i ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void swapColumns(int[][] matrix) {
        int n = matrix. length;
        for(int i = 0 ; i < n ; i++) {
            int start = 0;
            int end = n-1;
            while(start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    public void rotate(int[][] matrix) {
        transpose(matrix);
        swapColumns(matrix);
    }
}