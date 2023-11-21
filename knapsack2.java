package dynamicProgramming;

public class knapsack2 {

}

//Recursion + Memoisation

import java.util.* ;
import java.io.*; 

public class Solution{
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        //return solve(weight, value, n-1, maxWeight);
        int[][] dp = new int[n+1][maxWeight + 1];
        for(int i = 0 ; i < n+1 ; i++) {
            for(int j = 0 ; j < maxWeight + 1 ; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(weight, value, n-1, maxWeight, dp);

    }

    public static int solve(int[] weight, int[] value, int index, int capacity, int[][] dp) {
        //base case
        if(index == 0) {
            if(weight[0] <= capacity) {
                return value[0];
            }
            else {
                return 0;
            }
        }

        if(dp[index][capacity] != -1) {
            return dp[index][capacity];
        }

        int include = 0;
        if(weight[index] <= capacity) {
            include = value[index] + solve(weight, value, index-1, capacity - weight[index], dp);
        }
        
        int exclude = 0 + solve(weight, value, index - 1, capacity, dp);

        dp[index][capacity] = Math.max(exclude, include);
        return dp[index][capacity];
    }
}
