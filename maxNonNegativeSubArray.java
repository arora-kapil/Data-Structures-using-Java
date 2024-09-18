package leetCodeProblems;

/*Given an array of integers, A of length N, find out the maximum sum sub-array of non negative numbers from A.

The sub-array should be contiguous i.e., a sub-array created by choosing the second and fourth element and skipping the third element is invalid.

Maximum sub-array is defined in terms of the sum of the elements in the sub-array.

Find and return the required subarray.*/

public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        long max = -1;
        long maxTillHere = 0;
        int start = 0;
        int end = 0;
        int s = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0 ; i < A.size() ; i++) {
            int num = A.get(i);
            
            if (num < 0) {
                s = i + 1;
                maxTillHere = 0; // Reset the sum when encountering a negative number
            } else {
                maxTillHere += num;
            }
            
            // Check if the current sum is greater than the max or if sums are equal, prefer the longer subarray
            if (maxTillHere > max || (maxTillHere == max && (i - s > end - start))) {
                max = maxTillHere; // Update max
                start = s;         // Update the start of the best subarray
                end = i;           // Update the end of the best subarray
            }
        }
        
        // Collect elements from start to end (inclusive)
        for (int i = start; i <= end; i++) {
            ans.add(A.get(i));
        }
        
        return ans;
    }
}
