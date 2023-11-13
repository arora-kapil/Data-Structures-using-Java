package dynamicProgramming;

public class maximumSumOfNonAdjacentElements3 {

}

//Tabuation

import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
		//int n = nums.size();
		//int ans = solve(nums, n-1);
		
		return solve(nums);
	}

	public static int solve(ArrayList<Integer> nums) {
		int n = nums.size();
		int[] dp = new int[n];
		for(int i = 0 ; i < n ; i++) {
			dp[i] = 0;
		}

		dp[0] = nums.get(0);

		for(int i = 1 ; i < n ; i++) {
			int incl = dp[i-2] + nums.get(i);
			int excl = dp[i-1];
			dp[i] = Math.max(incl, excl);
		}

		return dp[n-1];
	}
}
