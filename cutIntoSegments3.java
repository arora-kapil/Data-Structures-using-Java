package dynamicProgramming;

public class cutIntoSegments3 {

}

//Tabulation

import java.util.*;
public class Solution {
    public static int cutSegments(int n, int x, int y, int z) {
        // Write your code here.

        return solve(n, x, y, z);
    }

    public static int solve(int n, int x, int y, int z) {
        int[] dp = new int[n+1];
        for(int i = 0 ; i < n+1 ; i++) {
            dp[i] = Integer.MIN_VALUE;
        }

        dp[0] = 0;

        for(int i = 1 ; i <= n ; i++) {
            if(i-x >= 0) {
                dp[i] = Math.max(dp[i], dp[i-x] + 1);
            }
            if(i-y >= 0) {
                dp[i] = Math.max(dp[i], dp[i-y] + 1);
            }
            if(i-z >= 0) {
                dp[i] = Math.max(dp[i], dp[i-z] + 1);
            }
        }

        if(dp[n] < 0) {
            return 0;
        }

        return dp[n];

    }
}
