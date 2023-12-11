package dynamicProgramming;

public class countDerangements4 {

}

//Using Space Opimisation

public class Solution {

	public static long MOD = 1000000007;
	
	public static long countDerangements(int n) {
		// Write your code here.

		return solve(n);
	}

	public static long solve(int n) {
		long[] dp = new long[n+1];

		long prev2 = 0;
		long prev1 = 1;


		for(int i = 3 ; i <= n ; i++) {
			long first = prev1 % MOD;
			long second = prev2 % MOD;
			long sum = (first + second) % MOD;
			prev2 = prev1;
			prev1 = ((i-1) * sum) % MOD;
		}
		
		return prev1;
	}
}
