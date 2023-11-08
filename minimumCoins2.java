package dynamicProgramming;

public class minimumCoins2 {

}

//Top-Down Approach

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minimumElements(int num[], int x) {
        // Write your code here..
        int[] dp = new int[x + 1];
        for(int i = 0 ; i < x+1 ; i++) {
            dp[i] = -1;
        }

        int ans = solve(num, x, dp);
        if(ans == Integer.MAX_VALUE) {
            return -1;
        }
        else {
            return ans;
        }
    }

    public static int solve(int[] num, int x, int[] dp) {
        if(x == 0) {
            return 0;
        }

        if(x < 0) {
            return Integer.MAX_VALUE;
        }

        int mini = Integer.MAX_VALUE;

        if(dp[x] != -1) {
            return dp[x];
        }

        for(int i = 0 ; i < num.length ; i++) {
            int ans = solve(num, x - num[i], dp);

            if(ans != Integer.MAX_VALUE) {
                mini = Math.min(mini, 1+ans);
            }
        }

        dp[x] = mini;

        return mini;
    }

}
