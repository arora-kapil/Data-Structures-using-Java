package dynamicProgramming;

public class cutIntoSegments {

}

//https://www.codingninjas.com/studio/problems/cut-into-segments_1214651?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar
//Using Recursion

import java.util.*;
public class Solution {
    public static int cutSegments(int n, int x, int y, int z) {
        // Write your code here.

        int ans = solve(n, x, y, z);
        if(ans < 0) {
            ans = 0;
        }

        return ans;
    }

    public static int solve(int n, int x, int y, int z) {
        if(n == 0) {
            return 0;
        }

        if(n < 0) {
            return Integer.MIN_VALUE;
        }

        int a = solve(n - x, x, y, z) + 1;
        int b = solve(n - y, x, y, z) + 1;
        int c = solve(n - z, x, y, z) + 1;

        return Math.max(a, Math.max(b, c));

    }
}
