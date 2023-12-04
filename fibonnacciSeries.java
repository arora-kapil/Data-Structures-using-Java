package dynamicProgramming;
//https://www.codingninjas.com/studio/problems/nth-fibonacci-number_74156?leftPanelTab=0&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar
public class fibonnacciSeries {

}

//Top-Down Approach

import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[] dp = new int[n+1];
		for(int i = 0 ; i < n + 1 ; i++) {
			dp[i] = -1;
		}
		
		System.out.println(fib(n, dp));
	}

	public static int fib(int n, int[] dp) {
		//base case
		if(n <= 1) {
			return n;
		}

		if(dp[n] != -1) {
			return dp[n];
		}

		dp[n] = fib(n-1, dp) + fib(n-2, dp);
		return dp[n];
	}

}

