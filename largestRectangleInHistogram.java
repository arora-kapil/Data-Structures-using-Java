package stack;
//https://leetcode.com/problems/largest-rectangle-in-histogram/submissions/
public class largestRectangleInHistogram {

}

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int[] next = new int[n];
        int[] prev = new int[n];
        int area = Integer.MIN_VALUE;

        next = nextSmallerElement(heights, n);
        prev = prevSmallerElement(heights, n);

        for(int i = 0 ; i < n ; i++) {
            int length = heights[i];

            if(next[i] == -1) {
                next[i] = n;
            }

            int breadth = next[i] - prev[i] - 1;

            int newArea = length*breadth;
            area = Math.max(area, newArea);
        }

        return area;
    }

    public static int[] nextSmallerElement(int[] arr, int n) {
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();

        s.push(-1);

        for(int i = n-1 ; i >= 0 ; i--) {
            int el = arr[i];

            while(s.peek() != -1 && arr[s.peek()] >= el) {
                s.pop();
            }

            ans[i] = s.peek();
            s.push(i);
        }

        //Collections.reverse(ans);
        return ans;
    }

       public static int[] prevSmallerElement(int[] arr, int n) {
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();

        s.push(-1);

        for(int i = 0 ; i < n ; i++) {
            int el = arr[i];

            while(s.peek() != -1 && arr[s.peek()] >= el) {
                s.pop();
            }

            ans[i] = s.peek();
            s.push(i);
        }

        //Collections.reverse(ans);
        return ans;
    }
}
