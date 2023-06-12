
public class binarySearch2DArrays {

}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int start = 0;
        int end = r*c - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            int midRow = mid / c;
            int midCol = mid % c;
            if(matrix[midRow][midCol] == target) {
                return true;
            }
            else if(matrix[midRow][midCol] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return false;
    }
}
