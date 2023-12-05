package dynamicProgramming;

public class fibbonnacci2 {

}

//Bottom-UP Approach

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
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2 ; i < n+1 ; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}

		System.out.println(dp[n]);
	}
}

