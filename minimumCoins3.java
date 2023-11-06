package dynamicProgramming;

public class minimumCoins3 {

}

//Bottom-UP Approach

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minimumElements(int num[], int x) {
        // Write your code here..
        return solve(num, x);
    }

    public static int solve(int[] num, int x) {
        int[] dp = new int[x + 1];
        for(int i = 0 ; i < x+1 ; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;

        for(int i = 1 ; i <= x ; i++) {
            for(int j = 0 ; j < num.length ; j++) {
                if(i-num[j] >= 0 && dp[i-num[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i-num[j]]);
                }
            }
        }

        if(dp[x] == Integer.MAX_VALUE) {
            return -1;
        }

        return dp[x];
    }

}
