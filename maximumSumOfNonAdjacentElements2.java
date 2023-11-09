package dynamicProgramming;

public class maximumSumOfNonAdjacentElements2 {

}

//Recursion + Memoisation

import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
		int n = nums.size();
		//int ans = solve(nums, n-1);
		int[] dp = new int[n+1];
		for(int i = 0 ; i < n+1 ; i++) {
			dp[i] = -1;
		}

		return solve(nums, n-1, dp);
	}

	public static int solve(ArrayList<Integer> nums, int n, int[] dp) {
		if(n < 0) {
			return 0;
		}

		if(n == 0) {
			return nums.get(0);
		}

		if(dp[n] != -1) {
			return dp[n];
		}

		int incl = solve(nums, n-2, dp) + nums.get(n);
		int excl = solve(nums, n-1, dp);

		dp[n] = Math.max(incl, excl);
		return dp[n];
	}
}
