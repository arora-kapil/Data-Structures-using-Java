
public class spiralMatrix {

}

import java.util.ArrayList;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int row = matrix.length;

        if(row == 0) {
            return list;
        }

        int col = matrix[0].length;

        int top = 0, bottom = row-1, left = 0, right = col-1, direction = 0;

        while((top <= bottom) && (left <= right)) {
            if(direction == 0) {
                for(int i = left ; i <= right ; i++) {
                    list.add(matrix[top][i]);
                }
                top++;
                direction = 1;
            }
            else if(direction == 1) {
                for(int i = top ; i <= bottom ; i++) {
                    list.add(matrix[i][right]);
                }
                right--;
                direction = 2;
            }
            else if(direction == 2) {
                for(int i = right ; i >= left ; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
                direction = 3;
            }
            else if(direction == 3) {
                for(int i = bottom ; i >= top ; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
                direction = 0;
            }
        }

        return list;
    }
}