package dynamicProgramming;

public class cutIntoSegments2 {

}

//Using Memoisation

import java.util.*;
public class Solution {
    public static int cutSegments(int n, int x, int y, int z) {
        // Write your code here.

        int[] dp = new int[n+1];
        for(int i = 0 ; i < n+1 ; i++) {
            dp[i] = -1;
        }

        return Math.max(0, solve(n, x, y, z, dp));
    }

    public static int solve(int n, int x, int y, int z, int[] dp) {
        if(n == 0) {
            return 0;
        }

        if(n < 0) {
            return Integer.MIN_VALUE;
        }

        if(dp[n] != -1) {
            return dp[n];
        }

        int a = solve(n - x, x, y, z, dp) + 1;
        int b = solve(n - y, x, y, z, dp) + 1;
        int c = solve(n - z, x, y, z, dp) + 1;

        dp[n] = Math.max(a, Math.max(b, c));

        return dp[n];

    }
}
