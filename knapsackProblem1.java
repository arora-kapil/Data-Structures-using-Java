package dynamicProgramming;

public class knapsackProblem1 {

}

//Brute Force Approach
//https://www.codingninjas.com/studio/problems/0-1-knapsack_920542?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar

import java.util.* ;
import java.io.*; 

public class Solution{
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        return solve(weight, value, n-1, maxWeight);

    }

    public static int solve(int[] weight, int[] value, int index, int capacity) {
        //base case
        if(index == 0) {
            if(weight[0] <= capacity) {
                return value[0];
            }
            else {
                return 0;
            }
        }

        int include = 0;
        if(weight[index] <= capacity) {
            include = value[index] + solve(weight, value, index-1, capacity - weight[index]);
        }
        
        int exclude = 0 + solve(weight, value, index - 1, capacity);

        int ans = Math.max(exclude, include);
        return ans;
    }
}

